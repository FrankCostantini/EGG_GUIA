/*
 Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.
 */
package ejercicio2extra.entidades;

import java.util.Scanner;

public final class Polideportivo extends Edificio {
    private String nombre ;
    private boolean techo ;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo(String nombre, boolean techo, Integer ancho, Integer largo, Integer alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.techo = techo;
    }

    public Polideportivo() {
       
    }
    
    
    

    @Override
    public void calcularSuperficie() {

         System.out.println("Superficie de   " + (ancho * largo ) );
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen de  " + (alto* ancho * largo) );
    }

    @Override
    public void crear() {
       super.crear();
        System.out.println("nombre ");
        nombre = leer.next();
        System.out.println("TIENE TECHO ?");
         String resp  = leer.next();
        if (resp.contains("si") )  {
            techo=true;
            
        }else
            techo = false;
       
    }
    
    
    
}
