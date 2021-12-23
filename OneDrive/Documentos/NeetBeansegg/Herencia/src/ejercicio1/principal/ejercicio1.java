
package ejercicio1.principal;

import ejercicio1.entidades.Animal;
import ejercicio1.entidades.Caballo;
import ejercicio1.entidades.Gato;
import ejercicio1.entidades.Perro;

public class ejercicio1 {

    public static void main(String[] args) {
      // nombre, alimento, edad y raza
        
        Animal perro1 = new Perro ("LOLA", "alimento perro1",23, "Bull");
        Animal caballo1 = new Caballo ("caballito ", " alimento de caballito ",231, " nose");
        Animal gato1 = new Gato (" gatito ", " Alimento para gatito ", 2313, " qsy");
        
        perro1.mostrarAlimento();
        caballo1.mostrarAlimento();
        gato1.mostrarAlimento();
        
        
        
        
        
        
        
        
        
    }
    
}
