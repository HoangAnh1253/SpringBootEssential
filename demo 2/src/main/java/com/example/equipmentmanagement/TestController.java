package com.example.equipmentmanagement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greeting1")
public class TestController {

    @GetMapping
    public String getGreeting(){
        return "greeting";
    }
}
