/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)*/
package guiaintro;

import java.util.Scanner;

public class zejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el tamaño ");
        int n = leer.nextInt();
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < n; i++) {
            if (vector[i] > 0 && vector[i] < 9) {
                cont1++;

            }
            if (vector[i] > 9 && vector[i] < 99) {
                cont2++;
            }
            if (vector[i] > 99 && vector[i] < 999) {
                cont3++;

            }
            if (vector[i] > 999 && vector[i] < 9999) {
                cont4++;
            }
            
        }
        System.out.println("De una cifra: "+ cont1 + " De dos cifras : "+cont2 + "De tres cifras :"+cont3 + " De cuatro cifras"+cont4);

    }

}
