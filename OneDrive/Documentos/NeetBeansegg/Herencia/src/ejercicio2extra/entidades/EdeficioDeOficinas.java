/*
 Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.
 */
package ejercicio2extra.entidades;

import java.util.Scanner;

public final class EdeficioDeOficinas extends Edificio {
    
    private Integer numOficinas;
    private Integer personasxOficina;
    private Integer numPisos;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdeficioDeOficinas(Integer numOficinas, Integer personasxOficina, Integer numPisos, Integer ancho, Integer largo, Integer alto) {
        super(ancho, largo, alto);
        this.numOficinas = numOficinas;
        this.personasxOficina = personasxOficina;
        this.numPisos = numPisos;
    }

    public EdeficioDeOficinas() {
    }
    
    

    
    @Override
    public void calcularSuperficie() {
        System.out.println( "Superficie " + ancho * largo  );
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen " +alto* ancho * largo );
    }
    
    
    public void cantidadPersonas(){
        System.out.println("Pueden entrar en un edificio =" +personasxOficina*numOficinas);
        System.out.println("En cada piso hay cuatro oficinas , de un total de "+numOficinas +" .EN el piso pueden entrar "+numOficinas*4 );
        
        
        
    }
    
    @Override
    public void crear() {
        super.crear();
        System.out.println("Numero de oficinas");
       numOficinas = leer.nextInt();
        System.out.println("Cantidad de personas por oficinas ?");
        personasxOficina = leer.nextInt();
        System.out.println("Numero de pisos");
        numPisos = leer.nextInt();
        
    }

    
   
    
}
