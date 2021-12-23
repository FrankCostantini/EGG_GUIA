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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
            String frase = leer.next().toLowerCase();
            
         
            if (frase.equals("eureka") )    {
                System.out.println("es correcto");
            }
            else    { System.out.println("no es correcto");
    }
    
}
}
