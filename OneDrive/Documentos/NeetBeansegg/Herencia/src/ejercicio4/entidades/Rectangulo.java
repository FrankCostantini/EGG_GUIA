/*

 */
package ejercicio4.entidades;

import ejercicio4.interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {
    
   private int base ;
   private int altura; 

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        System.out.println((base + altura) * 2.);  
    }

    @Override
    public void calcularArea() {
        System.out.println(base * altura);
    }
   
   
   
    
    
    
}
