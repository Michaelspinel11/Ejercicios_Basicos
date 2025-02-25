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

public class Ejercicio11 {
    public Ejercicio11() {}

    public void inicio(Scanner scanner) {
        System.out.print("Elige un plato (1: Pizza, 2: Hamburguesa, 3: Ensalada): ");
        int plato = scanner.nextInt();
        System.out.print("Elige una bebida (1: Refresco, 2: Agua, 3: Jugo): ");
        int bebida = scanner.nextInt();
        System.out.print("Elige tu método de pago (1: Efectivo, 2: Tarjeta, 3: Cheque): ");
        int metodoPago = scanner.nextInt();
        proceso(plato, bebida, metodoPago);
    }

    public void proceso(int plato, int bebida, int metodoPago) {
        double costoPlato = 0, costoBebida = 0, descuento = 0;
        switch (plato) {
            case 1:
                costoPlato = 15000;
                break;
            case 2:
                costoPlato = 12000;
                break;
            case 3:
                costoPlato = 8000;
                break;
            default:
                System.out.println("Plato no válido.");
                return;
        }
        switch (bebida) {
            case 1:
                costoBebida = 4000;
                break;
            case 2:
                costoBebida = 2000;
                break;
            case 3:
                costoBebida = 3000;
                break;
            default:
                System.out.println("Bebida no válida.");
                return;
        }
        if (metodoPago == 1) {
            descuento = 0.10;
        } else if (metodoPago == 2) {
            descuento = 0.05;
        }
        double total = (costoPlato + costoBebida) * (1 - descuento);
        resultado(total);
    }

    public void resultado(double total) {
        System.out.println("El total a pagar es: " + total);
    }
}

