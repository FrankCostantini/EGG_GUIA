/*

 */
package ejercicio3.servicios;

import ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void notaFinal(Alumno alumno) {
        int sumador = 0;
        System.out.println("Ingrese el nombre del alumno que desea buscar");
        String name = leer.next();
        
        if (alumno.getNombre().equals(name)) {

            ArrayList<Integer> aux = alumno.getNotas();

            for (Integer auxiliar : aux) {
                sumador = sumador + auxiliar;
            }
 
        }
        System.out.println((sumador / 3));

    }
}
