/*
 
 */
package ejercicio12.principal;

import ejercicio12.entidades.Persona;
import ejercicio12.servicios.PersonaServicios;
import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicios servicios = new PersonaServicios ();
        
        Persona usuario1 = servicios.crearPersona();
        
        System.out.println(" Tienes " +servicios.calcularEdad(usuario1) + " años ");
        
        System.out.println("Ingres una edad ");
        int edad2 = leer.nextInt();
        
     
        System.out.println(servicios.menorQue(edad2,usuario1));
        servicios.mostrarPersona(usuario1);
        
    }
    }
    

