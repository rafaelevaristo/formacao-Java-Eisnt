/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioum;

/**
 *
 * @author Rafael.Evaristo
 */
// Subclasse Agua
public class Agua extends Bebida {
    private double nivelPH;

    // Construtor
    public Agua(String nome, int numCalorias, double preco, int volumeMl, double nivelPH) {
        super(nome, numCalorias, preco, volumeMl);
        this.nivelPH = nivelPH;
    }

    // Getter e Setter específico
    public double getNivelPH() {
        return nivelPH;
    }

    public void setNivelPH(double nivelPH) {
        this.nivelPH = nivelPH;
    }

    // Sobrescrever toString para incluir informações da subclasse
    @Override
    public String toString() {
        return super.toString() + ", nivelPH=" + nivelPH;
    }
}

