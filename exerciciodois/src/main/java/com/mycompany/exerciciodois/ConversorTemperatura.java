/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciodois;

/**
 *
 * @author Rafael.Evaristo
 */


// Dont know the formulas!!!! So i've used the page refrenced by ti trainer .https://www.infoescola.com/fisica/conversao-de-escalas-termometricas/
public class ConversorTemperatura {

    public ConversorTemperatura(TemperatureConverterForm formConvertion) {
        this.formConvertion = formConvertion;
    }

    // Rafael Comment: Invertion of control. Is missing the abstraction, but since this is just a simple exercice.... 
    // It would be esier jus to return a string and use that
    // This in c# would be a delegate
    // Dont know who to do that in java but probably a new clas that extends javax.swing.JFrame so that we may have diferent implementations and respect the SOLID principles ????
    
    // Just learned that final is the same as readonly in C#!!!
    private final TemperatureConverterForm formConvertion ; 

    public void converterCelsius(double temperatura) {
        double celsius = temperatura;
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273;

        formConvertion.exibirResultados(celsius, fahrenheit, kelvin, "Celsius");
    }

    public void converterFahrenheit(double temperatura) {
        double fahrenheit = temperatura;
        double celsius = (fahrenheit - 32) / 1.8 ;
        double kelvin = (fahrenheit - 32) * 5 / 9 + 273;

        formConvertion.exibirResultados(celsius, fahrenheit, kelvin, "Fahrenheit");
    }

    public void converterKelvin(double temperatura) {
        double kelvin = temperatura;
        double celsius = kelvin - 273;
        double fahrenheit = (kelvin - 273) * 1.8 + 32;

        formConvertion.exibirResultados(celsius, fahrenheit, kelvin, "Kelvin");
    }

    
}
