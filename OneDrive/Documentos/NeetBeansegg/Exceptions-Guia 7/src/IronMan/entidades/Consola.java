/*

 */
package IronMan.entidades;

public class Consola {
    private boolean daño ;
    private int energia;

    public Consola(int energia,boolean daño ) {
        this.energia = 1000;
        this.daño = false ;
    }

    public Consola() {
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
