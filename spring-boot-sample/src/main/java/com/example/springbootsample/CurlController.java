package com.example.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CurlController {

    @PostMapping("/post")
    public String curl(Model model){
        model.addAttribute("message","POST ACCESS");
        return "curl";
    }


}
