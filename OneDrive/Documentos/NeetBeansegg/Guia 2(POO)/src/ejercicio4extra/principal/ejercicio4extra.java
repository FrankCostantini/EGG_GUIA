/*

 */
package ejercicio4extra.principal;

import ejercicio4extra.entidades.Nif;
import ejercicio4extra.servicios.NifServicios;

public class ejercicio4extra {

    public static void main(String[] args) {
      
        NifServicios servicios = new NifServicios();
        Nif civil = servicios.crearNif();
        
        servicios.mostrarNif(civil);
        
        
        
        
    }
    
}
