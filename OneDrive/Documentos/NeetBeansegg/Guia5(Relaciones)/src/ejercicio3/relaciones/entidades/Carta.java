
package ejercicio3.relaciones.entidades;

import java.util.ArrayList;

public class Carta {
    private int num ;
 private  String palos ;  
 
 

    public Carta(int num, String palos) {
        this.num = num;
        this.palos = palos;
    }

    public Carta() {
    }
    
    
//    public void crarCarta() {
//        for (int i = 0; i < 12; i++) {
//            if ( i== 8 || i == 9 )  {
//                
//             num = i;
//            }
//          
//        }
//       
//    }
    
    
    
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalos() {
        return palos;
    }

    public void setPalos(String palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palos=" + palos + '}';
    }
    
 
 
    
}
