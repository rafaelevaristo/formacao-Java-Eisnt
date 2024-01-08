/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioum;

import java.util.List;

/**
 *
 * @author Rafael.Evaristo
 */
// Subclasse Sumo
public class Sumo extends Bebida {
    private List<String> frutas;

    // Construtor
    public Sumo(String nome, int numCalorias, double preco, int volumeMl, List<String> frutas) {
        super(nome, numCalorias, preco, volumeMl);
        this.frutas = frutas;
    }

    // Getter e Setter específico
    public List<String> getFrutas() {
        return frutas;
    }

    public void setFrutas(List<String> frutas) {
        this.frutas = frutas;
    }

    // Sobrescrever toString para incluir informações da subclasse
    @Override
    public String toString() {
        return super.toString() + ", frutas=" + frutas;
    }
}