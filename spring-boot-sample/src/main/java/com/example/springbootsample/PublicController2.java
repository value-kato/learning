package com.example.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController2 {

    @GetMapping("/public2")
    public String wirte(Model model){
        model.addAttribute("message" , "Hello World2!");
        return "public2";
    }


}
