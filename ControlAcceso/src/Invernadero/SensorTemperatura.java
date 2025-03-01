/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Invernadero;

/**
 *
 * @author Usuario
 */
import java.util.Random;

public class SensorTemperatura {
    private Random random = new Random();

    public double leerTemperatura() {
        return -5 + random.nextDouble() * 40; 
    }
}

