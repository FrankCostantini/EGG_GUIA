/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extra.entidades;

/**
 *
 * @author FRANCO
 */
public class Ciudad {
  
    
    private int postal ;
    private String ciudad ; 

    public Ciudad(int postal, String ciudad) {
        this.postal = postal;
        this.ciudad = ciudad;
    }

    public Ciudad() {
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "postal=" + postal + ", ciudad=" + ciudad + '}';
    }
    
    
    
    
}
