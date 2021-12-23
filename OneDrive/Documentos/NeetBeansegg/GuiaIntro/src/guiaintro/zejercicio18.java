/*
8. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String
 */
package guiaintro;

public class zejercicio18 {

    public static void main(String[] args) {

        int i, j, k, r;

        for (i = 0; i < 10; i++) {

            for (j = 0; j < 10; j++) {

                for (k = 0; k < 10; k++) {
                    String numerocadenai = String.valueOf(i);
                    String numerocadenaj = String.valueOf(j);
                    String numerocadenak = String.valueOf(k);

                    if (numerocadenai.equals("3")) {
                        numerocadenai= "E";

                    }
                    if (numerocadenaj.equals("3")) {
                        numerocadenaj= "E";

                    }
                    if (numerocadenak.equals("3")) {
                        numerocadenak= "E";

                    }
                    
                    System.out.println(numerocadenai+ "" + numerocadenaj + "" + numerocadenak );
                }
            }

        }

    }
}
