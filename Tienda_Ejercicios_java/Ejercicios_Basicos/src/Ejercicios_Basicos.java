import java.util.Scanner;

public class Ejercicios_Basicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== MENÚ DE OPCIONES ===");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");
            System.out.println("5. Opción 5");
            System.out.println("6. Opción 6");
            System.out.println("7. Opción 7");
            System.out.println("8. Opción 8");
            System.out.println("9. Opción 9");
            System.out.println("10. Opción 10");
            System.out.println("11. Opción 11");
            System.out.println("12. Opción 12");
            System.out.println("13. Opción 13");
            System.out.println("14. Opción 14");
            System.out.println("15. Opción 15");
            System.out.println("16. Opción 16");
            System.out.println("17. Opción 17");
            System.out.println("18. Opción 18");
            System.out.println("19. Opción 19");
            System.out.println("20. Opción 20");
            System.out.println("21. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:  
                    datos.ingresarDatos(teclado);
                    datos.operacion();
                    datos.resultado();

                    break;
                case 2:  
                    Ejercicio3 datos2 = new Ejercicio3();
                    datos2.inicio(teclado);
                    datos2.ejecutar();
                    datos2.resultado();
                    break;
                case 3:  
                    Ejercicio3 datos3 = new Ejercicio3();
                    datos3.inicio(teclado);
                    datos3.proceso(teclado);
                    datos3.resultado();
                    break;
                case 4:  
                    Ejercicio3 datos4 = new Ejercicio3();
                    datos4.inicio(teclado);
                    datos4.proceso();
                    datos4.resultado();
                    break;
                case 5:  
                    Ejercicio3 datos5 = new Ejercicio3();
                    datos5.inicio(teclado);
                    datos5.proceso();
                    datos5.resultado();
                    break;
                case 6:  
                    Ejercicio3 datos6 = new Ejercicio3();
                    datos6.inicio(teclado);
                    datos6.proceso(teclado);
                    datos6.resultado();
                    break;
                case 7:  
                    Ejercicio3 datos7 = new Ejercicio3();
                    datos7.inicio(scanner);
                    datos7.proceso(scanner);
                    datos7.resultado();
                    break;
                case 8:  
                    Ejercicio3 datos8 = new Ejercicio3();
                    datos8.inicio(scanner);
                    datos8.proceso(scanner);
                    datos8.resultado();
                    break;
                case 9:  
                    Ejercicio3 datos9 = new Ejercicio3();
                    datos9.inicio(scanner);
                    datos9.proceso(scanner);
                    datos9.resultado();
                    break;
                case 10: 
                    Ejercicio3 datos10 = new Ejercicio3();
                    datos10.inicio(scanner);
                    datos10.proceso(scanner);
                    datos10.resultado();
                    break;
                case 11: 
                    Ejercicio3 datos11 = new Ejercicio3();
                    datos11.inicio(scanner);
                    datos11.proceso(scanner);
                    datos11.resultado();
                    break;
                case 12: 
                    Ejercicio3 datos12 = new Ejercicio3();
                    datos12.inicio(scanner);
                    datos12.proceso(scanner);
                    datos12.resultado();
                    break;
                case 13: 
                    Ejercicio3 datos13 = new Ejercicio3();
                    datos13.inicio(scanner);
                    datos13.proceso(scanner);
                    datos13.resultado();
                    break;
                case 14: 
                    Ejercicio3 datos14 = new Ejercicio3();
                    datos14.inicio(scanner);
                    datos14.proceso(scanner);
                    datos14.resultado();
                    break;
                case 15: 
                    Ejercicio3 datos15 = new Ejercicio3();
                    datos15.inicio(scanner);
                    datos15.proceso(scanner);
                    datos15.resultado();
                    break;
                case 16: 
                    Ejercicio3 datos16 = new Ejercicio3();
                    datos16.inicio(scanner);
                    datos16.proceso(scanner);
                    datos16.resultado();
                    break;
                case 17: 
                    Ejercicio3 datos17 = new Ejercicio3();
                    datos17.inicio(scanner);
                    datos17.proceso(scanner);
                    datos17.resultado();
                    break;
                case 18: 
                    Ejercicio3 datos18 = new Ejercicio3();
                    datos18.inicio(scanner);
                    datos18.proceso(scanner);
                    datos18.resultado();
                    break;
                case 19: 
                    Ejercicio3 datos19 = new Ejercicio3();
                    datos19.inicio(scanner);
                    datos19.proceso(scanner);
                    datos19.resultado();
                    break;
                case 20: 
                    Ejercicio3 datos20 = new Ejercicio3();
                    datos20.inicio(scanner);
                    datos20.proceso(scanner);
                    datos20.resultado();
                    break;
                case 21: System.out.println("Saliendo del programa"); break;
                default: System.out.println("Opción inválida, intenta de nuevo");
            }
        } while (opcion != 21);
        
        scanner.close();
    }
}

