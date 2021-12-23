/*

 */
package ejercicio5.principal;

import ejercicio5.entidades.Cuenta;
import ejercicio5.servicios.CuentaServicios;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CuentaServicios cuentaServicio = new CuentaServicios();

        Cuenta cuenta = cuentaServicio.crearCuenta();
        
        System.out.println("Elija una opcion:");
        System.out.println("1= Ingresar  ");
        System.out.println("2= Retirar ");
        System.out.println("3= Extraccion rapida ");
        System.out.println("4 = Consultar Saldo");
        System.out.println("5 = Consultar Datos");
        int resp = leer.nextInt();

        switch (resp) {
            case 1:
                cuentaServicio.ingresar(cuenta);
                break;
            case 2:
                cuentaServicio.retirar(cuenta);
                break;
            case 3:
                cuentaServicio.extraccionRapida(cuenta);
                break;
            case 4:
                cuentaServicio.consultarSaldo(cuenta);
                break;
            case 5:
                cuentaServicio.consultarDatos(cuenta, cuenta);
                break;
        }

    }

}
