package hust.project.student.controller;

import hust.project.student.entity.Institute;
import hust.project.student.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class InstituteController {
    @Autowired
    private InstituteService institudeService;

    @GetMapping("/khoa-vien")
    public String showList(ModelMap model) {
        List<Institute> ins = institudeService.findAll();
        model.addAttribute("ins", ins);
        return "html/institude/list";
    }

    @GetMapping("khoa-vien/them")
    public String add(ModelMap model) {
        return "html/institude/create";
    }

    @GetMapping("khoa-vien/sua")
    public String edit(@RequestParam("id") Long id, ModelMap model) {
        Institute in = institudeService.findInstituteById(id).get();
        model.addAttribute("in", in);
        return "html/institude/edit";
    }

    @PostMapping("khoa-vien/luu")
    public String save(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("desc") String desc, ModelMap model) {
        Institute in = new Institute(id, name, desc);
        institudeService.saveInstitute(in);
        return "redirect:/khoa-vien";
    }

    @GetMapping("khoa-vien/xoa")
    public String delete(@RequestParam("id") Long id, ModelMap model) {
        institudeService.deleteInstitute(id);
        return "redirect:/khoa-vien";
    }

}
