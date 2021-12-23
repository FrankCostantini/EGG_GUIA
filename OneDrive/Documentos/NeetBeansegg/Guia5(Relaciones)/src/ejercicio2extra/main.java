
package ejercicio2extra;

import ejercicio2extra.relaciones.entidades.Cine;
import ejercicio2extra.relaciones.entidades.Espectador;
import ejercicio2extra.relaciones.entidades.Pelicula;
import ejercicio2extra.relaciones.entidades.Sala;

public class main {

    public static void main(String[] args) {
     
        Espectador espectador = new Espectador();
        Pelicula pelicula = new Pelicula();
        Sala sala = new Sala();
        Cine cine  = new Cine();
        
        
        
        espectador.llenarEspectador();
        pelicula.llenarPelicula();
        
        
        cine.pedirPrecio(100);
        
        cine.entrada();
        
        
        
        
    }
    
}
