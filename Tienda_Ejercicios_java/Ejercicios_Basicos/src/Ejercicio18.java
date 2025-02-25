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

public class Ejercicio18 {
    public Ejercicio18() {}

    public void inicio(Scanner scanner) {
        proceso(scanner);
    }

    public void proceso(Scanner scanner) {
        String acumulador = "";
        String respuesta;
        do {
            System.out.print("Ingresa el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingresa el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.print("Ingresa el número de páginas: ");
            int paginas = scanner.nextInt();
            scanner.nextLine();
            acumulador += "Título: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas + "\n";
            System.out.print("¿Quieres registrar otro libro? (S/N): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
        resultado(acumulador);
    }

    public void resultado(String acumulador) {
        System.out.println("\nLibros registrados:");
        System.out.println(acumulador);
    }
}
