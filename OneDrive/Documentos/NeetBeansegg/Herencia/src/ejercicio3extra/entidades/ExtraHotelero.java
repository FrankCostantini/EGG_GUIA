/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
alojamientos extrahoteleros: 
los Camping y las Residencias. Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones. Para las residencias se
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

public class ExtraHotelero extends Alojamiento{
    protected boolean privado ;
    protected Integer cantmetrosCuadrados;

    public ExtraHotelero(boolean privado, Integer cantmetrosCuadrados, String direccion, String localidad, String gerente) {
        super(direccion, localidad, gerente);
        this.privado = privado;
        this.cantmetrosCuadrados = cantmetrosCuadrados;
    }

    public ExtraHotelero() {
    }
    

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getCantmetrosCuadrados() {
        return cantmetrosCuadrados;
    }

    public void setCantmetrosCuadrados(Integer cantmetrosCuadrados) {
        this.cantmetrosCuadrados = cantmetrosCuadrados;
    }
    
    
    
    
 
    
    
    
    
    
}
