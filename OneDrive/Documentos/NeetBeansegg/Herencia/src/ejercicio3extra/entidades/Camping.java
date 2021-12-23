/*
los Camping y las Residencias. 
Para los Camping se
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

public final class Camping extends ExtraHotelero{
    
    private Integer capMaxCarpas;
    private Integer cantBaños;
    private boolean restaurante;

    public Camping(boolean privado, Integer cantmetrosCuadrados, String direccion, String localidad, String gerente,Integer capMaxCarpas,Integer cantBaños,boolean restaurante) {
        super(privado, cantmetrosCuadrados, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBaños = cantBaños;
        this.restaurante = restaurante;
   
    }

    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(Integer cantBaños) {
        this.cantBaños = cantBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    
    
    
    
    
    
}
