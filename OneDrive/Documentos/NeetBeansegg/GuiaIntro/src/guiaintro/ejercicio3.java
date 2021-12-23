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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//por pantalla
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el nombre ");
        String name = leer.next();
        System.out.println("su nombre es :" + name);
    }
    
}
