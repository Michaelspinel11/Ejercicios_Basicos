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

public class Ejercicio14 {
    int papelDisponible = 100;

    public Ejercicio14() {}

    public void inicio(Scanner scanner) {
        proceso(scanner);
    }

    public void proceso(Scanner scanner) {
        while (papelDisponible > 0) {
            System.out.println("Papel disponible: " + papelDisponible + " páginas.");
            System.out.print("¿Cuántas páginas deseas imprimir? ");
            int paginas = scanner.nextInt();
            if (paginas <= papelDisponible) {
                System.out.println("Imprimiendo " + paginas + " páginas...");
                papelDisponible -= paginas;
            } else {
                System.out.println("No tienes suficiente papel para imprimir " + paginas + " páginas.");
            }
            if (papelDisponible == 0) {
                System.out.println("Ya no queda papel en la impresora.");
                break;
            }
            System.out.print("¿Deseas imprimir más páginas? (S/N): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        }
        resultado();
    }

    public void resultado() {
        System.out.println("Impresión finalizada. Papel restante: " + papelDisponible + " páginas.");
    }
}

