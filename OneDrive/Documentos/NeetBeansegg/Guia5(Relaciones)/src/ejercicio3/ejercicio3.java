package ejercicio3;

import ejercicio3.relaciones.entidades.Carta;
import ejercicio3.relaciones.entidades.Maso;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
Random randon = new Random ();
        Maso maso = new Maso();
        Carta carta = new Carta();
        ArrayList cartas = new ArrayList();
         maso.agregarCartas(cartas);
        maso.llenarCartas();

        String resp= ""; 
        do {
            
 
        
        System.out.println("1.BARAJAR");
        System.out.println("2.SIGUIENTE CARTA");
        System.out.println("3.CARTAS DISPONIBLES");
        System.out.println("4.DAR CARTAS");
        System.out.println("5.CARTAS DADAS");
        System.out.println("6.MOSTRAR MAZO");
        int caso = leer.nextInt();

        switch (caso) {

            case 1:
                maso.barajar();
                break;

            case 2:
                maso.siguienteCarta();
                break;

            case 3:
                maso.cartasDisponibles();
                break;

            case 4:
                maso.darCartas();
                break;

            case 5:
                maso.cartasMonton();
                break;

            case 6:
                maso.mostrarBaraja();

        }

        
            System.out.println("DESEA SALIR ( S /N) "); 
           resp = leer.next();
        
        
    }while(resp.contains("n"));

}
}
