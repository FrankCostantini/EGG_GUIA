/*

 */
package ejercicio6extra.servicios;

import ejercicio6extra.entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra ");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de jugadas maximas ");
        int jugadas = leer.nextInt();

        String[] vector = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            vector[i] = palabra.substring(i, i + 1);
        }

        Ahorcado juego = new Ahorcado();

        juego.setCantjugadas(jugadas);
        juego.setCantletras(0);
        juego.setVector(vector);

        return juego;

    }
    
    public String  VectorVacio(Ahorcado a)   {
        
        String [] vectorvacio = new String [(int)a.getVector().length];
        
        
        for (int i = 0; i <(int)a.getVector().length ; i++) {
            if (a.getVector()[i].equals(" "))   {
              vectorvacio[i]="/";
            }else   {
                vectorvacio[i]="_";
            }
           
            
        }
       return vectorvacio;
        
    }

    public void metodolongitud(Ahorcado at) {

        System.out.println("La longitud de la palabra es de " + at.getVector().length);

    }

    public boolean buscar(Ahorcado j, String letra) {
        System.out.println(Arrays.toString(j.getVector()));
        return Arrays.toString(j.getVector()).contains(letra);
    }

    public void encontradas(Ahorcado j) {
        int cont = 0;
        do{
            System.out.println("Ingrese la letra");
            String letra = leer.next();
            if (buscar(j, letra)) {
                System.out.println("Letra encontrada");
                j.setCantletras(j.getCantletras()+ 1);

            } else {
                j.setCantjugadas(j.getCantjugadas() - 1);

            }
            if (j.getVector().length == j.getCantletras()) {
                System.out.println("Ganaste");
                return;
            }
            if( j.getCantjugadas()== 0 )  {
                System.out.println("Perdiste");
                return;
            }
            
            intentos(j);
            
        } while(j.getCantjugadas() > 0);

    }

    public void intentos(Ahorcado j) {
        System.out.println("Te quedan " + j.getCantjugadas() + " intentos");

    }

    public void juego(Ahorcado at) {
        metodolongitud(at);
        encontradas(at);
        intentos(at);

    }

}
