/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioum;

/**
 *
 * @author Rafael.Evaristo
 */


import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercicioum {
    
     public static void main(String[] args) {
        // Criar instâncias
        BebidaAlc cerveja = new BebidaAlc("Cerveja", 150, 5.0, 330, 5.0);
        Agua aguaMineral = new Agua("Água Mineral", 0, 2.0, 500, 7.0);
        Sumo sucoLaranja = new Sumo("Suco de Laranja", 100, 3.5, 250, Arrays.asList("Laranja"));

        // Exibir informações graficamente
        JOptionPane.showMessageDialog(null, cerveja.toString());
        JOptionPane.showMessageDialog(null, aguaMineral.toString());
        JOptionPane.showMessageDialog(null, sucoLaranja.toString());
    }
}
