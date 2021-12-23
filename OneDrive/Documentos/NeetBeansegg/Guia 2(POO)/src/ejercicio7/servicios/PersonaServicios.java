/*

 */
package ejercicio7.servicios;

import ejercicio7.entidades.Persona;
import java.util.Scanner;

public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearpersona() {

        System.out.println(" Ingrese su nombre ");
        String name = leer.next();
        System.out.println("Ingrese su edad ");
        int edad = leer.nextInt();
        System.out.println("Ingrese su sexo (H/M/O ( de otros )");
        String sexo = leer.next().toLowerCase();
        while (!sexo.equals("h") && !sexo.equals("m") && !sexo.equals("o")) {
            System.out.println("Ingrese correctamente el sexo");
            sexo = leer.next();
        }
        System.out.println("Ingrese su peso ");
        int peso = leer.nextInt();
        System.out.println("Ingrese su altura");
        int altura = leer.nextInt();

        Persona pers = new Persona();
        pers.setName(name);
        pers.setEdad(edad);
        pers.setSexo(sexo);
        pers.setPeso(peso);
        pers.setAltura(altura / 100);

        return pers;

    }

    public int calcularMc(Persona a) {

        int mc = a.getPeso() / (a.getAltura() ^ 2);
        if (mc < 20) {

            return -1;
        } else {
            if (mc > 20 && mc < 25) {

                return 0;
            } else {
                return 1;
            }

        }

    }

    public boolean esMayorDeEdad(Persona edad) throws Exception {
        boolean i = false;
        if (edad.getEdad() > 18) {
            i = true;

        }
        return i;
    }

}
