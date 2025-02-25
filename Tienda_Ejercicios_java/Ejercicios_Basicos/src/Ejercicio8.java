/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda_ejercicios_java;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ejercicio8 {
    public Ejercicio8() {}

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese su peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su altura (m): ");
        double altura = scanner.nextDouble();
        proceso(peso, altura);
    }

    public void proceso(double peso, double altura) {
        double imc = peso / (altura * altura);
        String categoria;
        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 24.9) {
            categoria = "Peso normal";
        } else if (imc < 29.9) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }
        resultado(imc, categoria);
    }

    public void resultado(double imc, String categoria) {
        System.out.println("Tu IMC es: " + imc);
        System.out.println("Clasificación: " + categoria);
    }
}

