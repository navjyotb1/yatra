package com.example.yatra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
public class visa {
    @GetMapping("/myvisa")
    public String getData(){
        return "Please submit your visa applications here as soon as possible";
    }
}
