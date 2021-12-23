/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package ejercicio5.servicios;

import ejercicio5.entidades.Pais;
import ejercicio5.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ServicioPais {
    private Scanner leer ;
private HashSet <Pais> paises ;

    
    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
      paises = new HashSet();
    }
    
    
    
    public Pais crearPais() {
        
        System.out.println("Ingrese el nombre del pais ");
        String pais = leer.next();
        
       Pais paise = new Pais();
        paise.setPaises(pais);
       
       
        return paise ;
    }
    
    public void agregarPais(Pais p)   {
        
       paises.add(p);
    }
    
    public HashSet borrarPais()    {
        System.out.println("Ingrese el nombre a buscar");
        String buscar = leer.next();
        for (int i = 0 ; i < paises.size() ; i ++ ) {
            if (paises.equals(buscar))   {
                 paises.remove(i);
            }
                
          
        }
       return  paises;
    }
    
    public void mostrarPais()   {
        
        for (Pais aux : paises) {
            System.out.println(aux);
        }
        
    }
    
    public void mostrarPaisOrdenado()   {
      
        ArrayList<Pais> country = new ArrayList();
        
        for (Pais aux : paises ) {
            country.add(aux);
        }
       
       Collections.sort(country,Comparadores.ordenarAlfabeticamente);
        
      for (Pais aux : country )  {
          
          System.out.println(aux);
          
      } 
    }
}
