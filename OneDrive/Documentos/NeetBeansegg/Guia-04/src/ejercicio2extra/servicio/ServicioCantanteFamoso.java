/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios. 
 */
package ejercicio2extra.servicio;

import ejercicio2extra.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioCantanteFamoso {

    Scanner leer;
    private ArrayList<CantanteFamoso> cantantes;

    public ServicioCantanteFamoso() {
        cantantes = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public CantanteFamoso crearCantante() {

        System.out.println("Ingrese el nombre del cantante  ");
        String name = leer.next();

        System.out.println("Ingrese el disco mas famoso ");
        String disco = leer.next();

        CantanteFamoso cf = new CantanteFamoso();

        cf.setNombre(name);
        cf.setDiscoConMasVentas(disco);

        return cf;

    }

    public void agregarLista(CantanteFamoso cf) {

        cantantes.add(cf);

    }

    public void mostrar() {

        for (CantanteFamoso aux : cantantes) {
            System.out.println(" Artista :  " + aux.getNombre() + " Disco " + aux.getDiscoConMasVentas());
        }

    }

    public void eliminar() {

        Iterator<CantanteFamoso> it = cantantes.iterator();
        System.out.println("Que usuario desea eliminar ");
        String name = leer.next();

        while (it.hasNext()) {
            CantanteFamoso aux = it.next();

            if (it.equals(name)) {
                it.remove();

            }

        }

    }

    public void menu() {

        int resp = 0;

        do {
            System.out.println("============================");
            System.out.println("1.Agregar un cantante mas ");
            System.out.println("2.Mostrar");
            System.out.println("3.Eliminar un cantante ");
            System.out.println("4.Salir del programa ");
            resp = leer.nextInt();

            switch (resp) {
                case 1:
                    CantanteFamoso cf = crearCantante();
                    agregarLista(cf);
                    break;

                case 2:
                    mostrar();
                    break;
                case 3:
                    eliminar();
                    break;

            }
        } while (resp != 4);

    }

}
