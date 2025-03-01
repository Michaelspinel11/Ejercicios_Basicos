/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deteccionintrusos;

/**
 *
 * @author Usuario
 */
import java.util.Random;
import java.util.Scanner;

public class SistemaSeguridad {
    public static void main(String[] args) {
        SensoresMovimiento sensores = new SensoresMovimiento();
        Alarma alarma = new Alarma();
        Scanner scanner = new Scanner(System.in);
        boolean sistemaActivo = true;

        while (true) {
            System.out.println("\nMenú: \n1. Activar alarma \n2. Desactivar alarma \n3. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 3) break;

            if (opcion == 1) {
                sistemaActivo = true;
                System.out.println("Alarma activada.");
            } else if (opcion == 2) {
                sistemaActivo = false;
                System.out.println("Alarma desactivada.");
            }

            if (sistemaActivo) {
                boolean esDeNoche = sensores.esDeNoche();
                int sensoresActivos = sensores.detectarMovimiento();
                if (esDeNoche && sensoresActivos >= 2) {
                    alarma.activar();
                } else {
                    alarma.desactivar();
                }
            }
        }
        scanner.close();
    }
}

