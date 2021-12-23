/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
18
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicio6.servicios;

import ejercicio6.entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera CrearCafetera() {
        System.out.println("Ingrese la capacidad maxima de la cafetera ");
        int capacidadMax = leer.nextInt();
        System.out.println("Ingrese la capacidad actual");
        int capacidadActual = leer.nextInt();

        return new Cafetera(capacidadMax, capacidadActual);

    }

    public void llenarcafetera(Cafetera capactual, Cafetera capmax) {

        capactual.setCapacidadActual(capmax.getCapacidadMaxima());

    }

    public void servirTaza(Cafetera capactual, Cafetera capmax) {
        System.out.println("Ingrese el tamaño de su taza vacia ");
        int tazavacia = leer.nextInt();

        if (capactual.getCapacidadActual() == 0) {
            System.out.println(" no tenemos mas cafe ");

        } else {
            if (capactual.getCapacidadActual() >= tazavacia) {

                capactual.setCapacidadActual(capactual.getCapacidadActual() - tazavacia);
                System.out.println("se lleno la taza");
            } else {

                System.out.println("Te falta esta cantidad para llenarla de cafe " +(tazavacia-capactual.getCapacidadActual()));
                System.out.println("Te llenaremos con lo que tenemos en la cafetera");
                capactual.setCapacidadActual(0);

            }
        }

    }

    public void vaciarCafetera(Cafetera capacidadActual) {
        capacidadActual.setCapacidadActual(0);
    }

    public void agregarCafe(Cafetera capacidadMaxima) {
        System.out.println("Cuanta Cantidad de Café desea agregar ");
        int agregcafe = leer.nextInt();
        capacidadMaxima.setCapacidadMaxima(capacidadMaxima.getCapacidadMaxima() + agregcafe);
    }

}



