/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package guiaintro;

import java.util.Scanner;

public class zejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector = new int [100];                                                                        
 
        for (int i = 99; i> -1 ; i--) {
            vector[i]=i;
            System.out.println(vector[i]);
            
        }

        }
    }

