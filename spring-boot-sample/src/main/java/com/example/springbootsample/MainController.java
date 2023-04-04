package com.example.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/test1")
    public String write1(Model model) {
        model.addAttribute("message", "hello world2!");
        return "hello";
    }
}