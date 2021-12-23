/*su matrícula, su eslora en metros y año de
fabricación.
 */
package ejercicio1extra.entidades;

import java.util.Date;
import java.util.Scanner;

public  abstract class Barco  {
    protected String matricula;
    protected int eslora ;
    protected Date anoFabricacion;
    private Scanner leer;

    public Barco(String matricula, int eslora, Date añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = añoFabricacion;
    }

    public Barco() {
        leer =  new Scanner(System.in).useDelimiter("\n");
        anoFabricacion= new Date();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public Date getAñoFabricacion() {
        return anoFabricacion;
    }

    public void setAñoFabricacion(Date añoFabricacion) {
        this.anoFabricacion = añoFabricacion;
    }
 
    
   public void crearBarco() {
       
       System.out.println("Ingrese la matricula");
       matricula = leer.next();
       System.out.println("Ingrese la eslora");
       eslora = leer.nextInt();
       System.out.println("Año de fabricacion");
       int dia =leer.nextInt();
       System.out.println("mes de fabricacion");
         int mes =leer.nextInt();
       System.out.println("dia de fabricacion");
         int año =leer.nextInt();
         
         anoFabricacion= new Date (año,mes,dia);

   }
   
   public abstract void creoBarco();
   
   public int preciofinal(){
       return eslora * 10;
   }
   

    
    
}
