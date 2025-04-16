package com.exercicio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flores")
public class Flor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String especie;
    private String cor;
    private double altura;

    public Flor() {}
    
    public Flor(String especie, String cor, double altura) {
        this.especie = especie;
        this.cor = cor;
        this.altura = altura;
    }
}