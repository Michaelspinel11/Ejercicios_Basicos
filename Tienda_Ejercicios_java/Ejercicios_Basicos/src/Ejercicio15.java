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

public class Ejercicio15 {
    public Ejercicio15() {}

    public void inicio(Scanner scanner) {
        proceso(scanner);
    }

    public void proceso(Scanner scanner) {
        String respuesta = "S";
        while (respuesta.equalsIgnoreCase("S")) {
            System.out.print("Ingrese la distancia total del viaje (en km): ");
            double distancia = scanner.nextDouble();
            System.out.print("Ingrese la velocidad promedio (en km/h): ");
            double velocidad = scanner.nextDouble();
            double tiempo = distancia / velocidad;
            System.out.println("El tiempo estimado de viaje es: " + tiempo + " horas.");
            System.out.print("¿Desea simular otro viaje? (S/N): ");
            respuesta = scanner.next();
        }
        resultado();
    }

    public void resultado() {
        System.out.println("Gracias por usar el simulador de viajes.");
    }
}

