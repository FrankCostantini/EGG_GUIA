/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra.principal;

import ejercicio3extra.servicios.ServicioLibro;

/**
 *
 * @author FRANCO
 */
public class ejercicio3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ServicioLibro sv = new ServicioLibro();
      
      sv.menu();
      
      sv.tostring();
    }
    
}
