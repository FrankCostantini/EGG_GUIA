/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas
 */
package ejercicio6.prinncipal;


import ejercicio6.servicios.ServicioProducto;


public class ejercicio6 {

    public static void main(String[] args) {
       
        ServicioProducto sv = new ServicioProducto();
    
        sv.menu();

    }

}

