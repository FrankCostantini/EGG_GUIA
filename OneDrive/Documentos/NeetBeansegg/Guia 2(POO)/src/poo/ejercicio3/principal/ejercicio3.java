/*

 */
package poo.ejercicio3.principal;




import poo.ejercicio3.entidades.Operacion;
import poo.ejercicio3.servicios.OperacionServicios;

public class ejercicio3 {

    public static void main(String[] args) {
        OperacionServicios op = new OperacionServicios();
        
       Operacion cuenta = op.crearOperacion();
       
       
       
        System.out.println("la sumatoria : "+op.Sumatoria(cuenta));
        System.out.println("la division es : "+op.Division(cuenta));   
        System.out.println("la resta es : "+op.Resta(cuenta));
        System.out.println("la multiplicacion es : "+ op.Multiplicacion(cuenta));
        
        
        
       
    }

}
