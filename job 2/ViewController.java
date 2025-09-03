package com.example.jour2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    
    @GetMapping("/view")
    public String showView(Model model) {
        model.addAttribute("message", "Salut depuis Thymeleaf ! ");
        return "view";
    }
}
