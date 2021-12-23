
package guiaintro;

import java.util.Scanner;
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/

public class zejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         int con =0;
         int sum =0;
        
       do        {  
           System.out.println("ingrese un numero");
           int num= leer.nextInt();
           con++;
           if (num>=0)  {
           sum=num+sum; }
           
           if (num==0)  {
               System.out.println("se capturo el numero cero");
               break;
           }
        
    }while(con<=19);
        System.out.println("la suma de los numeros es :" + sum);
        
        
    
}
}
