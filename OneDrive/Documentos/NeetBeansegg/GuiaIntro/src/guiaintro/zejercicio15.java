package guiaintro;

import java.util.Scanner;

public class zejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
 String salir ="";
 
        do {
           
            System.out.println("ingrese el primer numero");
            int num1 = leer.nextInt();
            System.out.println("ingrese el segundo numero");
            int num2 = leer.nextInt();
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Resstar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opciòn:");
            int resp = leer.nextInt();
            switch (resp) {
                case 1:
                    System.out.println(num1 + num2);
                    System.out.println("deseas salir (S,N)");
                     salir = leer.next();
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    System.out.println("deseas salir (S,N)");
                     salir = leer.next();
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    System.out.println("deseas salir (S,N)");
                     salir = leer.next();
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    System.out.println("deseas salir (S,N)");
                     salir = leer.next();
                    break;
                case 5:
                    System.out.println("*Salir");
                    System.out.println("deseas salir (S,N)");
                     salir = leer.next();
                    break;
            }

        } while (!salir.equals("s")) ;

 } 
}

