/*

 */
package ejercicio4.utilidades;

import ejercicio4.entidades.Pelicula;
import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<Pelicula> durmayormenor= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> durmenormayor= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenartitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
   public static Comparator<Pelicula> ordenardirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDirector().compareTo(t1.getDirector());
        }
    };
            
            

            
            
        
    
    
    
}
