package com.example.yatra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class Cab {
    @GetMapping("/myCab")
    public String getData(){
        return "Please book your cab or cycle Here";
    }
}
