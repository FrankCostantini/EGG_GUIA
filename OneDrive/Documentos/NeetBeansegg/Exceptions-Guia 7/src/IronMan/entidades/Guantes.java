/*

 */
package IronMan.entidades;

public class Guantes {
    private boolean daño;
  private int energia;

    public Guantes(int energia,boolean daño) {
        this.energia = 1000;
        this.daño = false;
    }

    public Guantes() {
    }

    @Override
    public String toString() {
        return "Guante{" + "energia=" + energia + '}';
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
