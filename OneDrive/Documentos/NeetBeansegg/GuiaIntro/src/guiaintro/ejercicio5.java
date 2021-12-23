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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en
// grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese los grados centigrados");
        int cen =leer.nextInt();
        int far = 32 + (9 * cen/ 5);
        System.out.println("en fahrenheit seria  :"+far);
      
    }
    
}
