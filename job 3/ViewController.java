package com.example.jour2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.jour2.model.Personne;

@Controller
public class ViewController {
    
    @GetMapping("/view")
    public String showView(Model model) {
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Nadjla", 22));
        personnes.add(new Personne("Jamal", 22));
        personnes.add(new Personne("Olivia", 42));

        model.addAttribute("personnes", personnes);
        return "view";
    }
}
