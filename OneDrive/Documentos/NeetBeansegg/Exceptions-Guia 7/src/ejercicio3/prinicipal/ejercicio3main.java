/*

 */
package ejercicio3.prinicipal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
  String num1 = leer.next();
  String  num2= leer.next();
 
  
  int n1= Integer.parseInt(num1);
  int n2= Integer.parseInt(num2);
      
        System.out.println(n1/n2);
        
        
        
    }catch (  InputMismatchException e) {
            System.out.println("no se pudo transformar el dato a int ");
        e.getStackTrace();
        
    }catch (ArithmeticException ed )    {
            System.out.println("no se puede dividir un 0 ,genio ");
            ed.toString();
    }catch(NumberFormatException edd)   {
            System.out.println("ingrese numeros porfavor");
            edd.getStackTrace();
    }catch ( Exception x)   {
            System.out.println("ERROR");
    }
    finally     {
            System.out.println("continuamos ");
            
        }
        
}
}

