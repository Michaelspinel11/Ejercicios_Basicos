/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deteccionintrusos;

/**
 *
 * @author Usuario
 */
import java.util.Random;

public class SensoresMovimiento {
    private Random random = new Random();

    public int detectarMovimiento() {
        int sensor1 = random.nextBoolean() ? 1 : 0;
        int sensor2 = random.nextBoolean() ? 1 : 0;
        int sensor3 = random.nextBoolean() ? 1 : 0;

        int totalMovimientos = sensor1 + sensor2 + sensor3;
        System.out.println("Sensores activados: " + totalMovimientos);
        return totalMovimientos;
    }

    public boolean esDeNoche() {
        return random.nextBoolean();
    }
}
