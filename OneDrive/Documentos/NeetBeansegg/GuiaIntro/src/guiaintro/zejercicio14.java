/*
  Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 
 */
package guiaintro;

import java.util.Scanner;

/**
 *
 * @author FRANCO
 */
public class zejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       int suma =0;
        System.out.println("ingrese el valor limite");
        int valorlimite=leer.nextInt();
        do  {
            System.out.println("ingrese un numero");
            System.out.print("xd");
            int num  = leer.nextInt();
            suma= suma + num ;
            
            
        }
        while (valorlimite> suma);
      
        
        
        
        
    }
    
}
