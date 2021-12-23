
/*
. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package guiaintro;

import java.util.Scanner;

public class zejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double libras = 0.86;
        double dolar = 1.28611;
        double yenes = 129.852;
intercambio( libras ,dolar,yenes);

    }
 
public static void intercambio (double libras , double dolar , double yenes)    {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
     String salida = " ";
        do {
            System.out.println("1.Dolar");
            System.out.println("2.Libra");
            System.out.println("3.Yenes");
            int respuesta = leer.nextInt();
            System.out.println("ingrese la cantidad de € ");
            int cant = leer.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("*serian :" + cant * dolar + "€");
                    break;

                case 2:
                    System.out.println("*serian :" + cant * libras + "€");
                    break;
                case 3:
                    System.out.println("*serian :" + cant * yenes + "€");

            }
            System.out.println("*Desea finalizar? (S/N)");
            salida = leer.next();
        } while (salida.contains("n"));
}
}
