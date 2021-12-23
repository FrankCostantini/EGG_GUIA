/*

 */
package ejercicio5extra;

import java.util.Scanner;

public class ejercicio5extra {
//    Crea una clase en Java donde declares una variable de tipo array de Strings que
//contenga los doce meses del año, en minúsculas. A continuación declara una variable
//mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
//mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
//Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
//adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String [] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","septiembre","noviembre","diciembre"};
 
        String mesSecreto = meses[(int)(Math.random()*12)];
 
 
 
        System.out.println("Adivine el mes secreto");
        String mes = leer.next().toLowerCase();
       
        
        
        while (!mes.equals(mesSecreto))  {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
             mes = leer.next().toLowerCase();
            

        } 
        System.out.println("Perfecto , el mes secreto era " + mesSecreto );

    }

}
