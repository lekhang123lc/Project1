package hust.project.controller;

import hust.project.service.ExecuteCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ManageController {
    @Autowired
    private ExecuteCodeService ex;

    @GetMapping("/")
    public String showHome(ModelMap model) {
        model.addAttribute("week", 0);
        model.addAttribute("id", 0);
        model.addAttribute("input", "");
        model.addAttribute("output", "");
        return "index";
    }

    @PostMapping("/")
    public String execute(ModelMap model, @RequestParam("week") int week, @RequestParam("id") int id, @RequestParam("input") String input){
        String output = ex.execute(week, id, input);
        model.addAttribute("week", week);
        model.addAttribute("id", id);
        model.addAttribute("input", input);
        model.addAttribute("output", output);
        return "index";
    }

}
