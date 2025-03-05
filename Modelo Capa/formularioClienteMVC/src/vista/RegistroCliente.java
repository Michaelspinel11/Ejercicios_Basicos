package vista;
import java.util.Scanner;

public class RegistroCliente[
//Se inicializa los atributos de la interfaz
private String colorBoton;
private int numBotones;
private int numLabel;
private String colorLabel;
private String colorFormulario;
private Scanner objTeclado;


//se crea el constructor
this.colorBoton = "rojo";
this.numBotones = 5;
this.numLabel = 10;
this. colorLabel = "blanco";
this.colorFormulario="amarillo";
}

//se crean  los metodos normalaes del formulario
public int mostrarMenu(){
System.out.println("1. Registrar cliente");
System.out.println("2. Ver lista de clientes");
System.out.println("3. Salir");
this.objTeclado = new Scanner (System.in);
System.out.println("Seleccione una opcion....");
int opcionMenu;
return opcionMenu;


public String tomarRegistro_cliente(){
this.objTeclado = new Scanner (System.in);
System.out.println("****Bienvenido al regristro del cliente****")
System.out.println("Digite el nombre del cliente: ");
String nombreCliente = obtTeclado.nextLine();
System.out.println("Digite el apellido del cliente: ");
String apellidoCliente = objTeclado.nextLine();
System.out.println("Digite la cedula del cliente:");
String cedulaCliente = objTeclado.nextLine();
return nombreCliente;  } }
