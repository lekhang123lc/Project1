package hust.project.student.controller;

import hust.project.student.entity.Result;
import hust.project.student.entity.Subject;
import hust.project.student.entity.Student;
import hust.project.student.service.ExcelResultServiceTmpl;
import hust.project.student.service.ResultService;
import hust.project.student.service.StudentService;
import hust.project.student.service.SubjectService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
public class ResultController {
    @Autowired
    private ResultService resultService;
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private ExcelResultServiceTmpl excelService;

    @GetMapping("/ket-qua")
    public String showList(ModelMap model, @RequestParam("subject_id") Long subject_id) {
        List<Result> results = resultService.findBySubject(subject_id);
        model.addAttribute("results", results);
        Subject subject = subjectService.findSubjectById(subject_id).get();
        model.addAttribute("subject", subject);
        return "html/result/list";
    }

    @PostMapping("ket-qua/them-danh-sach")
    public String importList(ModelMap model, @RequestParam("file") MultipartFile file, @RequestParam("subject_id") Long subject_id) throws IOException, IOException {
        List<Result> r = excelService.excelToList(file);
        resultService.saveListResult(r);
        return "redirect:/ket-qua?subject_id="+subject_id;
    }

    @GetMapping("ket-qua/xuat-danh-sach")
    public void exportList(HttpServletResponse response, @RequestParam("subject_id") Long subject_id) throws IOException {
		List<Result> results = resultService.findBySubject(subject_id);
        ByteArrayInputStream byteArrayInputStream = excelService.writeList(results);
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=ketqua.xlsx");
        IOUtils.copy(byteArrayInputStream, response.getOutputStream());
	}

    @GetMapping("ket-qua/them")
    public String add(ModelMap model, @RequestParam("subject_id") Long subject_id) {
        Subject subject = subjectService.findSubjectById(subject_id).get();
        model.addAttribute("subject", subject);
        return "html/result/create";
    }

    @GetMapping("ket-qua/sua")
    public String edit(@RequestParam("id") Long id, @RequestParam("subject_id") Long subject_id, ModelMap model) {
        Result result = resultService.findResultById(id).get();
        model.addAttribute("result", result);
        Subject subject = subjectService.findSubjectById(subject_id).get();
        model.addAttribute("subject", subject);
        return "html/result/edit";
    }

    @PostMapping("ket-qua/luu")
    public String save(@RequestParam("id") long id, @RequestParam("student_id") long student_id, @RequestParam("subject_id") Long subject_id, @RequestParam("semester") int semester, @RequestParam(defaultValue="-1") Double process_result, @RequestParam(defaultValue="-1") Double final_result, ModelMap model) {
        Student student = studentService.findStudentById(student_id).get();
        Subject subject = subjectService.findSubjectById(subject_id).get();
        Result result = new Result(id, student, subject, semester);
        if ( process_result != -1 ) result.setProcess_result(process_result);
        if ( final_result != -1 ) result.setFinal_result(final_result);
        if ( final_result != -1 && process_result != -1 ) result.calcSummary();
        resultService.saveResult(result);
        return "redirect:/ket-qua?subject_id="+subject_id;
    }

    @GetMapping("ket-qua/xoa")
    public String delete(@RequestParam("id") Long id, @RequestParam("subject_id") Long subject_id, ModelMap model) {
        resultService.deleteResult(id);
        return "redirect:/ket-qua?subject_id="+subject_id;
    }
}
