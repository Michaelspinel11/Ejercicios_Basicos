package Controlador ;

import Modelo.Cliente;
import vista.RegistroCliente;

public class Controlador {
private RegistroCliente objFormulario_registro;
private Cliente objModelo_Cliente;

//se crea el constructor
public Controlador(Cliente objCliente, RegistroCliente objFormulario) {
this.objModelo_Cliente = objCliente;
this.objFormulario_registro =objFormulario; }

//metodo que inicia la ejecucion del formulario
public void iniciarFormulario(){
int opcion = 0;
do{
opcion = this.objFormulario_registro.mostrarMenu();
switch (opcion) {
case 1:
String auxNombre = this.objFormulario_registro.tomarRegistro_Cliente();
this.objModelo_cliente.guardarCliente (auxNombre);
break;
case 2
this.objModelo_cliente.imprimirClientes();
break;
case 3
System.out.println("Saliendo del sistema.....");
break;
default;
system.out.println("Opcion no valida...");
}
}while (opcion !=3); }    }
