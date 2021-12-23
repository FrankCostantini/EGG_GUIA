/*
 
 */
package poo.ejercicio3.servicios;

import java.util.Scanner;
import poo.ejercicio3.entidades.Operacion;

public class OperacionServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {

        System.out.println("ingrese el numero 1");
        int n1 = leer.nextInt();

        System.out.println("ingrese el numero 2 ");
        int n2 = leer.nextInt();

        return new Operacion(n1, n2);

    }

    public int Sumatoria(Operacion sum) {

        return sum.getNum1() + sum.getNum2();

    }

    public int Division(Operacion div) {
        if (div.getNum2() == 0 || div.getNum1()==0) {
            System.out.println("Eroor 0");
        }
         return div.getNum1() / div.getNum2();
    }

    

    public int Multiplicacion(Operacion mult) {
        if (mult.getNum1() == 0 || mult.getNum2() == 0) {
            System.out.println("ERROR DE ¡0!");
        }

        return mult.getNum1() * mult.getNum2();
    }

    public int Resta(Operacion rest) {

        return rest.getNum1() - rest.getNum2();
    }

}
