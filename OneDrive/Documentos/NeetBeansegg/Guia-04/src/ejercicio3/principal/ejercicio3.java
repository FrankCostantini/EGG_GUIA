/*
 
 */
package ejercicio3.principal;

import ejercicio3.entidades.Alumno;
import ejercicio3.servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio servicios = new AlumnoServicio();

        String resp = " ";

        Alumno alumno = new Alumno();

        do {
//             ArrayList <Alumno> alumnoss = new ArrayList();

            System.out.println("Enter the name of the student");

            String nombre = leer.next();

            System.out.println("enter the student's first grade");

            int nota = leer.nextInt();
            System.out.println("enter the student's second  grade");
            int nota2 = leer.nextInt();

            System.out.println("Enter the student's third grade ");
            int nota3 = leer.nextInt();

            alumno.setNombre(nombre);

            ArrayList<Integer> alumnos = new ArrayList();

            alumnos.add(nota);
            alumnos.add(nota2);
            alumnos.add(nota3);
            
             alumno.setNotas(alumnos);

            System.out.println("Are you want Exit ? scribe ( S/N ) ");
            resp = leer.next();

        } while (resp.contains("n"));

        servicios.notaFinal(alumno);

    }

}
