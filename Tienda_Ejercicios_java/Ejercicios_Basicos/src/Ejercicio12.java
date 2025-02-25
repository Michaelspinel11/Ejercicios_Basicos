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

public class Ejercicio12 {
    double saldo = 100000;

    public Ejercicio12() {}

    public void inicio(Scanner scanner) {
        System.out.print("Bienvenido al cajero automático. Ingrese el monto que desea retirar: ");
        double monto = scanner.nextDouble();
        proceso(scanner, monto);
    }

    public void proceso(Scanner scanner, double monto) {
        while (monto > saldo) {
            System.out.println("El monto ingresado supera su saldo disponible (" + saldo + ").");
            System.out.print("Por favor, ingrese un monto válido: ");
            monto = scanner.nextDouble();
        }
        saldo -= monto;
        resultado(saldo);
    }

    public void resultado(double saldoRestante) {
        System.out.println("Retiro exitoso. Su saldo restante es: " + saldoRestante);
    }
}
