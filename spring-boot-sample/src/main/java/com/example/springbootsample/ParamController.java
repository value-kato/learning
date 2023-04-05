package com.example.springbootsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {
    @GetMapping("/hoge")
    public String hoge(@RequestParam("param") String value){
        return value;
    }
}
