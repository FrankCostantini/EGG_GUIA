/*

 */
package ejercicio1extra.entidades;

import java.util.Date;
import java.util.Scanner;

public final class Velero extends Barco{
    
    private int numeroMastiles; 
    private Scanner leer ;

    public Velero(int numeroMastiles, String matricula, int eslora, Date añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Velero() {
       leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
   
 
    @Override
    public void creoBarco()    {
      super.crearBarco();
        System.out.println("Ingrese el numero de mastiles ");
        
        numeroMastiles= leer.nextInt();
        
    }

    @Override
    public int preciofinal() {
        return super.preciofinal() + numeroMastiles;
    }

   

   
    
    
    
}
