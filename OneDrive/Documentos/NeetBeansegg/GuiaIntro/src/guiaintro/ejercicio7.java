/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaintro;

import java.util.Scanner;

/**
 *
 * @author FRANCO
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        
        System.out.println("ingrese otro numero");
        int num2 = leer.nextInt();
        
        if (num > num2) {
            System.out.println("el primero numero es mas grande");
        } else {
            System.out.println("el segundo numero es mas grande ");
        }

    }
}
