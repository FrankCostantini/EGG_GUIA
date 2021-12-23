/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package ejercicio1extra;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      ArrayList <Integer> numeros = new ArrayList();
       int num  = 0;
       int cont =0 ; 
      do    {
          System.out.println("Ingrese numeros ");  
          num = leer.nextInt();
          if ( num== -99 )  {
              
              break ;
          }
          cont = cont +num ;
          numeros.add(num);
          
          
          
        
      }while( num != -99);
      
        System.out.println("El promedio es  " +  (cont /   numeros.size())     );
      
      
      
      
    }
    
}
