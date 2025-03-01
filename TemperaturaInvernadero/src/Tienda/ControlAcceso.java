/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author Usuario
 */
public class ControlAcceso {
    private boolean horarioAbierto = true;

    public void verificarAcceso(boolean esEmpleado, boolean tieneMembresia) {
        if (esEmpleado || (tieneMembresia && horarioAbierto)) {
            System.out.println("Acceso PERMITIDO.");
        } else {
            System.out.println("Acceso DENEGADO.");
        }
    }

    public void cambiarHorario() {
        horarioAbierto = !horarioAbierto;
        System.out.println("El horario de atención ahora está " + (horarioAbierto ? "ABIERTO." : "CERRADO."));
    }
}

