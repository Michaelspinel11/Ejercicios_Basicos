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

public class Ejercicio10 {
    public Ejercicio10() {}

    public void inicio(Scanner scanner) {
        System.out.print("¿Cómo terminó el partido? (ganado, perdido, empatado): ");
        String resultadoPartido = scanner.next();
        proceso(resultadoPartido);
    }

    public void proceso(String resultadoPartido) {
        int puntos = 0;
        switch (resultadoPartido.toLowerCase()) {
            case "ganado":
                puntos = 3;
                break;
            case "perdido":
                puntos = 0;
                break;
            case "empatado":
                puntos = 1;
                break;
            default:
                System.out.println("Resultado no reconocido.");
                return;
        }
        resultado(puntos);
    }

    public void resultado(int puntos) {
        System.out.println("Puntos obtenidos: " + puntos);
    }
}
