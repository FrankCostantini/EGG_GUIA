/*

 */
package ejercicio4extra.servicios;

import ejercicio4extra.entidades.Nif;
import java.util.Scanner;

public class NifServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Nif crearNif() {
        
        System.out.println(" Ingrese  el dni");
        long dni = leer.nextLong();
        
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        int ubicacion = (int) dni % 23;
        
        
        Nif setear = new Nif();
        
        setear.setDni(dni);
        setear.setLetra(letras[ubicacion]);
        
        
        return setear;
        
        
    }
    
    public void mostrarNif(Nif a)    {
        
        System.out.println(a.getDni() + "-" + a.getLetra() );

    }
    
}
