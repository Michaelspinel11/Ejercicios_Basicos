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

public class Ejercicio19 {
    public Ejercicio19() {}

    public void inicio(Scanner scanner) {
        proceso(scanner);
    }

    public void proceso(Scanner scanner) {
        double total = 0;
        String respuesta;
        do {
            System.out.println("\nMenú de Comidas Rápidas:");
            System.out.println("1. Hamburguesa - $5000");
            System.out.println("2. Papas fritas - $3000");
            System.out.println("3. Hot Dog - $4000");
            System.out.println("4. Pizza personal - $7000");
            System.out.print("Elige una opción (1-4): ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1: total += 5000; break;
                case 2: total += 3000; break;
                case 3: total += 4000; break;
                case 4: total += 7000; break;
                default: System.out.println("Opción no válida."); break;
            }
            System.out.print("¿Deseas agregar otro pedido? (S/N): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("S"));
        resultado(total);
    }

    public void resultado(double total) {
        System.out.println("\nEl costo total de tu pedido es: $" + total);
        System.out.println("¡Gracias por tu compra!");
    }
}

