/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Invernadero;

/**
 *
 * @author Usuario
 */
public class ReguladorTemperatura {
    private Calefactor calefactor = new Calefactor();
    private Ventilador ventilador = new Ventilador();

    public void regular(double temperatura) {
        System.out.println("Temperatura actual: " + temperatura + "°C");

        if (temperatura < 10) {
            calefactor.encender();
            ventilador.apagar();
        } else if (temperatura > 25) {
            calefactor.apagar();
            ventilador.encender();
        } else {
            calefactor.apagar();
            ventilador.apagar();
        }
    }
}

