package ru.project_euler.my_site.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.project_euler.my_site.models.Post;
import ru.project_euler.my_site.repo.PostRepository;

@Controller
public class ProjectEulerController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/project-euler-roadmap")
    public String projectEuler(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "projectEuler";
    }

}
