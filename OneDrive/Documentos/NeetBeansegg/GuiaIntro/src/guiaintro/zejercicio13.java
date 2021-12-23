/*
 *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta
 */
package guiaintro;

import java.util.Scanner;

/**
 *
 * @author FRANCO
 */
public class zejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingres una nota");
        int nota = leer.nextInt();
        while (nota > 0 && nota > 10) {
            System.out.println("ingrese otro numero pliss");
            nota = leer.nextInt();

        }
        System.out.println("es correcto");
    }
}
