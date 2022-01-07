package hust.project.student.controller;

import hust.project.student.entity.Student;
import hust.project.student.entity.Grade;
import hust.project.student.entity.Semester;
import hust.project.student.service.ExcelStudentServiceTmpl;
import hust.project.student.service.StudentService;
import hust.project.student.service.GradeService;
import hust.project.student.service.SemesterService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private GradeService gradeService;
    @Autowired
    private SemesterService semesterService;
    @Autowired
    private ExcelStudentServiceTmpl excelService;

    @GetMapping("/")
    public String showHome(ModelMap model, @RequestParam(defaultValue="") String name) {
        List<Student> students = studentService.findByName(name);
        model.addAttribute("students", students);
        model.addAttribute("name", name);
        return "html/student/list";
    }

    @GetMapping("/sinh-vien")
    public String showList(ModelMap model, @RequestParam(defaultValue="") String name) {
        List<Student> students = studentService.findByName(name);
        model.addAttribute("students", students);
        model.addAttribute("name", name);
        return "html/student/list";
    }

    @GetMapping("sinh-vien/them")
    public String add(ModelMap model) {
        List<Grade> grades = gradeService.findAll();
        model.addAttribute("grades", grades);
        return "html/student/create";
    }

    @PostMapping(value="sinh-vien/them-danh-sach")
    public String importList(ModelMap model,@RequestParam("file") MultipartFile file) throws IOException {
        List<Student> students = excelService.excelToList(file);
        studentService.saveListStudent(students);
        return "redirect:/sinh-vien";
    }

    @GetMapping("sinh-vien/xuat-danh-sach")
    public void exportList(HttpServletResponse response) throws IOException {
		List<Student> students = studentService.findAll();
        ByteArrayInputStream byteArrayInputStream = excelService.writeList(students);
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=sinhvien.xlsx");
        IOUtils.copy(byteArrayInputStream, response.getOutputStream());
	}

    @GetMapping("sinh-vien/sua")
    public String edit(@RequestParam("id") Long id, ModelMap model) {
        Student student = studentService.findStudentById(id).get();
        model.addAttribute("student", student);
        List<Grade> grades = gradeService.findAll();
        model.addAttribute("grades", grades);
        List<Semester> semesters = semesterService.findByStudent(id);
        model.addAttribute("semesters", semesters);
        Double cpa=semesterService.calcCPA(semesters);
        model.addAttribute("cpa", cpa);
        return "html/student/edit";
    }

    @PostMapping("sinh-vien/luu")
    public String save(@RequestParam("id") long id, @RequestParam("name") String name, @RequestParam("birth") String birth, @RequestParam("grade_id") Long grade_id, @RequestParam("year") int year, @RequestParam("email") String email, @RequestParam("gender") int gender, ModelMap model) {
//        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
//        String birthday = formatter.format(birth);
        Grade grade = gradeService.findGradeById(grade_id).get();
        Student student = new Student(id, name, birth, grade, year, email, gender);
        studentService.saveStudent(student);
        return "redirect:/sinh-vien";
    }

    @GetMapping("sinh-vien/xoa")
    public String delete(@RequestParam("id") Long id, ModelMap model) {
        studentService.deleteStudent(id);
        return "redirect:/sinh-vien";
    }
}
