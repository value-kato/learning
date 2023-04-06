package com.example.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController3 {

    @GetMapping("/public3")
    public String wirte(Model model){
        model.addAttribute("message" , "Hello World3!");
        return "public3";
    }
}
