/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20
 */
package ejercicio10;

import java.util.Arrays;


public class ejercicio10 {

    public static void main(String[] args) {
    
        float arregloA[] = new float[50];
        float arregloB[] = new float[20];
        
        for (int i = 0; i <50; i++) {
            arregloA[i]=((float)Math.random()*10);
            
        }
        
        for (int i = 0; i <50; i++) {
            System.out.println(arregloA[i]);
        }
     
       
       
      Arrays.sort(arregloA);
      System.arraycopy(arregloA, 0, arregloB, 0, 10);
      Arrays.fill(arregloB,10,20,(float)0.5);
      
        for (int i = 0; i <50; i++) {
            System.out.println(arregloA[i]);
        }
        
        
          for (int i = 0; i <20; i++) {
            System.out.println(arregloB[i]);
        }
      
 
      }
        
        
    }
    
    
    


