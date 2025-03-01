/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlluces;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class SistemaLuces {
    public static void main(String[] args) {
        SensorMovimiento sensorMovimiento = new SensorMovimiento();
        ControlLuces controlLuces = new ControlLuces();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú: \n1. Simular detección de movimiento \n2. Cambiar día/noche \n3. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 3) break;

            if (opcion == 1) {
                boolean hayMovimiento = sensorMovimiento.detectarMovimiento();
                controlLuces.actualizarEstado(hayMovimiento, sensorMovimiento.esDeNoche());
            } else if (opcion == 2) {
                sensorMovimiento.cambiarDiaNoche();
            }
        }
        scanner.close();
    }
}
