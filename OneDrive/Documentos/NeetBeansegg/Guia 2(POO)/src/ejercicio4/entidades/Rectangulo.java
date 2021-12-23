/*

 */
package ejercicio4.entidades;

import java.util.Scanner;

public class Rectangulo {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void pedirDatos() {
        System.out.println("ingrese la base ");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura");
        this.altura = leer.nextInt();
    }

    public int perimetro(int base, int altura) {
        return (base + altura) * 2;
    }

    public int superficie(int base, int altura) {

        return base * altura;
    }
    
    
    

    public void Imprimir(int base, int altura) {
        int i, j;

        for (i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (i = 0; i < base - 2; i++) {
            System.out.print("*");
            for (j = 0; j < base - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for( i = 0; i < base ; i++) {
                System.out.print("*");
            }

    }

}
