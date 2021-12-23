/*

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.
 */
package ejercicio1y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio1y2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> mascotas = new ArrayList();
        String indicador = "";
        
        do {

                System.out.println("Ingrese la raza ");
                String raza = leer.next();
                mascotas.add(raza);
      
            System.out.println("DESEA SALIR ( S / N)");
            indicador = leer.next();
            
            
        } while (indicador.contains("n"))
        ;
        
        
        for (String aux: mascotas) {
            System.out.println(aux);
            
        }

        System.out.println("Ingrese un perro ");
        String perro = leer.next();
        
        Iterator <String> in = mascotas.iterator();
        
        while (in.hasNext() )    {
           String aux = in.next();
           
            if (aux.equals(perro))  {
                in.remove();                
    
            }
            if(!aux.equals(perro)){
                System.out.println("No se encuentra");
    
            }
    
        }

        
        mascotas.forEach((aux) -> System.out.println(aux));
            
     
         
    
        
}
}

