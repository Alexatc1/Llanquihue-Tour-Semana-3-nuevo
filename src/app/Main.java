package app;

import model.Direccion;
import model.Empleado;
import model.Persona;


public class Main {

    
    public static void main(String[] args) {
        
        //Creamos los objetos tipo Direccion, Persona y Empleado
        
        Direccion direccion1 = new Direccion("caupolican", 14, "valparaiso", "valparaiso");
        Direccion direccion2 = new Direccion("Las compuertas", 18, "San felipe", "valparaiso");
        
        Persona persona1 = new Persona("Pedro", "20.341.397-1", 26, "pedrito@gmail.com", direccion1);
        
        Empleado empleado1 = new Empleado("Recepcion", "001", "miguel", "123.456.789-0", 20, "empleado@gmail", direccion2);
        
        //Mostramos en consola la informacion de cada objeto creado
        
        System.out.println(direccion1.mostrarDireccion());
        System.out.println(direccion2.mostrarDireccion());
        System.out.println(persona1.mostrarInformacion());
        System.out.println(empleado1.mostrarInformacion() + empleado1.mostrarInformacionEmpleado());
        
    }
    
}
