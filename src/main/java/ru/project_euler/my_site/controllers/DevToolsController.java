package ru.project_euler.my_site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DevToolsController {
    @GetMapping("/devtools")
    public String devtools(Model model) {
        return "devTools";
    }

}
