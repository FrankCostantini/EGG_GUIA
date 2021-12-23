/*
Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos
polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
deberemos llamar al método cantPersonas() y mostrar los resultados de cada
edificio de oficinas.
 */
package ejercicio2extra.principal;

import ejercicio2extra.entidades.EdeficioDeOficinas;
import ejercicio2extra.entidades.Edificio;
import ejercicio2extra.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.List;

public class ejercicio2extra {

    public static void main(String[] args) {
    
        List<Edificio> edificios = new ArrayList();
        
        Edificio pd1= new Polideportivo();
        Edificio pd2= new Polideportivo();
        
        Edificio eo1 = new EdeficioDeOficinas();
        Edificio eo2= new EdeficioDeOficinas();
        
        pd1.crear();
        pd2.crear();
        eo1.crear();
        eo2.crear();
        
        
        edificios.add(pd1);
        edificios.add(pd2);
        
        
        edificios.add(eo1);
        edificios.add(eo2);
        
        for (Edificio aux : edificios) {
              if (aux instanceof Polideportivo)     {
                  System.out.println("Poli deportivo");
                aux.calcularSuperficie();
                aux.calcularVolumen();    
                  System.out.println("===================");                
              }
              
              if (aux instanceof EdeficioDeOficinas)    {
                  System.out.println("Edeficio con oficinas");
                  ((EdeficioDeOficinas) aux).cantidadPersonas();
                 aux.calcularSuperficie();
                  aux.calcularVolumen();
                  System.out.println("=========================");
                   
              }
                      
        }
     
        
        
        
        
        
        
        
        
        
    }
    
}
