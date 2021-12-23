/*
. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
 */
package ejercicio3extra.entidades;

import java.util.Objects;

public class Libro {
    
    private String titulo ;
    private String autor ; 
 
    private int ejemplaresPrestados ;

    public Libro(String titulo, String autor, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
       
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

   

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.titulo);
        hash = 61 * hash + Objects.hashCode(this.autor);
        hash = 61 * hash + this.ejemplaresPrestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
       
        if (this.ejemplaresPrestados != other.ejemplaresPrestados) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }


    
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor +  ", ejemplaresPrestados=" + ejemplaresPrestados + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
