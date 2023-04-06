package com.example.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RandamController {
    @GetMapping("/randam")
    public String write(Model model){
        double rand = Math.floor(Math.random()*2);
        if (rand == 0) {
            model.addAttribute("message", "hogehoge");
        }else if (rand == 1){
            model.addAttribute("message", "fugafuga");
        }

        return "test";
    }
}
