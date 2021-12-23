package ejercicio1extra.principal;

import ejercicio1extra.entidades.Alquiler;
import ejercicio1extra.entidades.Barco;
import ejercicio1extra.entidades.BarcoMotor;
import ejercicio1extra.entidades.Velero;
import ejercicio1extra.entidades.Yate;
import java.util.Scanner;

public class ejercicio1extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Alquiler alq1 = new Alquiler();
   
      Barco ve1 = new Velero();
        Barco bm1 = new BarcoMotor();
       Barco y1 = new Yate ();



        System.out.println("QUÉ BARCO DESEA ALQUILAR (  VELERO / BARCOMOTOR  / YATE )");
        String eleccion = leer.next().toLowerCase();

        switch (eleccion) {

            case "velero":
                alq1.CrearAlquiler();
                ve1.creoBarco();
                alq1.setBarco(ve1);
                alq1.montoAlquilerBase();
                System.out.println("Tus Datos:");
                System.out.println(alq1.toString());
                System.out.println("Tu precio seria = $" + ve1.preciofinal());
                break;
            case "baromotor":
                alq1.CrearAlquiler();
                bm1.creoBarco();
                alq1.setBarco(bm1);

                alq1.toString();
                System.out.println("Tu precio seria = $" + bm1.preciofinal());
                
                break;
            case "yate":
                alq1.CrearAlquiler();
                y1.creoBarco();
                alq1.setBarco(y1);
             
              
                  alq1.toString();
                System.out.println("Tu precio seria = $" + y1.preciofinal());
                
                
                break;

        }
        
        
        
        
        
        
        
        
        

    }

}
