/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluces;

/**
 *
 * @author Usuario
 */
import java.util.Random;

public class SensorMovimiento {
    private Random random = new Random();
    private boolean esDeNoche = random.nextBoolean();

    public boolean detectarMovimiento() {
        return random.nextBoolean();
    }

    public boolean esDeNoche() {
        return esDeNoche;
    }

    public void cambiarDiaNoche() {
        esDeNoche = !esDeNoche;
        System.out.println("Ahora es " + (esDeNoche ? "noche." : "día."));
    }
}

