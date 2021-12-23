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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase = leer.next();
        
        if (frase.substring(0,1).equals("a"))     {
            System.out.println("correcto");
         
        }
        else    {System.out.println("incorrecto");  }
                
    }
    
}
