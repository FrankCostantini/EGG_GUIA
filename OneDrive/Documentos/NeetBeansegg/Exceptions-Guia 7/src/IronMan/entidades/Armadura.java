/*

 */
package IronMan.entidades;

import IronMan.interfaces.interfaces;

public class Armadura implements interfaces {

    private String colorp;
    private String colors;
    private int vida;
    private int energia;
    private int recargar;
    private Botas botas;
    private Guantes guantes;
    private Consola consola;

    public Armadura(String colorp, String colors, int vida, int energia, int recargar, Botas botas, Guantes guantes, Consola consola) {
        this.colorp = colorp;
        this.colors = colors;
        this.vida = 1000;
        this.energia = 1000;
        this.recargar = 1000;
        this.botas = botas;
        this.guantes = guantes;
        this.consola = consola;
    }

    public Armadura() {
    }

    public String getColorp() {
        return colorp;
    }

    public void setColorp(String colorp) {
        this.colorp = colorp;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getRecargar() {
        return recargar;
    }

    public void setRecargar(int recargar) {
        this.recargar = recargar;
    }

    public Botas getBotas() {
        return botas;
    }

    public void setBotas(Botas botas) {
        this.botas = botas;
    }

    public Guantes getGuantes() {
        return guantes;
    }

    public void setGuantes(Guantes guantes) {
        this.guantes = guantes;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    @Override
    public void mostrarEstado() {
        System.out.println("energia de las botas" + botas.getEnergia());
        System.out.println("energia de los guantes " + guantes.getEnergia());
        System.out.println("energia de la consola" + consola.getEnergia());
    }

    public void EstadoBateria() {
        System.out.println("te queda de bateria = %" + (energia * 100) / 1000);

    }

    public void mostrarReactor() {
        System.out.println("Tu energia es de " + energia);

    }

    public void sufriendoDa??os() {
        int num = (int) (Math.random() * 100 + 1);
        if (num < 30) {
            botas.setDa??o(true);
            guantes.setDa??o(true);
            consola.setDa??o(true);
        }

    }

    public void reparandoDa??os() {

        int num = (int) (Math.random() * 100 + 1);
        if (num <= 40) {
            botas.setDa??o(false);
            guantes.setDa??o(false);
            consola.setDa??o(false);
        }

    }

    public void revisandoDispositivos() {
        int num = (int) (Math.random() * 100 + 1);
        int num1 = (int) (Math.random() * 100 + 1);
        int num2 = (int) (Math.random() * 100 + 1);
        boolean roto = false;
        boolean roto2 = false;
        boolean roto3 = false;

        do {

            if (botas.getDa??o() == true) {
                reparandoDa??os();
                if (num < 30) {
                    botas.setDa??o(true);
                    roto = true;
                }

            }
        } while (roto == true || botas.getDa??o() == false);

        do {

            if (guantes.getDa??o() == true) {
                reparandoDa??os();
                if (num1 < 30) {
                    guantes.setDa??o(true);
                    roto2 = true;
                }

            }
        } while (roto2 == true || guantes.getDa??o() == false);

        do {

            if (consola.getDa??o() == true) {
                reparandoDa??os();
                if (num2 < 30) {
                    consola.setDa??o(true);
                    roto3 = true;
                }
            }
        } while (roto3 == true || consola.getDa??o() == false);

    }
    
    public void radar()   {
        
        
    }
    
}
