/*

 */
package ejercicio3extra.entidades;

public class Hotel5 extends Hotel4{
    protected Integer cantSalonesConferencia;
    protected Integer cantSuites;
    protected Integer cantLimosinas;

    public Hotel5(Integer cantHabitaciones, Integer nDcamas, Integer canPisos, Integer precioHabitacion, String direccion, String localidad, String gerente, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante,Integer cantSalonesConferencia,Integer cantSuites,Integer cantLimosinas) {
        super(cantHabitaciones, nDcamas, canPisos, precioHabitacion, direccion, localidad, gerente, gimnasio, nombreRestaurante, capacidadRestaurante);
       this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites= cantSuites;
        this.cantLimosinas =cantLimosinas;
    }

    public Integer getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(Integer cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
    @Override
    public void clasificacionGimnasio() {
       super.clasificacionGimnasio();   
    }
    
    
    @Override
   public Integer valorRestaurante()    {
     return super.valorRestaurante();   
   }
   
    @Override
    public Integer valorGimnasio()      {
        return super.valorGimnasio();
    
    }
    
  
      public Integer valorLimosina()   {
       
       return +15;
    
   }
      
    @Override
     public void precioHabitacion()     {
         
         super.precioHabitacion();
          super.precioHabitaciones  =super.precioHabitaciones + valorLimosina();
     }
    
    
}
