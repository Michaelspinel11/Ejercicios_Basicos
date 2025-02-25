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

public class Ejercicio16 {
    public Ejercicio16() {}

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese un número entero positivo para iniciar la cuenta regresiva: ");
        int numero = scanner.nextInt();
        proceso(numero);
    }

    public void proceso(int numero) {
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
        resultado();
    }

    public void resultado() {
        System.out.println("¡Tiempo cumplido!");
    }
}

