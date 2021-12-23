/*
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
20
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package ejercicio3extra.servicios;

import ejercicio3extra.entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class ServicioLibro {

    private HashSet<Libro> libros;
    private Scanner leer;

    public ServicioLibro() {
        libros = new HashSet();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Libro crearLibro() {

        System.out.println("Ingrese el titulo ");
        String titutlo = leer.next();
        System.out.println("Ingrese el autor ");
        String autor = leer.next();

        System.out.println("Ingrese el numero ejemplar prestado ");
        int ejmplarPrestado = leer.nextInt();

        Libro lb = new Libro();

        lb.setTitulo(titutlo);
        lb.setAutor(autor);

        lb.setEjemplaresPrestados(ejmplarPrestado);

        return lb;

    }

    public void agregarLista(Libro lb) {

        libros.add(lb);

    }

    public void prestamo() {
      
        int cont = 0;
        System.out.println("Que libro quiere prestar ");
        String titulazo = leer.next();

        for (Libro libro : libros) {
            if (libro.equals(titulazo)) {

                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
                
            }else
                System.out.println("No lo tenemos");

        }
       
    }

//     Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
//lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
//El método decrementa de a uno, como un carrito de compras, el atributo
//ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
//vez que se produzca la devolución de un libro. No se podrán devolver libros
//donde que no tengan ejemplares prestados. Devuelve true si se ha podido
//realizar la operación y false en caso contrario.
//• Método toString para mostrar los datos de los libros.
// */
    public void devolucion() {
        System.out.println("Ingresa el titulo del libro al cual quiere hacer una devolucion");
        String name = leer.next();

        for (Libro libro : libros) {

            if (libro.equals(name)) {
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);

            }else
                System.out.println("No lo tenemos");

        }

    }

    public void menu() {
        String salida = "";
        int resp = 0;

        do {
            System.out.println("MENU");
            System.out.println("1.Crear Libro");
            System.out.println("2.Prestamo");
            System.out.println("3.Devolucion");
            resp = leer.nextInt();
            switch (resp) {
                case 1:
                    Libro l = crearLibro();
                    agregarLista(l);
                    break;

                case 2:
                    prestamo();
                    break;
                case 3:
                    devolucion();
                    break;

            }
            System.out.println("Desea Salir (S/N)");
            salida = leer.next();
            
        }while(salida.contains("n"));
      
    

        
        
        
        
    
    }

    public void tostring() {

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

}
