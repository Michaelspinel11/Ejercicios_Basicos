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
import java.util.Random;

public class Ejercicio17 {
    public Ejercicio17() {}

    public void inicio(Scanner scanner) {
        proceso(scanner);
    }

    public void proceso(Scanner scanner) {
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int intento;
        System.out.println("He pensado en un número entre 1 y 100. ¡Adivina cuál es!");
        while (true) {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Mi número es mayor que " + intento + ". Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Mi número es menor que " + intento + ". Intenta de nuevo.");
            } else {
                break;
            }
        }
        resultado();
    }

    public void resultado() {
        System.out.println("¡Felicidades, adivinaste el número!");
    }
}

