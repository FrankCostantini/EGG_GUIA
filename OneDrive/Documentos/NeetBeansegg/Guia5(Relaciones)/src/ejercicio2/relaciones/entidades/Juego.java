/*

 */
package ejercicio2.relaciones.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

//    Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
//Jugadores) y Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
//jugadores y el revolver para guardarlos en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
//sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
//tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    Scanner leer;

    public Juego() {

        jugadores = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void llenarJuego(ArrayList<Jugador> jugadores , Revolver revolver) {
      this.jugadores = jugadores;
      this.revolver = revolver ;
      

    }
    
    public void agregarLista(Jugador j ) {
        for (int i = 0; i < 6; i++) {
             jugadores.add(new Jugador(i+1));
        }
           
       
          
    }

    public void ronda() {
        for (Jugador jugadoress : jugadores) {
            System.out.println(jugadoress.getName());
            
        }
        do {
            
          
            for (Jugador jugadore : jugadores) {
 
                
                if (jugadore.disparo(revolver) == true) {
                 
                    System.out.println("Perdio " +jugadore.getName());
                    
                    return;

                }
                revolver.siguienteChorro();
                

            }
          

        } while (true);

    }
    
    
}
