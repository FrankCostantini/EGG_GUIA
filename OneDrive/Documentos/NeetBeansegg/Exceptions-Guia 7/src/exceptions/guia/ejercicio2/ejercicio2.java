
package exceptions.guia.ejercicio2;


import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
     try    {   
     int []array = new int [ 3];
       
        for (int i = 0; i < 5; i++) {
         
          array[i]=leer.nextInt();
        }
       
    }catch ( ArrayIndexOutOfBoundsException e)  {
         System.out.println("nuetra lista es de 3 numeros ,okey?");
         e.toString();
    }

    
}
}
