package com.example.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class PutController {

    @PutMapping("/put")
    public String curl(Model model){
        model.addAttribute("message" , "PUT ACCESS");
        return "put";

    }
}
