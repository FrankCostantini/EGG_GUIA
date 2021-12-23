/*
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas
 */
package ejercicio6.servicios;

import ejercicio6.entidades.Producto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class ServicioProducto {

    private HashMap<String, Producto> productos;
    private Scanner leer;

    public ServicioProducto() {
        productos = new HashMap();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Producto crearProducto() {

        System.out.println("Ingrese el nombre del producto");
        String nameprod = leer.next();
        System.out.println("Ingrese el precio del producto ");
        int precio = leer.nextInt();
        Producto prod = new Producto();

        prod.setNombre(nameprod);
        prod.setPrecio(precio);

        return prod;

    }

    public void agregarLista(Producto p) {

        productos.put(p.getNombre(), p);

    }

    public void modificarPrecio(Producto p) {

        System.out.println("ingrese el producto que quiere modificar");
        String name = leer.next().toLowerCase();
        System.out.println("Ingrese el precio que desea a colocar");
        int prec = leer.nextInt();
//        Producto pd = new Producto();
        p.setNombre(name);
        p.setPrecio(prec);

        for (Map.Entry<String, Producto> aux : productos.entrySet()) {
            if (aux.equals(name)) {
                productos.replace(name, p);

            }

        }

    }

    public void eliminarProducto(Producto p) {

        System.out.println("Que Producto desea eleminar");
        String nameprod = leer.next();

        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            String key = entry.getKey();
            Producto value = entry.getValue();

            if (entry.equals(key)) {
                productos.remove(p);
            }

        }

    }

    public void mostrar() {

        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            String key = entry.getKey();
            Producto value = entry.getValue();
            System.out.println(entry);
        }

    }

    public void menu() {
      int resp = 0 ;
      String ind = "";
      do    {
        System.out.println("--------------------------------------");
        System.out.println("Agregar otro producto ? (s/n)");
        ind = leer.next();
        if (ind.contains("s")) {
            Producto p = crearProducto();
            agregarLista(p);
        }

            System.out.println("=======================================");
            System.out.println("MENU :");

         
            System.out.println("1.Modificar Precio");
            System.out.println("2.Eliminar producto");
            System.out.println("3.Mostrar");
            resp = leer.nextInt();

            switch (resp) {
             
                case 1:
                    modificarPrecio(p);

                    break;
                case 2:
                    eliminarProducto(p);
                    break;
                case 3:
                    mostrar();
                    break;

            }
        

    }while(ind.contains("s") );

}
}
