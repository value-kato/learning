package com.example.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PresidentController {

    @GetMapping("/president")
    public String write1(Model model) {
        model.addAttribute("first_name", "Masao");
        model.addAttribute("last_name", "Urano");
        return "president";
    }
}
