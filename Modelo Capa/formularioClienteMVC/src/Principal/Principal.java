package Pricipal;

public class Principal {
import Controlador.Controlador;
import Modelo.Cliente;
import vista.RegistroCliente;
//import vista.loginCliente

public class Principal {
public static void main (String[]args){
//loginCliente obj Ventana_login = new loginCliente();
//objVentana_login.setVisible(true)
Cliente objCliente = new Cliente ();
RegistroCliente objFormulario = new RegistroCliente();
Controlador objControlador =new Controlador(objCliente, objFormulario);
Formulario ();

}
