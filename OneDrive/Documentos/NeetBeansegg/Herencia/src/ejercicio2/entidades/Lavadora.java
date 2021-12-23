/*

 */
package ejercicio2.entidades;

import java.util.Scanner;

public final class Lavadora extends Electrodoméstico {
    private Scanner leer ;
    private int  carga;

    public Lavadora(int carga, int precio, String color, String consumoEnergico, int peso) {
        super(precio, color, consumoEnergico, peso);
        this.carga = carga;
    }

    public Lavadora() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crear() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga");
        carga = leer.nextInt();
        
    }
    
    @Override
    public void precioFinal()   {
      super.precioFinal();
       if(carga>30) {
           super.precio = precio + 500;
       }
    
    }
    
    
    
    @Override
    public void mostrar()   {
       super.mostrar();
        System.out.println("CARGA ="+carga);
        
    }
    
    

}
