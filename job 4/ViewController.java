package com.example.jour2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.jour2.model.Personne;

@Controller
public class ViewController {

    @GetMapping("/view")
    public String showView(Model model) {
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Nadjla", "Benali"));
        personnes.add(new Personne("Jamal", "Kader"));
        personnes.add(new Personne("Olivia", "Martin"));

        model.addAttribute("personnes", personnes);
        return "view";
    }

    @PostMapping("/view")
    public String handleForm(@RequestParam("prenom") String prenom,
                             @RequestParam("nom") String nom,
                             Model model) {

        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Nadjla", "Benali"));
        personnes.add(new Personne("Jamal", "Kader"));
        personnes.add(new Personne("Olivia", "Martin"));

        model.addAttribute("personnes", personnes);
        model.addAttribute("message", "Bienvenue " + prenom + " " + nom + " !");
        return "view";
    }
}
