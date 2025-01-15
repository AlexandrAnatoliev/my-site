package ru.project_euler.my_site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectEulerController {
    @GetMapping("/project-euler-roadmap")
    public String projectEuler(Model model) {
        return "projectEuler";
    }

}
