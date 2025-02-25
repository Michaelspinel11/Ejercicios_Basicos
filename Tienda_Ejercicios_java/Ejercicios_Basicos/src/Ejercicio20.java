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

public class Ejercicio20 {
    public Ejercicio20() {}

    public void inicio(Scanner scanner) {
        proceso(scanner);
    }

    public void proceso(Scanner scanner) {
        double temperatura;
        do {
            System.out.print("Ingresa la temperatura actual (°C): ");
            temperatura = scanner.nextDouble();
            if (temperatura < 18 || temperatura > 25) {
                System.out.println("¡Alerta! La temperatura no está dentro del rango aceptable (18°C - 25°C).");
            }
        } while (temperatura < 18 || temperatura > 25);
        resultado(temperatura);
    }

    public void resultado(double temperatura) {
        System.out.println("La temperatura " + temperatura + "°C es aceptable.");
    }
}

