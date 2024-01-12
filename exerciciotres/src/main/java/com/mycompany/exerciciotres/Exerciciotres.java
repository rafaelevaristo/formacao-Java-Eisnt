/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciotres;

import java.util.List;

/**
 *
 * @author Rafael.Evaristo
 */
public class Exerciciotres {
   
    public static MenuDePratos ListaDePratos ;
    
    
    public static void main(String[] args) {


        ListaDePratos = BuildListaDePratos();
        
        
        new JanelaMenuInicial().setVisible(true);
        
        
//        new ListarPratos(listaPratos).setVisible(true);
//        
//        new MenuAdicionarPrato().setVisible(true);
//        
//        new MenuListarPrato().setVisible(true);
//        
//        new MenuModificarPrato().setVisible(true);
//        
//        new MenuApagarPrato().setVisible(true);
//        
        
//        // Exemplo de utilização da classe Menu com a classe Prato
//        MenuDePratos menu = new MenuDePratos();
//
//        Prato prato1 = new Prato("Frango Grelhado", "Contemporânea", "Prato Principal", 300);
//        Prato prato2 = new Prato("Massa Carbonara", "Italiana", "Prato Principal", 500);
//
//        menu.adicionarPrato(prato1);
//        menu.adicionarPrato(prato2);
//
//        menu.listarPratos();
//
//        menu.removerPrato(prato1);
//
//        menu.listarPratos();
    }
        
    private static MenuDePratos BuildListaDePratos() {
        
        MenuDePratos listaRetornar = new MenuDePratos();
        
        Prato prato1 = new Prato("Frango Grelhado", "Contemporânea", "Prato Principal", 300);
        Prato prato2 = new Prato("Massa Carbonara", "Italiana", "Prato Principal", 500);

        listaRetornar.adicionarPrato(prato1);
        listaRetornar.adicionarPrato(prato2);
        
        return listaRetornar;
    }
    
}
