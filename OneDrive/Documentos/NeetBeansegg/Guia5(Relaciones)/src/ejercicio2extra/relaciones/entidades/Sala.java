
package ejercicio2extra.relaciones.entidades;

import java.util.ArrayList;

public class Sala {
    private ArrayList<ArrayList<Espectador>> matriz ;
    
    
     public Sala() {
        matriz = new ArrayList(); 
    }

    public ArrayList<ArrayList<Espectador>> getMatriz() {
        return matriz;
    }

    public void setMatriz(ArrayList<ArrayList<Espectador>> matriz) {
        this.matriz = matriz;
    }
    @Override
    public String toString() {
        return "Sala{" + "matriz=" + matriz + '}';
    }


    
    
    
//    private  Espectador [][] matriz ;
// 
//
//    public Sala() {
//        matriz =  new Espectador[8][6];
//    }
//    
//      public Sala(Espectador[][] matriz) {
//        this.matriz = matriz;
//    }
//    
//
//    public Espectador[][] getMatriz() {
//        return matriz;
//    }
//    public void setMatriz(Espectador[][] matriz) {
//        this.matriz = matriz;
//    }
//    
//    
//    @Override
//    public String toString() {
//        return "Sala{" + "matriz=" + matriz + '}';
//    }
    

    
    
    
//      public void llenarSala()    {
//      
//          for (int i = 0; i <8 ; i++) {
//              for (int j = 0; j < 6; j++) {
//                 if ( j==0) {
//                     matriz[i][j]= i +"A"; 
//              }
//                 if (j==1)  {
//                       matriz[i][j]= i +"B"; 
//                 }
//                 
//                  if (j==2)  {
//                       matriz[i][j]= i +"C"; 
//                 }
//                    if (j==3)  {
//                       matriz[i][j]= i +"D"; 
//                 }
//                    
//                if(j==4)    {
//                    
//                    matriz[i][j]= i+"E";
//                } 
//                
//                if (j==5)   {
//                    matriz[i][j]= i+"F" ;
//                }
//                 
//                if (j==6)   {
//                    matriz[i][j]= i+"G" ;
//                }
//                
//                
//                    
//   
//          }
//              
//     
//    }
//          
//         
//       
//        
//        
//    }


   


   

   

  


    
  
    
    
   
    
    
    
    
    
    
    
   
    
    
   
    
    
       
}
