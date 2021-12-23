/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package guiaintro;

import java.util.Scanner;

public class zejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num,i;
        int cont =0;
        System.out.println("Tomaremos 4 numeros del 1 al 20 ");
        do {
            
            System.out.println("* ingrese el numero: ");
            num = leer.nextInt();
            if(num<=20 && num>=1) {
                 cont=cont+1;
            }else System.out.println("Recorda es del 1 al 20 ");

        } while (cont!=4);
        System.out.print(num+".");
        for (i=0;i<num;i++)    {
           
            System.out.print("*"+" ");
            

    }
}
}
