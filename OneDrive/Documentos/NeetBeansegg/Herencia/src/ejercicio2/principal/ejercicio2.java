/*

 */
package ejercicio2.principal;

import ejercicio2.entidades.Electrodoméstico;
import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

public class ejercicio2 {

    public static void main(String[] args) {
        List<Electrodoméstico> els = new ArrayList();
        Electrodoméstico tev = new Televisor(43,true,1000,"Azul","A",32);
        Electrodoméstico lav = new Lavadora(43,1321,"Azul","A",43);


        
        els.add(tev);
        els.add(lav);
               


        for (Electrodoméstico el: els) {
            
            if(el instanceof Lavadora ) {
                System.out.println("LAVADORA");
               el.precioFinal();
               el.mostrar();
                System.out.println("=========================");
               
                
            }else   {
                System.out.println("TELEVISOR");
          
                el.precioFinal();
                el.mostrar();
                
                System.out.println("=================================");
                
            }
            
            
            
        }
        
    }

}


