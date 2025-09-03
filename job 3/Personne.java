package com.example.jour2.model;

public class Personne {
    private String nom;
    private int age;

    public Personne (String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    public String getNom() {
        return nom;
    }
    public int getAge() {
        return age;
    }
}
