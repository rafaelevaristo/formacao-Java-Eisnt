/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioum;

/**
 *
 * @author Rafael.Evaristo
 */
// Superclasse Bebida
public class Bebida {
    private String nome;
    private int numCalorias;
    private double preco;
    private int volumeMl;

    // Construtor
    public Bebida(String nome, int numCalorias, double preco, int volumeMl) {
        this.nome = nome;
        this.numCalorias = numCalorias;
        this.preco = preco;
        this.volumeMl = volumeMl;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumCalorias() {
        return numCalorias;
    }

    public void setNumCalorias(int numCalorias) {
        this.numCalorias = numCalorias;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public void setVolumeMl(int volumeMl) {
        this.volumeMl = volumeMl;
    }

    // Método toString
    @Override
    public String toString() {
        return "Bebida [nome=" + nome + ", numCalorias=" + numCalorias + ", preco=" + preco + ", volumeMl=" + volumeMl + "]";
    }
}