/*
 
 */
package ejercicio4.principal;

import ejercicio4.entidades.Pelicula;
import ejercicio4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String resp = "";
        ArrayList<Pelicula> listapeliculas = new ArrayList();
        do {
            System.out.println("Ingrese el titulo ");
            String titulo = leer.next();
            System.out.println("Ingrese Director ");
            String director = leer.next();
            System.out.println("Ingrese Duracion ");
            int duracion = leer.nextInt();

            listapeliculas.add(new Pelicula(titulo, director, duracion));

            System.out.println("Desea Crear otra pelicula (S/N");
            resp = leer.next().toLowerCase();

        } while (resp.contains("s"));

        for (Pelicula aux : listapeliculas) {

            System.out.println(aux);
        }
        
        System.out.println("Estos los mayoes a una hora ");
        mayoresahora(listapeliculas);
        
        
Collections.sort(listapeliculas,Comparadores.durmayormenor);
 System.out.println("Ordenado de mayor a menor segun su duracion ");
        for (Pelicula listapelicula : listapeliculas) {
            
            System.out.println( listapelicula.getTitulo()+" "+listapelicula.getDuracion());
        }
        
        
        System.out.println("Ordenado de menor a mayor segun su duracion ");
  Collections.sort(listapeliculas, Comparadores.durmenormayor);
        for (Pelicula listapelicula : listapeliculas) {
            
            System.out.println( listapelicula.getTitulo()+" "+listapelicula.getDuracion());
        }
        
        System.out.println("Ordenado segun su titulo");
  Collections.sort(listapeliculas, Comparadores.ordenartitulo);
        for (Pelicula listapelicula : listapeliculas) {
            System.out.println(listapelicula.getTitulo());
        }
        
        System.out.println("Ordenado segun su director ");
  Collections.sort(listapeliculas, Comparadores.ordenardirector);
        for (Pelicula listapelicula : listapeliculas) {
            System.out.println(listapelicula.getDirector());
        }
  
        
}
public static void mayoresahora(ArrayList<Pelicula>lista) {

        for ( Pelicula aux  : lista ) {
       if (aux.getDuracion() > 1)  {
    
           System.out.println(aux);
     }
    
        }

    }

}

