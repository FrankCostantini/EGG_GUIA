/*
Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
 */
package ejercicio1extra.entidades;

import java.util.Date;
import java.util.Scanner;

public class Alquiler {

    private String nombre;
    private long documento;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posision;
    private Barco barco;
    private Scanner leer;

    public Alquiler(String nombre, long documeto, Date fechaAlquiler, Date fechaDevolucion, int posision, Barco barco) {
        this.nombre = nombre;
        this.documento = documeto;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posision = posision;
        this.barco = barco;
    }

    public Alquiler() {
        leer = new Scanner(System.in).useDelimiter("\n");
       

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documeto) {
        this.documento = documeto;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosision() {
        return posision;
    }

    public void setPosision(int posision) {
        this.posision = posision;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void CrearAlquiler() {

        System.out.println("Ingrese el nombre ");
        nombre = leer.next();
        System.out.println("Documento");
        documento = leer.nextLong();

        System.out.println("*Ahora crearemos la fecha de Alquiler");
        System.out.println("DIA");
        int dia = leer.nextInt();
        System.out.println("MES");
        int mes = leer.nextInt();
        System.out.println("AÑO");
        int año = leer.nextInt();
        fechaAlquiler = new Date(año, mes, dia);
        System.out.println("*Ahora crearemos la fecha de devolucion");
        System.out.println("DIA");
        int diad = leer.nextInt();
        System.out.println("MES");
        int mesd = leer.nextInt();
        System.out.println("AÑO");
        int añod = leer.nextInt();
        fechaDevolucion = new Date(añod, mesd, diad);
        System.out.println("Posicion");
        posision = leer.nextInt();

    }

    public int montoAlquilerBase() {
       return (fechaAlquiler.getDate() - fechaDevolucion.getDate()) * barco.preciofinal();
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posision=" + posision + ", barco=" + barco + '}';
    }
    
    
   

    

}
