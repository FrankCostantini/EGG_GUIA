/*

 */
package ejercicio3extra.entidades;

import java.util.Scanner;


public class Hotel4 extends Hotel {
    
 protected String gimnasio;
 protected String nombreRestaurante;
 protected Integer capacidadRestaurante;
 private Scanner leer ;

    public Hotel4(Integer cantHabitaciones, Integer nDcamas, Integer canPisos, Integer precioHabitacion, String direccion, String localidad, String gerente,String gimnasio,String nombreRestaurante,Integer capacidadRestaurante) {
        super(cantHabitaciones, nDcamas, canPisos, precioHabitacion, direccion, localidad, gerente);
        this.gimnasio= gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Hotel4() {
      leer = new Scanner(System.in).useDelimiter("\n");
    }



    public String isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }
    
   public void clasificacionGimnasio()  {
       System.out.println("Clasifique el gimnasio (A/B)");
       gimnasio = leer.next().toLowerCase();
   
   }
    

   public Integer valorRestaurante()   {

   Integer precio = 0 ;

      if (capacidadRestaurante<30)  {
          precio = precio + 10;
          
      }
      if (capacidadRestaurante>30 && capacidadRestaurante<50 )  {
          precio = precio + 30 ;        
      }
      if ( capacidadRestaurante > 50 )  {
          
          precio = precio + 50;
      }
       
       return precio ;
   }
   
   
   public Integer valorGimnasio()    {
       Integer precio =0;
       if (gimnasio.contains("a"))  {
           precio = precio + 50 ;
           
       }
       if (gimnasio.contains("b"))  {
           precio = precio + 30;
           
       }
       return precio ;
       
   }
   
 @Override
 public void precioHabitacion()     {
super.precioHabitacion();

     super.precioHabitaciones = super.precioHabitaciones  + valorRestaurante() + valorGimnasio();
 }
   
 
}
 
 
 
    
    
    

