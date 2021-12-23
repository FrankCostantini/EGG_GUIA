/*

 */
package ejercicio2.relaciones.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {

    private int id;
    private String name;
    private boolean mojado;

    private Scanner leer;

    public Jugador() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    
    public Jugador(int i) {
        id = i;
        name = "Jugador " + id;
        mojado = false;
    }


    public boolean disparo(Revolver r) {
        boolean ind = false;
        if (r.mojar()) {
            
            ind = true;

  

        }
        mojado = ind;
        return mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    
    
    
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", name=" + name + ", mojado=" + mojado + ", leer=" + leer + '}';
    }

   
    
    
    
}



