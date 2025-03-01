/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluces;

/**
 *
 * @author Usuario
 */
public class ControlLuces {
    private boolean lucesEncendidas = false;

    public void actualizarEstado(boolean hayMovimiento, boolean esDeNoche) {
        if (esDeNoche && hayMovimiento) {
            encender();
        } else {
            apagar();
        }
    }

    public void encender() {
        if (!lucesEncendidas) {
            lucesEncendidas = true;
            System.out.println("Luces encendidas.");
        }
    }

    public void apagar() {
        if (lucesEncendidas) {
            lucesEncendidas = false;
            System.out.println("Luces apagadas.");
        }
    }
}

