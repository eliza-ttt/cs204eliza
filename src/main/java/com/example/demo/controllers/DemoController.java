package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Generated;

@Controller
public class DemoController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
