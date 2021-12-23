/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.


/////
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2
posibles soluciones.

• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
caso de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b 
 */
package ejercicio3extra.servicios;

import ejercicio3extra.entidades.Raices;
import java.util.Scanner;

public class RaicesServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices construirRaices() {
        System.out.println("Ingrese el valor de a ");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor de b");
        int b = leer.nextInt();
        System.out.println("Ingrese el valor de c ");
        int c = leer.nextInt();

        Raices raices = new Raices();

        raices.setA(a);
        raices.setB(b);
        raices.setC(c);

        return raices;

    }

    public double getDescriminante(Raices a) {

        return Math.pow(a.getB(), 2) - 4 * a.getA() * a.getC();

    }

    public boolean tieneRaices(Raices a) {

        return getDescriminante(a) >= 0;

    }

    public boolean tieneRaiz(Raices atributos) {
        return getDescriminante(atributos) == 0;

    }

    public void obtenerRaices(Raices a) {
        if (tieneRaices(a)) {
            System.out.println("*Tus raices son :");
            //(-b±√((b^2)-(4*a*c)))/(2*a)

            System.out.println(-a.getB() + Math.sqrt(getDescriminante(a)) / (2 * a.getA()));

            System.out.println(-a.getB() - Math.sqrt(getDescriminante(a)) / (2 * a.getA()));

        }

    }

    public void obtenerRaiz(Raices a) {

        System.out.println("-------------");
        System.out.println("Tiene una raiz ");
        System.out.println((-a.getB()) + (Math.sqrt(Math.pow(a.getB(), 2) - (4 * a.getA() * a.getC()))) / (2 * a.getA()));

    }

    public void calcular(Raices a) {
        if (tieneRaiz(a) == false && tieneRaices(a) == false) {

            System.out.println("No tiene raices ");

        }
        if (tieneRaices(a)) {
            obtenerRaices(a);

        }
        if (tieneRaiz(a)) {
            obtenerRaiz(a);
        }

    }

}
