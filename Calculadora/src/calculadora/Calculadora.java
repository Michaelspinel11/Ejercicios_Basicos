/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese el primer número:");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            double num2 = scanner.nextDouble();
            System.out.println("Ingrese la operación (+, -, *, /) o 'salir' para terminar:");
            String operacion = scanner.next();

            if (operacion.equalsIgnoreCase("salir")) {
                break;
            }

            Operacion op;
            switch (operacion) {
                case "+":
                    op = new Suma();
                    break;
                case "-":
                    op = new Resta();
                    break;
                case "*":
                    op = new Multiplicacion();
                    break;
                case "/":
                    op = new Division();
                    break;
                default:
                    System.out.println("Operación no válida.");
                    continue;
            }

            System.out.println("Resultado: " + op.realizarOperacion(num1, num2));
        }
        scanner.close();
    }
}

