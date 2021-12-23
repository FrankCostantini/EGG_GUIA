/*

 */
package ejercicio8.servicios;

import ejercicio8.entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {

        System.out.println("ingrese una frase ");
        Cadena frase = new Cadena();
        frase.setFrase(leer.next().toLowerCase());

        return frase;
    }

    public void mostrarVocales(Cadena f) {
        int cont = 0;
        for (int i = 0; i < f.getFrase().length(); i++) {

            if (f.getFrase().substring(i, i + 1).equals("a") || f.getFrase().substring(i, i + 1).equals("e") || f.getFrase().substring(i, i + 1).equals("i") || f.getFrase().substring(i, i + 1).equals("o") || f.getFrase().substring(i, i + 1).equals("u")) {
                cont++;
            }

        }

        System.out.println("Tiene " + cont + " vocales");
    }

    public void invertirFrase(Cadena f) {
        String invertido = "";
        
        for (int i = f.getFrase().length() - 1; i >= 0; i--) {

            invertido = invertido + f.getFrase().substring(i, i + 1);
        }

        System.out.println(invertido);
    }

    public void vecesRepetido(Cadena f) {
        System.out.println("Ingrese un caracter");
        String carac = leer.next();
        int cont = 0;
        for (int i = 0; i < f.getFrase().length(); i++) {
            if (f.getFrase().substring(i, i + 1).equals(carac)) {
                cont++;
            }
        }
        System.out.println("El caracter " + carac + ",se encuentra " + cont);

    }

    public void compararLongitud(Cadena f) {
        System.out.println("Ingrese la frase a comparar");
        String frase2 = leer.next();

        System.out.println("La longitud de la longitud de la frase es " + f.getFrase().length() + " .Y la logitud de la nueva frase es " + frase2.length());

    }

    public void unirFrases(Cadena frase) {
        System.out.println("Ingrese la frase con la que quieres concaternar");
        String frasedos = leer.next();

        System.out.println(frase.getFrase() + frasedos);

    }

    public void reemplazar(Cadena frase) {
        System.out.println("Ingrese por que caracter queres remplazar la a");
        String carac = leer.next();
        for (int i = 0; i < frase.getFrase().length(); i++) {

            if (frase.getFrase().substring(i, i + 1).equals("a")) {
                frase.setFrase(frase.getFrase().replace("a", carac));
            }

        }
        System.out.println(frase.getFrase());
    }

    public boolean contiene(Cadena f) {
       System.out.println("ingrese el caracter a buscar");
        String carac = leer.next();
        
        return f.getFrase().contains(carac);
        
       
//        boolean ind = true;
//
//        for (int i = 0; i < f.getFrase().length(); i++) {
//            ind = f.getFrase().substring(i, i + 1).equals(carac);
//            if(f.getFrase().substring(i, i + 1).equals(carac))      {
//              i =  f.getFrase().length();
//            }
//           
//            
//
//        }
//        return ind;





    }
}
