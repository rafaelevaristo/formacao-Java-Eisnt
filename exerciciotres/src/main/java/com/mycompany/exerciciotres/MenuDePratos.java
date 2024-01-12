/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciotres;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rafael.Evaristo
 */

public class MenuDePratos {
    
    private HashMap<String, Prato> pratos;

    public MenuDePratos() {
        this.pratos = new HashMap<>();
    }

    public void adicionarPrato(Prato prato) {
        this.pratos.put(prato.getNome(), prato);
        System.out.println("Prato adicionado ao menu: " + prato.getNome());
    }

    public Boolean removerPrato(Prato prato) {
        if (this.pratos.remove(prato.getNome(), prato)) {
            System.out.println("Prato removido do menu: " + prato.getNome());
            return true;
            
        } else {
            System.out.println("O prato não está no menu.");            
        }        
        return false;
    }
    
    public HashMap<String, Prato> GetPratos() {
        return this.pratos;
    }

    
    
}
