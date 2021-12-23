/*
Luego, de las
películas nos interesa saber el título, duración, edad mínima y director
 */
package ejercicio2extra.relaciones.entidades;

import java.util.Scanner;

public class Pelicula {
    
    private Scanner leer ;
    
    private  String titulo ; 
    private int duracion;
    private int minima ;
    private String director ;

    public Pelicula(String titulo, int duracion, int minima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.minima = minima;
        this.director = director;
    }

    public Pelicula() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getMinima() {
        return minima;
    }

    public void setMinima(int minima) {
        this.minima = minima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", minima=" + minima + ", director=" + director + '}';
    }
    
    
    
    public void llenarPelicula()    {
        System.out.println("Ingrese el titulo");
        titulo =leer.next();
         System.out.println("Duracion ");
         duracion = leer.nextInt();
         System.out.println("Minima");
         minima=leer.nextInt();
         System.out.println("Director");
         director= leer.next();
        

    }
    
}
