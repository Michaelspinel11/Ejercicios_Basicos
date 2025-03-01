/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaires;

/**
 *
 * @author Usuario
 */
public class AireAcondicionado {
    private boolean encendido = false;

    public void controlar(double temperatura, double humedad) {
        System.out.println("Temperatura: " + temperatura + "°C, Humedad: " + humedad + "%");

        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            encender();
        } else {
            apagar();
        }
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Aire acondicionado ENCENDIDO.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Aire acondicionado APAGADO.");
        }
    }
}
