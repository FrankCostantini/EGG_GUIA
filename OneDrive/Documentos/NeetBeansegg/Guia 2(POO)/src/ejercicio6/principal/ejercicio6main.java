/*

 */
package ejercicio6.principal;

import ejercicio6.entidades.Cafetera;
import ejercicio6.servicios.CafeteraServicios;
import java.util.Scanner;

public class ejercicio6main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CafeteraServicios servicio = new CafeteraServicios();
        
        Cafetera Cafetera = servicio.CrearCafetera();
        
        System.out.println("Elija una opcion :");
        System.out.println("1 = llenar Cafetera");
        System.out.println("2 = servir Taza");
        System.out.println("3 = vaciar Cafetera");
        System.out.println("4= agregar Cafe");
       int opcion = leer.nextInt();
        
       switch (opcion)  {
           case 1 : servicio.llenarcafetera(Cafetera, Cafetera);
           break;
           case 2 : servicio.servirTaza(Cafetera, Cafetera);
           break ;
           case 3 : servicio.vaciarCafetera(Cafetera);
           break ;
           case 4 : servicio.agregarCafe(Cafetera);
           break;
           default : System.out.println("Escribiste cualquier cosa macho");
       }
    
        

    }

}
