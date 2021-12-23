/*

 */
package ejercicio6extra.principal;

import ejercicio6extra.entidades.Ahorcado;
import ejercicio6extra.servicios.AhorcadoServicio;

public class ejercicio6extra {

    public static void main(String[] args) {
     AhorcadoServicio servicios = new AhorcadoServicio();
     Ahorcado juego1 = servicios.crearJuego();
     servicios.juego(juego1);
     
     
     
    }
    
}
