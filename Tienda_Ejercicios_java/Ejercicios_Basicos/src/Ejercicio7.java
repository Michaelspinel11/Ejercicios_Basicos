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

public class Ejercicio7 {
    public Ejercicio7() {}

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese el tipo de producto (A: Alimentos, V: Vestimenta, E: Electrónicos): ");
        char tipoProducto = scanner.next().charAt(0);
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();
        proceso(tipoProducto, cantidad);
    }

    public void proceso(char tipoProducto, int cantidad) {
        double precioBase = 0;
        double descuento = 0;
        switch (tipoProducto) {
            case 'A':
                precioBase = 5000;
                descuento = 0.10;
                break;
            case 'V':
                precioBase = 30000;
                descuento = 0.05;
                break;
            case 'E':
                precioBase = 70000;
                descuento = 0.0;
                break;
            default:
                System.out.println("Tipo de producto no válido.");
                return;
        }
        double costoSinDescuento = precioBase * cantidad;
        double costoConDescuento = costoSinDescuento * (1 - descuento);
        resultado(costoSinDescuento, costoConDescuento);
    }

    public void resultado(double costoSinDescuento, double costoConDescuento) {
        System.out.println("El costo sin descuento es: " + costoSinDescuento);
        System.out.println("El costo con descuento es: " + costoConDescuento);
    }
}

