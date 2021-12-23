/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package ejercicio5.principal;

import ejercicio5.entidades.Pais;
import ejercicio5.servicios.ServicioPais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPais servicio =  new ServicioPais();
        
        
       String ind = "";
        do {
        
        Pais p = servicio.crearPais();
        servicio.agregarPais(p);
     
        System.out.println("Dese ingresar otro pais");
          ind = leer.next().toLowerCase();
        
        } while (ind.contains("s"));
        
        servicio.mostrarPais();
        servicio.mostrarPaisOrdenado();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        String ind = "";
//
//        Pais country = new Pais();
//        TreeSet<Pais> paises = new TreeSet();
//
//        Iterator<Pais> it = paises.iterator();
//        do {
//
//            System.out.println(" Ingrese el Pais ");
//
//           String pais = leer.next();
//           country.setPaises(pais);
//
//          paises.add(country);
//
//            System.out.println("Dese ingresar otro pais");
//            ind = leer.next().toLowerCase();
//
//        } while (ind.contains("s"));
//
//        for (Object paise : paises) {
//            System.out.println(paise);
//
//        }
//
//        System.out.println("Ingrese un pais ");
//        String buscar = leer.next();
//
//        while (it.hasNext()) {
//            Pais next = it.next();
//
//            if (next.equals(buscar)) {
//                it.remove();
//            }
//        }
//
//        for (Pais paise : paises) {
//            System.out.println(paise);
//        }
//





    }

}
