/*

 */
package ejercicio4.entidades;

import ejercicio4.interfaces.calculosFormas;

public class Circulo implements calculosFormas {
    
    private int radio;
    private int diametro;

    public Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public void calcularPerimetro() {
         System.out.println( PI * diametro);
    }

    @Override
    public void calcularArea() {
         System.out.println( PI * Math.sqrt(radio));
    }
    
    
    
    
    
}
