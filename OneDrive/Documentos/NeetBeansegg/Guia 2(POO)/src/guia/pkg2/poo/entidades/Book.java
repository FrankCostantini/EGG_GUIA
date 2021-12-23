/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
package guia.pkg2.poo.entidades;

import java.util.Scanner;

public class Book {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Book(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Book() {
       
    }

    public void pedirdatos() {

        System.out.println("ingrese el ISBN");
        isbn = leer.nextInt();
        System.out.println("ingrese el titulo");
        titulo = leer.next();
        System.out.println("ingrese el autor ");
        autor = leer.next();
        System.out.println(" ingrese el numero de paginas ");
        numeroPaginas = leer.nextInt();

    }

    @Override
    public String toString() {
        return "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas;
    }

}
