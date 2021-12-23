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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
///Escribir un programa que pida dos números enteros por teclado y calcule la suma
///de los dos. El programa deberá después mostrar el resultado de la suma
        

Scanner leer = new Scanner(System.in).useDelimiter("\n");

         System.out.println("ingrese un numero");
         int num1 =leer.nextInt();
         System.out.println("ingrese otro numero");
         int num2= leer.nextInt();
         int suma = num1 + num2 ;
         System.out.println("la suma de esos numeros "+ suma );
         
         
                 
    }
   
}

