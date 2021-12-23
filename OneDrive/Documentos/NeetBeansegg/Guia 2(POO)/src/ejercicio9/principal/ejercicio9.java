/*

 */
package ejercicio9.principal;

import ejercicio9.entidades.Matematicas;
import ejercicio9.servicios.MatematicasServicios;

public class ejercicio9 {

    public static void main(String[] args) {
        MatematicasServicios servicios = new MatematicasServicios();
        
        Matematicas mate = servicios.crearMatematica();
        
        System.out.println("El valor mayor es " +servicios.devolverMayor(mate));
        
        System.out.println("El mayor valor a la potencia del menor valor es " + servicios.calcularPotencia(mate));
        
        System.out.println("La raiz del menor valor es "+ servicios.calcularRaiz(mate));
    
    }
    
}
