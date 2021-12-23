/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
código con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.
 */
package ejercicio7.principal;

import ejercicio7.entidades.Persona;
import ejercicio7.servicios.PersonaServicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PersonaServicios servicio = new PersonaServicios();

     
          
      
       try {
           
       
           Persona persona1 = servicio.crearpersona();
        Persona persona2 = servicio.crearpersona();
        Persona persona3 = servicio.crearpersona();
        Persona persona4 = servicio.crearpersona();

        int vector[] = new int[4];

        vector[0] = servicio.calcularMc(persona1);
        vector[1] = servicio.calcularMc(persona2);
        vector[2] = servicio.calcularMc(persona3);
        vector[3] = servicio.calcularMc(persona4);

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (int i = 0; i < 4; i++) {
            switch (vector[i]) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                case 1:
                    cont3++;
                    break;

                default:
                    break;

            }
        }

        System.out.println("el porcentaje de bajo peso es " + (cont1 * 100) / 4);
        System.out.println("el porcentaje de ideal peso es " + (cont2 * 100) / 4);
        System.out.println("el porcentaje de sobre peso es " + (cont3 * 100) / 4);

        boolean vector2[] = new boolean[4];
        vector2[0] = servicio.esMayorDeEdad(null);
        vector2[1] = servicio.esMayorDeEdad(persona2);
        vector2[2] = servicio.esMayorDeEdad(persona3);
        vector2[3] = servicio.esMayorDeEdad(persona4);
        int menor = 0;
        int mayor = 0;
        for (int j = 0; j < 4; j++) {

            if (!vector2[j]) {
                menor++;

            }
            if (vector2[j]) {
                mayor++;
            }
        }
       
        

        System.out.println("La cantidad de mayores es " + (mayor * 100) / 4);
        System.out.println("La cantidad de menores es " + (menor * 100) / 4);
            

    }catch(NullPointerException e)  {
           System.out.println("Hay un error");
           System.out.println(e.toString());
    }catch(InputMismatchException ed)    {
           System.out.println("Escribi bien , tontin");
           ed.getStackTrace();
    }

}
}
