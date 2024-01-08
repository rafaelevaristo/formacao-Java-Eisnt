/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioum;

/**
 *
 * @author Rafael.Evaristo
 */
// Subclasse BebidaAlc
public class BebidaAlc extends Bebida {
    private double grauAlcool;

    // Construtor
    public BebidaAlc(String nome, int numCalorias, double preco, int volumeMl, double grauAlcool) {
        super(nome, numCalorias, preco, volumeMl);
        this.grauAlcool = grauAlcool;
    }

    // Getter e Setter específico
    public double getGrauAlcool() {
        return grauAlcool;
    }

    public void setGrauAlcool(double grauAlcool) {
        this.grauAlcool = grauAlcool;
    }

    // Sobrescrever toString para incluir informações da subclasse
    @Override
    public String toString() {
        return super.toString() + ", grauAlcool=" + grauAlcool;
    }
}