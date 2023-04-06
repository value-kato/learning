package com.example.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;

@Controller
public class DeleteController {

    @DeleteMapping("/delete")
    public String  curl(Model model){
        model.addAttribute("message" , "DELETE ACCESS");
        return "delete";
    }
}
