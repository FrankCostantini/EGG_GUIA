/*
 
 */
package guia.pkg2.poo.principal;

import guia.pkg2.poo.entidades.Book;
import java.util.Scanner;

public class zejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Book book1 = new Book();

        book1.pedirdatos();
       book1.toString();
    }

}
