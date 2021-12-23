/*
Por último, del
espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible
 */
package ejercicio2extra.relaciones.entidades;

import java.util.Scanner;

public class Espectador {

    private Scanner leer;

    private String nombre;
    private int edad;
    private int dineroDisponible;

    public Espectador(String nombre, int edad, int dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public Espectador() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    Espectador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Espectador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Espectador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(int dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + '}';
    }

    public void llenarEspectador() {

        System.out.println("Ingrese su nombre ");
        nombre = leer.next();
        System.out.println("Su edad");
        edad = leer.nextInt();

        System.out.println("Su presupuesto ");
        dineroDisponible = leer.nextInt();
    }

}
