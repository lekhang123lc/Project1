package hust.project.student.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import hust.project.student.entity.Grade;
import hust.project.student.entity.Student;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ExcelStudentServiceTmpl extends ExcelService{
    //private String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    private String[] HEADERS = { "MSSV", "Họ và tên", "Mã lớp", "Lớp", "Khóa", "Email", "Giới tính" };
    private String SHEET = "Sheet1";

    public List<Student> excelToList(MultipartFile file) throws IOException {
        System.out.println("file name: "+file.getOriginalFilename());
        InputStream is = file.getInputStream();
        try {
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheet(SHEET);
            Iterator<Row> rows = sheet.iterator();
            List<Student> students = new ArrayList<Student>();
            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();
                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();
                Student student = new Student();
                int cellIdx = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();
                    switch (cellIdx) {
                        case 0:
                            student.setId((long) currentCell.getNumericCellValue());
                            break;
                        case 1:
                            student.setName(currentCell.getStringCellValue());
                            break;
                        case 2:
                            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = currentCell.getDateCellValue();
                            String brithday = df.format(date);
                            student.setBrith(brithday);
                            System.out.println("date: "+currentCell.getNumericCellValue()+" "+brithday);
                            break;
                        case 3:
                            Grade g = new Grade();
                            g.setCode(currentCell.getStringCellValue());
                            student.setGrade(g);
                            break;
                        case 5:
                            student.setYear((int)currentCell.getNumericCellValue());
                            break;
                        case 6:
                            student.setEmail(currentCell.getStringCellValue());
                            break;
                        case 7:
                            student.setGenderText(currentCell.getStringCellValue());
                            break;

                        default:
                            break;
                    }
                    cellIdx++;
                }

            students.add(student);
        }

        workbook.close();

        return students;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }

    public ByteArrayInputStream writeList(List<Student> list){
        try(Workbook workbook = new XSSFWorkbook()){
			Sheet sheet = workbook.createSheet("Sinh viên");
			
			Row row = sheet.createRow(0);
			
			// Define header cell style
	        CellStyle headerCellStyle = workbook.createCellStyle();
	        headerCellStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
	        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        
	        for(int i=0;i<HEADERS.length;i++){
                // Creating header cells 
                Cell cell = row.createCell(i);
                cell.setCellValue(HEADERS[i]);
                cell.setCellStyle(headerCellStyle);
            }
	        
	        // Creating data rows for each contact
	        for(int i = 0; i < list.size(); i++) {
	        	Row dataRow = sheet.createRow(i + 1);
                Student s = list.get(i);
                //private String[] HEADERS = { "MSSV", "Họ và tên", "Mã lớp", "Lớp", "Khóa", "Email", "Giới tính" };
	        	dataRow.createCell(0).setCellValue(s.getId());
	        	dataRow.createCell(1).setCellValue(s.getName());
	        	dataRow.createCell(2).setCellValue(s.getGrade().getId());
	        	dataRow.createCell(3).setCellValue(s.getGrade().getName());
                dataRow.createCell(4).setCellValue(s.getYear());
                dataRow.createCell(5).setCellValue(s.getEmail());
                dataRow.createCell(6).setCellValue(s.getGenderText());
	        }
	
	        // Making size of column auto resize to fit with data
            for(int i=0;i<HEADERS.length;i++){
	            sheet.autoSizeColumn(i);
            }
	        
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        workbook.write(outputStream);
	        return new ByteArrayInputStream(outputStream.toByteArray());
		} catch (IOException ex) {
			return null;
		}
    }
}