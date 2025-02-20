import java.util.Scanner;

public class Ejercicios_Basicos{


    public static void main (String[] args){
Scanner teclado = new Scanner(System.in);

        Ejercicio1 datos = new Ejercicio1();
        datos.ingresarDatos(teclado);
        datos.operacion();
        datos.resultado();

        Ejercicios2 datos2 = new Ejercicios2();
        datos2.incio(teclado);
        datos2.ejecutar();
        datos2.resultado();

        Ejercicio3 datos3 = new Ejercicio3();
        datos3.inicio(teclado);
        datos3.proceso(teclado);
        datos3.resultado();

        Ejercicio4 datos4 = new Ejercicio4();
        datos4.incio(teclado);
        datos4.proceso();
        datos4.resultado();

        Ejercicio5 datos5 = new Ejercicio5();
        datos5.incio(teclado);
        datos5.proceso();
        datos5.resultado();

        Ejercicio6 datos6 = new Ejercicio6();
        datos6.incio(teclado);
        datos6.proceso(teclado);
        datos6.resultado();
}
    
}
