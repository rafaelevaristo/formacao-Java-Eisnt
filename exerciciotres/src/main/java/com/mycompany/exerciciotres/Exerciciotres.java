/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciotres;

/**
 *
 * @author Rafael.Evaristo
 */
public class Exerciciotres {

    
    public static void main(String[] args) {
        // Exemplo de utilização da classe Menu com a classe Prato
        MenuDePratos menu = new MenuDePratos();

        Prato prato1 = new Prato("Frango Grelhado", "Contemporânea", "Prato Principal", 300);
        Prato prato2 = new Prato("Massa Carbonara", "Italiana", "Prato Principal", 500);

        menu.adicionarPrato(prato1);
        menu.adicionarPrato(prato2);

        menu.listarPratos();

        menu.removerPrato(prato1);

        menu.listarPratos();
    }
}
