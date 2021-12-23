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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java.
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("ingrese su nombre "+" y  apellido");
        String frase = leer.next();
        System.out.println("en mayuscula "+frase.toUpperCase()+" en minuscula es "+ frase.toLowerCase());
       
        
        
    }
    
}
