
package ejercicio1extra.entidades;

import java.util.Date;
import java.util.Scanner;

public class Yate extends Barco {
    
    private  int potenciaCv; 
    private int numeroCamarotes;
       private Scanner leer ;

    public Yate(int potenciaCv, int numeroCamarotes, String matricula, int eslora, Date añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCv = potenciaCv;
        this.numeroCamarotes = numeroCamarotes;
    }

    public Yate() {
         leer = new Scanner(System.in).useDelimiter("\n");
    }
    

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public void creoBarco() {
       super.crearBarco();
        System.out.println("Ingrese la potencia de cv");
        potenciaCv = leer.nextInt();
        System.out.println("Ingrese la cantidad de camarotes");
        numeroCamarotes = leer.nextInt();
    }

    @Override
    public int preciofinal() {
        return super.preciofinal()+potenciaCv+numeroCamarotes;
    }
    
    
    
    
}
