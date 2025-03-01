/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Invernadero;

/**
 *
 * @author Usuario
 */
import java.util.Random;

public class Invernadero {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();
        ReguladorTemperatura regulador = new ReguladorTemperatura();

        while (true) {
            double temperatura = sensor.leerTemperatura();
            regulador.regular(temperatura);

            try {
                Thread.sleep(5000); // Simula la lectura cada 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

