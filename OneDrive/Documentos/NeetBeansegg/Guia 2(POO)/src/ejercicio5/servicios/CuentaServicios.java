/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5.servicios;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        System.out.println("Ingrese su numero de cuenta ");
        int numcuenta = leer.nextInt();
        System.out.println("Ingrese su DNI ");
        int dni = leer.nextInt();
        System.out.println("Ingrese su ingreso actual");
        int ingreso = leer.nextInt();

        return new Cuenta(numcuenta, dni, ingreso);

    }

    public void ingresar(Cuenta cuenta) {
        System.out.println("¿ Cuanto monto desea ingresar ?");
        int monto = leer.nextInt();
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }

    public double retirar(Cuenta saldo) {

        System.out.println("¿ Cuanto monto desea ingresar ?");
        double monto = leer.nextDouble();
        if (monto > saldo.getSaldo()) {
            System.out.println("No Tienes Esa Cantidad En Tu Saldo");
        }
        return saldo.getSaldo() - monto;
    }

    public double extraccionRapida(Cuenta saldo) {
        System.out.println("Le recuedo aqui solo podras retirar hsata un 20%");
        double retirorapido = leer.nextDouble();
        double veinteporciento = retirorapido * 20 / 100;
        if (retirorapido > veinteporciento) {
            System.out.println("Ahora su saldo es de " + (saldo.getSaldo() - retirorapido));
            return saldo.getSaldo() - retirorapido;

        } else {
            System.out.println(" Recuerde es solo un 20 % , en este caso seria de" + veinteporciento);
        }
        System.out.println("Su saldo sigue siendo de " + saldo.getSaldo());
        return saldo.getSaldo();
    }

    public void consultarSaldo(Cuenta saldaso) {
        System.out.println("Quieres consultar tu saldo (S/N) ");
        String indicador = leer.next().toLowerCase();
        if (indicador.equals("s")) {
            System.out.println("Su saldo es de" + saldaso.getSaldo());
        }
    }
    public void consultarDatos(Cuenta numero ,Cuenta dni ) {
        System.out.println("Quieres consultar tus datos (S/N) ");
        String indicador = leer.next().toLowerCase();
        if (indicador.equals("s")) {
            System.out.println("Tu numero de cuenta es  :" + numero.getNuemeroCuenta());
            System.out.println("Tu DNI es : "+dni.getDni());
        }
    }
}
