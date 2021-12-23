/*

 */
package ejercicio2.entidades;

import java.util.Scanner;

public final  class Televisor extends Electrodoméstico {
    private   Scanner leer ;
    
    private int resolucion ;
    private boolean sintonizar_tdt;

    public Televisor(int resolucion, boolean sintonizar_tdt, int precio, String color, String consumoEnergico, int peso) {
        super(precio, color, consumoEnergico, peso);
        this.resolucion = resolucion;
        this.sintonizar_tdt = sintonizar_tdt;
    }

    public Televisor() {
       leer = new Scanner(System.in).useDelimiter("\n");
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizar_tdt() {
        return sintonizar_tdt;
    }

    public void setSintonizar_tdt(boolean sintonizar_tdt) {
        this.sintonizar_tdt = sintonizar_tdt;
    }
    
    public void crear()    {
        super.crearElectrodomestico();
        
        System.out.println("pulgadas");
       resolucion = leer.nextInt();
        System.out.println("tiene sintonizador");
        String sintonizador = leer.next();
        if (sintonizador.contains("si"))    {
            sintonizar_tdt = true ;
            
        }
        if ( sintonizador.contains("no"))   {
            sintonizar_tdt = false ;
        }
        
    }
    
    /**
     *
     */
    @Override
    public void precioFinal()   {
        
        super.precioFinal();
        if (resolucion > 40 )   {
            precio = precio + ((precio *30) /100);
            
        }
        if (sintonizar_tdt) {
            
            precio = precio + 500 ;
        }
      
        
        
    }
    
    @Override
    public void mostrar()   {
        
       super.mostrar();
        System.out.println("RESOLUCION = "+  resolucion);
        System.out.println( "TDT = "+ sintonizar_tdt);
    }

   
    
    
    
    
    
    
    
}
