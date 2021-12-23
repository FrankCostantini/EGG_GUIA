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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int valormotor= leer.nextInt();
        switch (valormotor) {
            case 1 : System.out.println("La bomba es una bomba de agua");
            break;
            case 2 : System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3 : System.out.println("La bomba es una bomba de hormigon");
                     break ;
            case 4 : System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            default : System.out.println("No existe un valor valudi para tipo de bomba ");
            
        }
    }
    
}
