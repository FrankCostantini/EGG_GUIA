/*
 Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. Realizar un programa en el que se representen
todas las relaciones descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento
 */
package ejercicio3extra.entidades;

public class Residencias extends  ExtraHotelero{
    
    private Integer cantHabitacion;
    private boolean descuentos;
    private boolean campoDeportivo;

    public Residencias(boolean privado, Integer cantmetrosCuadrados, String direccion, String localidad, String gerente,Integer cantHabitacion,boolean descuentos,boolean campoDeportivo) {
        super(privado, cantmetrosCuadrados, direccion, localidad, gerente);
        this.cantHabitacion = cantHabitacion;
        this.descuentos = descuentos;
        this.campoDeportivo= campoDeportivo ;
    }

    public Integer getCantHabitacion() {
        return cantHabitacion;
    }

    public void setCantHabitacion(Integer cantHabitacion) {
        this.cantHabitacion = cantHabitacion;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
    
    
    
    
}
