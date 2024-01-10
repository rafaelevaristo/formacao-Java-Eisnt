/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciotres;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael.Evaristo
 */

public class MenuDePratos {
    
    private List<Prato> pratos;

    public MenuDePratos() {
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        this.pratos.add(prato);
        System.out.println("Prato adicionado ao menu: " + prato.getNome());
    }

    public void removerPrato(Prato prato) {
        if (this.pratos.remove(prato)) {
            System.out.println("Prato removido do menu: " + prato.getNome());
        } else {
            System.out.println("O prato não está no menu.");
        }
    }

    public void listarPratos() {
        System.out.println("----- Menu de Pratos -----");
        for (Prato prato : this.pratos) {
            System.out.println( prato.toString() );
        }
        System.out.println("--------------------------");
    }
}
