/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaires;

/**
 *
 * @author Usuario
 */
import java.util.Random;

public class SensorAmbiente {
    private Random random = new Random();

    public double leerTemperatura() {
        return 20 + random.nextDouble() * 15; 
    }

    public double leerHumedad() {
        return 40 + random.nextDouble() * 40; 
    }
}

