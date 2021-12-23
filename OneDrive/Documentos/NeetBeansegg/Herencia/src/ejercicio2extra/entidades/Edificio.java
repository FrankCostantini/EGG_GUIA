/*

 */
package ejercicio2extra.entidades;

import java.util.Scanner;

public abstract class Edificio {
    
    protected Integer ancho ;
    protected Integer largo ;
    protected Integer alto;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Edificio(Integer ancho, Integer largo, Integer alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public Edificio() {
    }
    

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }
    
    /**
     *
     */
    public  void crear()    {
        System.out.println("ANCHO");
        ancho = leer.nextInt();
        System.out.println("LARGO");
        largo= leer.nextInt();
        System.out.println("alto ");
        alto = leer.nextInt();
        
        
        
    }
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
    
    
    
    
    
    
}
