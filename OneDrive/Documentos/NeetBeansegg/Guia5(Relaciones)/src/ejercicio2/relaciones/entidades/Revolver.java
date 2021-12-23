/*

 */
package ejercicio2.relaciones.entidades;

public class Revolver {
    
//    Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
//(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
//posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
//aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
    
    private int posisionactual ;
    private int posisionagua;

    public Revolver(int posisionactual, int posisionagua) {
        this.posisionactual = posisionactual;
        this.posisionagua = posisionagua;
    }

    public Revolver() {
    }

    public int getPosisionactual() {
        return posisionactual;
    }

    public void setPosisionactual(int posisionactual) {
        this.posisionactual = posisionactual;
    }

    public int getPosisionagua() {
        return posisionagua;
    }

    public void setPosisionagua(int posisionagua) {
        this.posisionagua = posisionagua;
    }
    
    
    public void llenarResolver() {
        
        posisionactual= (int)(Math.random()*6);
        posisionagua  = (int) (Math.random()*6);
    }
    
    public boolean mojar() {
        boolean ind = false ;
        
       if (posisionactual == posisionagua )    {
            ind =  true ;
            
        }
        return ind  ;
    }
    
    
    public void siguienteChorro()   {
        
        posisionactual = posisionactual +  1 ;
        if (posisionactual >=6) {
            posisionactual=0;
        }

    }

    
    @Override
    public String toString() {
        return "Resolver{" + "posisionactual=" + posisionactual + ", posisionagua=" + posisionagua + '}';
    }
    
    
    
    
    
    
}
