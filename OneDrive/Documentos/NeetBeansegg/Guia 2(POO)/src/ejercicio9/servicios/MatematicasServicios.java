/*
 
 */
package ejercicio9.servicios;

import ejercicio9.entidades.Matematicas;

public class MatematicasServicios {
    
    public Matematicas crearMatematica() {
        Matematicas mat = new Matematicas();
        
        mat.setNum1(Math.random());
        mat.setNum2(Math.random());
        
        return mat ;
  
    }
    
    public double devolverMayor(Matematicas n  )  {
      double max =  Math.max(n.getNum1(),n.getNum2());
      
      
        return max;
 
    }
    
    public double calcularPotencia( Matematicas n )    {
        double min= Math.min(n.getNum1(),n.getNum2());
        double potencia = Math.pow( devolverMayor(n) ,min );
        
        return potencia ;

}
    
    public  double calcularRaiz(Matematicas n)   {
        double raiz = Math.sqrt(Math.min(n.getNum1(),n.getNum2()));
        return raiz ;
        
    }
}
