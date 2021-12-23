/*

 */
package ejercicio1extra.entidades;

import java.util.Date;
import java.util.Scanner;

public final  class BarcoMotor extends Barco {
    private int potenciaCv; 
    private Scanner leer ;

    public BarcoMotor(int potenciaCv, String matricula, int eslora, Date añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public BarcoMotor() {
        leer= new Scanner(System.in).useDelimiter("\n");
    }
    

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public void creoBarco() {
       super.crearBarco();
        System.out.println("Ingrese la potencia del cv");
        potenciaCv = leer.nextInt();
    }

    @Override
    public int preciofinal() {
        return  super.preciofinal() + potenciaCv;
    }
    
    
   
    
}
