/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;



/**
 *
 * @author Usuario
 */
public class Division extends Operacion {
    public double realizarOperacion(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}

