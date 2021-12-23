/*

 */
package ejercicio4;

import ejercicio4.entidades.Circulo;
import ejercicio4.entidades.Rectangulo;

public class ejercicio4 {

    public static void main(String[] args) {
      
      Circulo c1 = new Circulo(43,43);  
      Rectangulo r1 = new Rectangulo(54 , 32);
      
      
      
  //invoco los metodos que fueron de creados de manera de interfaces 
      c1.calcularArea();
      c1.calcularPerimetro();
      
      r1.calcularArea();
      r1.calcularPerimetro();
        
        
    }
    
}
