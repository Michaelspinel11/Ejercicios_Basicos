/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda_ejercicios_java;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ejercicio9 {
    public Ejercicio9() {}

    public void inicio(Scanner scanner) {
        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();
        proceso(edad);
    }

    public void proceso(int edad) {
        String recomendacion = "";
        int categoria = edad < 7 ? 1 : (edad <= 17 ? 2 : (edad <= 30 ? 3 : 4));
        switch (categoria) {
            case 1:
                recomendacion = "Te recomendamos películas animadas y educativas.";
                break;
            case 2:
                recomendacion = "Te recomendamos películas familiares, de aventuras o comedias.";
                break;
            case 3:
                recomendacion = "Podrías disfrutar de acción, drama, comedia o ciencia ficción.";
                break;
            case 4:
                recomendacion = "Tal vez te gusten las películas clásicas y los dramas.";
                break;
        }
        resultado(recomendacion);
    }

    public void resultado(String recomendacion) {
        System.out.println("Nuestra sugerencia: " + recomendacion);
    }
}

