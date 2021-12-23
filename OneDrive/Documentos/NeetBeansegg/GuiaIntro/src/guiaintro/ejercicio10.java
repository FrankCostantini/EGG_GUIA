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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase ");
        String frase = leer.next();
        int leng = frase.length();
        if (leng == 8) {System.out.println("es correcto");
        }
        else    {System.out.println("incorrecto");  }
        
    }
}
    

    
