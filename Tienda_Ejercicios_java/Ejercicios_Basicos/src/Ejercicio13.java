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

public class Ejercicio13 {
    public Ejercicio13() {}

    public void inicio(Scanner scanner) {
        proceso(scanner);
    }

    public void proceso(Scanner scanner) {
        double total = 0;
        String respuesta = "S";
        while (respuesta.equalsIgnoreCase("S")) {
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad que desea comprar: ");
            int cantidad = scanner.nextInt();
            total += precio * cantidad;
            System.out.print("¿Desea agregar otro producto? (S/N): ");
            respuesta = scanner.next();
        }
        resultado(total);
    }

    public void resultado(double total) {
        System.out.println("El costo total de su compra es: " + total);
    }
}

