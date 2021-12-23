package poo.zejercicio2.entidades;

import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private double radio;
    
// constructores
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    
    
    //get y set
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //metodos pedircircunferencia / area / perimetro 

    public void crearCircunferencia() {
        System.out.println("*Ingrese el radio:");
        radio = leer.nextDouble();
    }

    public double area(double radio) {
         double are  = Math.PI * radio;
         return  are ;
        
    }
    
    public double perimetro(double radio)   {
        double peri = 2 * Math.PI * radio;
        return peri;
    }
    
}


