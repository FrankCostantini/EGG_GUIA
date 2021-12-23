/*

 */
package ejercicio2extra.principal;

import ejercicio2extra.entidades.CantanteFamoso;
import ejercicio2extra.servicio.ServicioCantanteFamoso;

public class ejercicio2extra {

    public static void main(String[] args) {
      ServicioCantanteFamoso s = new ServicioCantanteFamoso(); 
        
        
        
        for (int i = 0; i < 5; i++) {
           CantanteFamoso cf =s.crearCantante();
           s.agregarLista(cf);
   
        }
        
        s.menu();
        
        
        
        
        
    }
    
}
