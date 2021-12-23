/*

 */
package ejercicio5.utilidades;

import ejercicio5.entidades.Pais;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pais> ordenarAlfabeticamente = new Comparator<Pais>()   {

        @Override
        public int compare(Pais t, Pais t1) {
            return t.getPaises().compareTo(t1.getPaises());
        }
    
};
    
    
    
}
