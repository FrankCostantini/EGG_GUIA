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
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        String fin= " ";
        do     {
        System.out.println("ingrese el nombre del primer participante");
        String usuario = leer.next();
        System.out.println("si desea salir presione (S/N)");
         fin  = leer.next().toLowerCase();
        
        }while (fin.contains("s"));
    }
}
    
                
    
    

