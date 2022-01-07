package hust.project.student.controller;

import hust.project.student.entity.Grade;
import hust.project.student.entity.Institute;
import hust.project.student.service.GradeService;
import hust.project.student.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GradeController {
    @Autowired
    private GradeService gradeService;
    @Autowired
    private InstituteService institudeService;

    @GetMapping("/lop")
    public String showList(ModelMap model) {
        List<Grade> grades = gradeService.findAll();
        model.addAttribute("grades", grades);
        return "html/grade/list";
    }

    @GetMapping("lop/them")
    public String add(ModelMap model) {
        List<Institute> ins = institudeService.findAll();
        model.addAttribute("ins", ins);
        return "html/grade/create";
    }

    @GetMapping("lop/sua")
    public String edit(@RequestParam("id") Long id, ModelMap model) {
        Grade grade = gradeService.findGradeById(id).get();
        model.addAttribute("grade", grade);
        List<Institute> ins = institudeService.findAll();
        model.addAttribute("ins", ins);
        return "html/grade/edit";
    }

    @PostMapping("lop/luu")
    public String save(@RequestParam("id") int id, @RequestParam("code") String code, @RequestParam("name") String name,@RequestParam("institute_id") Long institute_id, @RequestParam("desc") String desc, ModelMap model) {
        Institute in = institudeService.findInstituteById(institute_id).get();
        System.out.println(in.getId());
        Grade grade = new Grade(id, code, name, in, desc);
        gradeService.saveGrade(grade);
        return "redirect:/lop";
    }

    @GetMapping("lop/xoa")
    public String delete(@RequestParam("id") Long id, ModelMap model) {
        gradeService.deleteGrade(id);
        return "redirect:/lop";
    }
}
