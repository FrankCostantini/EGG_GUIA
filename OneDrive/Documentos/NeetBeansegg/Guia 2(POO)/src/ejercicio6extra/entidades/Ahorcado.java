/*

 */
package ejercicio6extra.entidades;

public class Ahorcado {
    
    private String vector [];
    private int  cantletrasAlladas ;
    private int cantjugadas;

    public Ahorcado(String[] vector, int cantletras, int cantjugadas) {
        this.vector = vector;
        this.cantletrasAlladas = cantletras;
        this.cantjugadas = cantjugadas;
    }

    public Ahorcado() {
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getCantletras() {
        return cantletrasAlladas;
    }

    public void setCantletras(int cantletras) {
        this.cantletrasAlladas = cantletras;
    }

    public int getCantjugadas() {
        return cantjugadas;
    }

    public void setCantjugadas(int cantjugadas) {
        this.cantjugadas = cantjugadas;
    }
    
    
    
    
}
