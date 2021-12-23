
package ejercicio4extra;

import ejercicio4extra.entidades.Ciudad;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio4extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer,String> ciudades = new HashMap();
        String ind = "";
        do {
           System.out.println("Ingrese el codigo postal");
        int cod = leer.nextInt();
        
        System.out.println("Ingrese la ciudad");
        String ciudad = leer.next();
        
        Ciudad cd = new Ciudad();
        
        cd.setCiudad(ciudad);
        cd.setPostal(cod);
        
        ciudades.put(cd.getPostal(),cd.getCiudad()); 
        
        
            System.out.println("DESEA SALIR (S/N)");
            ind = leer.next();
        } while (ind.contains("n"));
        
       
   
        
        
        
        
        System.out.println("Ingrese el codigo a buscar");
        int codbusc = leer.nextInt();
        
        
         for (Map.Entry<Integer,String > entry : ciudades.entrySet()) {
            if (codbusc ==  entry )   {
                
                System.out.println(entry);
            }
           
        }
        
    }
    
}
