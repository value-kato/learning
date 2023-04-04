package com.example.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RandamController {


    @GetMapping("/randam")
    public String write(Model model){
        model.addAttribute("message", "hogehoge");
        return "hello";
    }
}
