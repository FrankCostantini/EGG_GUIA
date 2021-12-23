/*
 26. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).

 */
package guiaintro;

import java.util.Scanner;

public class zejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el tamaño");
        int tam = leer.nextInt();
        int[][] matriz = new int[tam][tam];
        int[][] matriz_traspuesta = new int[tam][tam];
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("ingrese un numero");
                int num = leer.nextInt();
                matriz[i][j] = num;

            }

        }
        System.out.println(" ahora llena la traspuesta");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("ingrese un numero");
                int num = leer.nextInt();
                matriz_traspuesta[i][j] = num;
            }

        }
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");

        }
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matriz_traspuesta[i][j] + " ");
            }
            System.out.println(" ");

        }
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (matriz[i][j] ==  matriz_traspuesta[j][i]) {
                    cont++;

                }
            }

        }

        if (cont == tam*tam) {
            System.out.println(" es anti simetrica");
        } else {
            System.out.println("no lo es");
        }

    }
}
