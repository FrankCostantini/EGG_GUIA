//De Cine nos interesa conocer la película que se está
//reproduciendo, la sala con los espectadores y el precio de la entrada.
package ejercicio2extra.relaciones.entidades;

import java.util.ArrayList;

public class Cine {

    private Pelicula pelicula ; 
//    private ArrayList<ArrayList<Espectador>> salas = new ArrayList();
    private Sala sala;
    private int precio ;
    
    
    
    
    public void llenarCine (int p) {
        precio = p ;
//        salas = s ;
        
        
    }
    
//    Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y
//se los ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde
//ya este ocupado el asiento).
//Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que
//sólo se podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada,
//si hay espacio libre en la sala y si tiene la edad requerida para ver la película. En caso de
//que el asiento este ocupado se le debe buscar uno libre.
//Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y
//numero de cada asiento o solo las X y espacios vacíos
    
  
    
    
    
    
    public void entrada(Espectador e) {
     
        if(e.getDineroDisponible()>= precio )   {
           if (e.getEdad()>= pelicula.getMinima())  {
               if(sala.getMatriz().size()<8) {
                sala.setMatriz();
                   
               }
               
           }
            
            
            
            
        }
        
    }
}
