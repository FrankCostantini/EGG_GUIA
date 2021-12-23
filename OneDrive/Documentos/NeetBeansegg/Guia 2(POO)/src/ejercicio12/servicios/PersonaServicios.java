/*
 
 */
package ejercicio12.servicios;


import ejercicio12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona()   {
        System.out.println("Ingres el nombre ");
        String name = leer.next();
        System.out.println("Ingrese su año de nacimiento");
        int año = leer.nextInt();
        System.out.println("ingrese su mes ");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese su Día ");
        int day = leer.nextInt();
        
        Persona usu = new Persona();
        
        usu.setNombre(name);
        
        Date fecha = new Date(año,mes,day);
    
        usu.setFecha(fecha);
        
        return usu ;
    }
    
    public int  calcularEdad(Persona f )   {
        Date fechaactual = new Date()  ;
        
       return  fechaactual.getYear()  -  (f.getFecha().getYear() -1900) ;
  
    }
    

    public boolean menorQue (int edad , Persona usu )  {
        return edad > calcularEdad(usu) ;
    }
    public void mostrarPersona(Persona pers)    {
        System.out.println(pers.getFecha());
        System.out.println(pers.getNombre());
    }
    
}
