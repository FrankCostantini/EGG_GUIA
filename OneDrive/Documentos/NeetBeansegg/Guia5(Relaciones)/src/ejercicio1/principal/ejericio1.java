package ejercicio1.principal;


import ejercicio1.relaciones.entidades.Perro;
import ejercicio1.relaciones.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ejericio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Perro> perros = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
   

        String sino = "";

        do {

            System.out.println("====================");
            System.out.println("MENU");
            System.out.println("1.Inresar Perro ");
            System.out.println("2.Ingresar Persona ");
            int resp = leer.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Ingrese el nombre del perro ");
                    String name = leer.next().toLowerCase();
                    System.out.println("Ingrese la raza ");
                    String raza = leer.next();
                    System.out.println("Ingrese el tamaño ");
                    int tam = leer.nextInt();
                    System.out.println("Ingrese la edad");
                    int edad = leer.nextInt();

                    perros.add(new Perro(name, raza, tam, edad));

                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la persona");
                    String nombre = leer.next().toLowerCase();
                    System.out.println("Ingrese el apellido ");
                    String apellido = leer.next();
                    System.out.println("Ingrese la edad ");
                    int edadhumana = leer.nextInt();
                    System.out.println("Documento ");
                    long doc = leer.nextLong();
                    personas.add(new Persona(nombre, apellido, edadhumana, doc, new Perro()));

//                    System.out.println("DESEAS ADOPTAR?");
//                    String i = leer.next();
//                    if (i.contains("s")) {
                case 3:
                    System.out.println("Hola sr , ingrese su nombre");
                    String n = leer.next().toLowerCase();
                    for (Persona persona : personas) {
                        if (persona.getNombre().equals(n)) {

                            System.out.println("Bienvenido , Ingrese el nombre del perro que desea ");
                            String np = leer.next().toLowerCase();

                            for (Perro perro : perros) {
                                if (perro.getNombre().equals(np)) {

                                    System.out.println("Perfecto cuide del perro " + perro.getNombre());
                                    
                                  persona.setPerro(perro);
                                   

                                } else {
                                    System.out.println("Ya fue adoptado ese perro ,Saludos");
                                }
                            }

                        }
                    }
                    break;

            }

            System.out.println("Desea Salir (S/N)");
            sino = leer.next();

        } while (sino.contains("n"));
    }
    
}
