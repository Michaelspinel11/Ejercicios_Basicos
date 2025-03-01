/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deteccionintrusos;

/**
 *
 * @author Usuario
 */
public class Alarma {
    private boolean activada = false;

    public void activar() {
        if (!activada) {
            activada = true;
            System.out.println("¡ALERTA! Intruso detectado. Alarma activada.");
        }
    }

    public void desactivar() {
        if (activada) {
            activada = false;
            System.out.println("Alarma desactivada.");
        }
    }
}

