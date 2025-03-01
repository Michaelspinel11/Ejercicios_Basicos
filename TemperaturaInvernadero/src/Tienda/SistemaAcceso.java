/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tienda;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class SistemaAcceso {
    public static void main(String[] args) {
        ControlAcceso controlAcceso = new ControlAcceso();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú: \n1. Intentar acceder \n2. Cambiar horario de atención \n3. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 3) break;

            if (opcion == 2) {
                controlAcceso.cambiarHorario();
            } else if (opcion == 1) {
                System.out.print("¿Es empleado? (true/false): ");
                boolean esEmpleado = scanner.nextBoolean();
                System.out.print("¿Tiene membresía? (true/false): ");
                boolean tieneMembresia = scanner.nextBoolean();

                controlAcceso.verificarAcceso(esEmpleado, tieneMembresia);
            }
        }
        scanner.close();
    }
}

