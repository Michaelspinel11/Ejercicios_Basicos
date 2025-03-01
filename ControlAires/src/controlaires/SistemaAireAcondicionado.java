/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlaires;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class SistemaAireAcondicionado {
    public static void main(String[] args) {
        SensorAmbiente sensor = new SensorAmbiente();
        AireAcondicionado aireAcondicionado = new AireAcondicionado();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú: \n1. Simular lectura de sensores \n2. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 2) break;

            if (opcion == 1) {
                double temperatura = sensor.leerTemperatura();
                double humedad = sensor.leerHumedad();
                aireAcondicionado.controlar(temperatura, humedad);
            }
        }
        scanner.close();
    }
}

