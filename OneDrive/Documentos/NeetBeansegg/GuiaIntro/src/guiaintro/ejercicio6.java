/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().

 */
package guiaintro;

import java.util.Scanner;

/**
 *
 * @author FRANCO
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("");
        int num = leer.nextInt();
        int doble = num *2;
        int triple= num*3;
        double raiz = Math.sqrt(num);
        System.out.print("el doble es : " + doble + " el triple es : " + triple +" la raiz cuadrada es :" +raiz );
        
        
                
        
                
        
        
    }
    
}
