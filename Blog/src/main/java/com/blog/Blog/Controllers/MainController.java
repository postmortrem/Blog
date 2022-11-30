package com.blog.Blog.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home page");
        return "home";
    }
    @GetMapping("/about")
    public String support(Model model) {
        model.addAttribute("title", "Help page");
        return "aboutPage";
    }

}