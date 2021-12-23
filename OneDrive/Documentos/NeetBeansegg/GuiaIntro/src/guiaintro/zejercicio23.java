/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido.
 */
package guiaintro;

import java.util.Scanner;


public class zejercicio23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el tamaño");
        int tam = leer.nextInt();
        int []vector = new int [tam] ;
        System.out.println("Que numero desea buscar");
        int num =leer.nextInt ();
        for (int i = 0; i < tam ; i++) {
            vector[i]= (int) (Math.random() * 10);
        }
        int cont=0;
        for (int i = 0; i < tam; i++) {
            if (vector[i]==num)     {
                System.out.println("esta en la posicion "+vector[i]);
                cont=+1;
  
        }
            
    }
        System.out.println("se ha repetido " + cont);
    
}
}
