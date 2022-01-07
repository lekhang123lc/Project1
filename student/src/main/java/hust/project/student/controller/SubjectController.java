package hust.project.student.controller;

import hust.project.student.entity.Subject;
import hust.project.student.service.ResultService;
import hust.project.student.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private ResultService resultService;

    @GetMapping("/mon-hoc")
    public String showList(ModelMap model) {
        List<Subject> subjects = subjectService.findAll();
        model.addAttribute("subjects", subjects);
        return "html/subject/list";
    }

    @GetMapping("mon-hoc/them")
    public String add(ModelMap model) {
        return "html/subject/create";
    }

    @GetMapping("mon-hoc/sua")
    public String edit(@RequestParam("id") Long id, ModelMap model) {
        Subject subject = subjectService.findSubjectById(id).get();
        model.addAttribute("subject", subject);
        return "html/subject/edit";
    }

    @PostMapping("mon-hoc/luu")
    public String save(@RequestParam("id") long id, @RequestParam("code") String code, @RequestParam("name") String name, @RequestParam("process_weight") Double process_weight, @RequestParam("desc") String desc, @RequestParam("credit") int credit, ModelMap model) {
        Subject subject = new Subject(id, code, name, desc, process_weight, credit);
        subjectService.saveSubject(subject);
        return "redirect:/mon-hoc";
    }

    @GetMapping("mon-hoc/xoa")
    public String delete(@RequestParam("id") Long id, ModelMap model) {
        subjectService.deleteSubject(id);
        return "redirect:/mon-hoc";
    }

}
