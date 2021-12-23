package ejercicio3.relaciones.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Maso {

    private ArrayList<Carta> cartas;
     ArrayList <Carta>dadas = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Maso(ArrayList<Carta> cartas) {

        this.cartas = cartas;
    }

    public Maso() {
    }
    
    
public void agregarCartas (ArrayList<Carta>cart)    {
    
    cartas = cart;
}

    public void llenarCartas() {
        for (int i = 1; i < 13; i++) {

            if (i != 8 && i != 9) {

                cartas.add(new Carta(i, "Espada"));

            }

        }

        for (int i = 1; i < 13; i++) {

            if (i != 8 && i != 9) {

                cartas.add(new Carta(i, "Copa"));

            }

        }

        for (int i = 1; i < 13; i++) {

            if (i != 8 && i != 9) {

                cartas.add(new Carta(i, "Basto"));

            }

        }

        for (int i = 1; i < 13; i++) {

            if (i != 8 && i != 9) {

                cartas.add(new Carta(i, "Oro"));

            }

        }

    }

    public void barajar() {

        Collections.shuffle(cartas,new Random());

    }


    public void siguienteCarta() {

        for (int i = 0; i < 40; i++) {
            
            cartas.remove(i);
             dadas.add(cartas.get(i));
           
            if (i == 0) {
                break;
            }

        }

    }


    public void cartasDisponibles() {

        System.out.println(cartas.size());

    }


    public void darCartas() {
        
        System.out.println("Numeros  de cartas");
        int numcart = leer.nextInt();

        if (cartas.size() > numcart) {
            for (int i = numcart - 1; i >= 0; i--) {
           
                 cartas.remove(i);
                dadas.add(cartas.get(i));
               
              

                
            }

        } else {
            System.out.println("No tenemos suficientes cartas");
        }
        
    }


    public void cartasMonton() {
        
        for (Carta dada : dadas) {
            System.out.println(dada);
        }
        
        
        


    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta.getNum()+"-"+ carta.getPalos());
        }
    }
}
