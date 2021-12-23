/*
El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas)
 */
package ejercicio3extra.entidades;

public class Hotel extends Alojamiento {
    
    protected Integer cantHabitaciones;
    protected Integer nDcamas;
    protected Integer canPisos;
    protected Integer precioHabitaciones;

    public Hotel(Integer cantHabitaciones, Integer nDcamas, Integer canPisos, Integer precioHabitacion, String direccion, String localidad, String gerente) {
        super(direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nDcamas = nDcamas;
        this.canPisos = canPisos;
        this.precioHabitaciones = precioHabitacion;
    }

    public Hotel() {
    }
    

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getnDcamas() {
        return nDcamas;
    }

    public void setnDcamas(Integer nDcamas) {
        this.nDcamas = nDcamas;
    }

    public Integer getCanPisos() {
        return canPisos;
    }

    public void setCanPisos(Integer canPisos) {
        this.canPisos = canPisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitacion) {
        this.precioHabitaciones = precioHabitacion;
    }
    
    public void precioHabitacion()  {

        precioHabitaciones = 50 + (1* nDcamas );
        
    }
    
}
