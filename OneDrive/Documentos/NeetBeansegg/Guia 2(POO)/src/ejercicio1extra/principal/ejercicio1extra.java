/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.

 */
package ejercicio1extra.principal;

import ejercicio1extra.entidades.Cancion;
import java.util.Scanner;

public class ejercicio1extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cancion cancion = new Cancion();
        System.out.println("Ingrese el titulo");
        cancion.setTitulo(leer.next());
        System.out.println("Ingrese el autor ");
        cancion.setAutor(leer.next());
        
    }
    
}
