/*

 */
package IronMan.entidades;

public class Botas  {
    private boolean daño ;
    private int energia;

    public Botas(int energia,boolean daño ) {
        this.energia = 1000;
        this.daño = false;
    }

    public Botas() {
    }

    @Override
    public String toString() {
        return "Botas{" + "energia=" + energia + '}';
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean getDaño() {
        return daño;
    }

    public void setDaño(boolean daño) {
        this.daño = daño;
    }
    
    
    
    
    
    
}
