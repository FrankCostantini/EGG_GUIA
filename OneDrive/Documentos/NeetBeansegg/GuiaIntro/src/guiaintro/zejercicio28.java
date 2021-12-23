/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
 */
package guiaintro;

import java.util.Scanner;

public class zejercicio28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matrizm = new int[10][10];
        int[][] matrizp = new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizm[i][j] = (int) (Math.random() * 9);

            }

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizm[i][j] + " ");

            }
            System.out.println(" ");

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese los valores de matrip P");
                int num = leer.nextInt();
                matrizp[i][j] = num;

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizp[i][j] + " ");

            }
            System.out.println(" ");

        }
        int cont = 0;

        for (int i = 0; i < matrizm.length - matrizp.length; i++) {
            for (int j = 0; j < matrizm.length - matrizp.length; j++) {
                cont = 0;
                if (matrizm[i][j] == matrizp[0][0]) {
                    cont = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizp[k][l] == matrizm[i + k][j + l]) {
                                cont++;
                            }
                        }

                    }
                    if (cont == 9) {

                        System.out.println("si la contiene");
                        System.out.println("la ubicacion es " + i + " ," + j);
                    }

                }

            }

        }

    }

}
