package com.example.untoldpsproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping("/index")
    public String showStartPage() {
        return "index";
    }
}
