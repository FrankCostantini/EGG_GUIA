/*

 */
package ejercicio8.principal;

import ejercicio8.entidades.Cadena;
import ejercicio8.servicios.CadenaServicios;

public class ejercio8 {

    public static void main(String[] args) {

        CadenaServicios servicio = new CadenaServicios();

        Cadena cad = servicio.crearCadena();

        servicio.mostrarVocales(cad);
        servicio.invertirFrase(cad);
        servicio.vecesRepetido(cad);
        servicio.compararLongitud(cad);
        servicio.unirFrases(cad);
        servicio.reemplazar(cad);

        System.out.println("es  " + servicio.contiene(cad));

    }

}
