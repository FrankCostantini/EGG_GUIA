/*
. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package guiaintro;

import java.util.Scanner;

public class zejercicio27 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
  boolean indicador ;
        
       int[][] matriz = new int[3][3];

      
        int sumadordiagonal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumadordiagonal = matriz[i][j] + sumadordiagonal;
                }
            }
        }
        
        indicador = true ;
        
        for (int i = 0; i < 3; i++) {
            int sumador = 0;
            for (int j = 0; j < 3; j++) {
                sumador = matriz[i][j] + sumador;

            }
            if ( sumadordiagonal != sumador )    {
              indicador = false ;  
            }

        }
        
        if (indicador)  {
            System.out.println("es magico");
        }else   {System.out.println(" no es magico ");
        
        

    }

}
    public static int llenar(int matriz[])    {
        
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             
                matriz[i,j] =  ((int)Math.random()*9);
            }
            return matriz ;
        }
    }
   
}
