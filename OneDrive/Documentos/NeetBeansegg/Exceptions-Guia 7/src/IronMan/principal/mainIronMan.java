/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IronMan.principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author FRANCO
 */
public class mainIronMan {

    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        Iterator<String> it = lista.iterator();

        lista.add("juancito");
        lista.add("pepe");
        lista.add("pedrito");

        for (int i = 0; i < lista.size(); i++) {
          if(lista.get(i).equals("pepe"))   {
              lista.remove(i);
          }
        }
        
        
        for (String aux: lista) {
            System.out.println(aux);
        }
        
    }
}
