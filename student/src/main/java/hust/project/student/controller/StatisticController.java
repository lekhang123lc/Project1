package hust.project.student.controller;

import hust.project.student.entity.Result;
import hust.project.student.entity.Statistic;
import hust.project.student.entity.Subject;
import hust.project.student.service.ResultService;
import hust.project.student.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StatisticController {
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private ResultService resultService;

    @GetMapping("/thong-ke")
    public String showList(ModelMap model, @RequestParam(defaultValue="0") long subject_id, @RequestParam(defaultValue="0") long semester) {
        List<Subject> subjects = subjectService.findAll();
        model.addAttribute("subjects", subjects);
        Statistic s = new Statistic();
        s.setSubject_id(1);
        if ( subject_id != 0 && semester != 0 ) {
            List<Result> r = resultService.findBySubjectAndSemester(subject_id, semester);
            s.addResult(r);
            s.setSemester(semester);
            s.setSubject_id(subject_id);
        }
        model.addAttribute("s", s);
        
        return "html/statistic/list";
    }
}
