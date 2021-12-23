/*
4. Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
 */
package ejercicio4.principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            boolean acertar = true;
            int cont = 1;
            int numrandom = (int) (Math.random() * 10) + 1;
            do {

                int numusu = leer.nextInt();

                if (numrandom == numusu) {
                    System.out.println("Ganaste");
                    System.out.println("Intentos" + " = " + cont);
                    acertar = false;

                } else {
                    cont++;
                }
                if (numrandom > numusu) {
                    System.out.println("TU numero es menor");
                }
                if (numrandom < numusu) {
                    System.out.println("Tu numero es mayor ");
                }

            } while (acertar);

        } catch (InputMismatchException e) {
            System.out.println("Ingrese un numero por favor ");
            System.out.println(e.toString());
        }
    }
}
