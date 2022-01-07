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

import hust.project.student.entity.Result;
import hust.project.student.entity.Student;
import hust.project.student.entity.Subject;
import hust.project.student.repository.ResultRepository;
import hust.project.student.repository.StudentRepository;
import hust.project.student.repository.SubjectRepository;
import hust.project.student.service.ExcelService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ExcelResultServiceTmpl extends ExcelService {
    //private String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    private String[] HEADERS = { "MSSV", "Họ và tên", "Mã môn", "Môn", "Điểm giữa kỳ", "Điểm cuối kỳ", "Kỳ học" };
    private String SHEET = "Sheet1";
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private ResultRepository resultRepository;

    public List<Result> excelToList(MultipartFile file) throws IOException {
        //System.out.println("file name: "+file.getOriginalFilename());
        InputStream is = file.getInputStream();
        try {
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheet(SHEET);
            Iterator<Row> rows = sheet.iterator();
            List<Result> results = new ArrayList<Result>();
            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();
                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();
                Result result = new Result();
                int cellIdx = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();
                    //private String[] HEADERS = { "MSSV", "Họ và tên", "Mã môn", "Môn", "Điểm giữa kỳ", "Điểm cuối kỳ", "Kỳ học" };
                    switch (cellIdx) {
                        case 0:
                            Student s = studentRepository.findById((long) currentCell.getNumericCellValue());
                            result.setStudent(s);
                            break;
                        case 1:
                            break;
                        case 2:
                            Subject subject = subjectRepository.findByCode(currentCell.getStringCellValue());
                            result.setSubject(subject);
                            break;
                        case 3:
                            break;
                        case 4:
                            result.setProcess_result(currentCell.getNumericCellValue());
                            break;
                        case 5:
                            result.setFinal_result(currentCell.getNumericCellValue());
                            break;
                        case 6:
                            result.setSemester((int)currentCell.getNumericCellValue());
                            break;

                        default:
                            break;
                    }
                    cellIdx++;
                }
                Long id = resultRepository.findStt(result.getStudent().getId(), result.getSubject().getId(), result.getSemester());
                if ( id == null ) id=(long)0;
                result.setId(id);
                results.add(result);
            }

            workbook.close();

            return results;} 
        catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }

    public ByteArrayInputStream writeList(List<Result> list){
        try(Workbook workbook = new XSSFWorkbook()){
			Sheet sheet = workbook.createSheet("Kết quả");
			
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
                Result r = list.get(i);
                //private String[] HEADERS = { "MSSV", "Họ và tên", "Mã môn", "Môn", "Điểm giữa kỳ", "Điểm cuối kỳ", "Kỳ học" };
	        	dataRow.createCell(0).setCellValue(r.getStudent().getId());
	        	dataRow.createCell(1).setCellValue(r.getStudent().getName());
	        	dataRow.createCell(2).setCellValue(r.getSubject().getCode());
	        	dataRow.createCell(3).setCellValue(r.getSubject().getName());
                dataRow.createCell(4).setCellValue(r.getProcess_result());
                dataRow.createCell(5).setCellValue(r.getFinal_result());
                dataRow.createCell(6).setCellValue(r.getSemester());
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