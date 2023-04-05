package com.example.springbootsample;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {

    @GetMapping("/hoge")
    public String hoge(@RequestParam(value = "param", required = true) String value) {
        return "値は" + value + "です";
    }


}
