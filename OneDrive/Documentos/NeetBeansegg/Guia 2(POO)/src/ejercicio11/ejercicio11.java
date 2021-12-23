/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el año ");
        int año = leer.nextInt()- 1900;
         System.out.println("Ingrese el mes ");
        int mes  = leer.nextInt()-1;
         System.out.println("Ingrese el dia ");
        int dia = leer.nextInt();
       
        Date fecha = new Date (año,mes,dia);
        Date fechaactual = new Date ();
        
        
        
        int diferencia = fechaactual.getYear()- fecha.getYear();
        System.out.println(diferencia);
        
        
        
        
    }
    
}
