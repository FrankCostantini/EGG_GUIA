/*

 */
package ejercicio2.entidades;

import java.util.Scanner;

public abstract class Electrodoméstico {

    private Scanner leer;

    protected int precio;
    protected String color;
    protected String consumoEnergico;
    protected int peso;

    public Electrodoméstico(int precio, String color, String consumoEnergico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergico = consumoEnergico;
        this.peso = peso;
    }

    public Electrodoméstico() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergico() {
        return consumoEnergico;
    }

    public void setConsumoEnergico(String consumoEnergico) {
        this.consumoEnergico = consumoEnergico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarEnergetico() {

        if (!consumoEnergico.contains("A") || !consumoEnergico.contains("F")) {
            consumoEnergico = "F";

        }

    }

    public void comprobarColor() {

        if (color.contains("blanco") || color.contains("negro") || color.contains("rojo") || color.contains("azul") || color.contains("gris")) {

            this.color = color;

        } else {
            this.color = "blanco";

        }

    }

    public void crearElectrodomestico() {
        System.out.println("Ingrese el precio");
        precio = leer.nextInt();
        System.out.println("Ingrese  el color  ");
        color = leer.next();
        System.out.println("Ingrese el consumo energico ");
        consumoEnergico = leer.next();
        System.out.println("EL peso ");
        peso = leer.nextInt();

        comprobarColor();
        comprobarEnergetico();
        //precio = 1000;

    }

    public void precioFinal() {
        switch (consumoEnergico) {

            case "A":
                precio = precio + 1000;
                break;

            case "B":
                precio = precio + 800;
                break;

            case "C":
                precio = precio + 600;
                break;

            case "D":
                precio = precio + 500;
                break;
            case "E":
                precio = precio + 300;
                break;
            case "F":
                precio = precio + 100;
                break;

        }

        if (peso > 1 && peso < 19) {
            precio = precio + 100;

        }
        if (peso > 20 && peso < 49) {
            precio = precio + 500;
        }
        if (peso > 50 && peso < 79) {
            precio = precio + 800;

        }
        if (peso > 80) {
            precio = precio + 1000;
        }

    }

    public abstract void crear();

    public void mostrar() {

        System.out.println("PRECIO =" + precio);
        System.out.println("COLOR = " + color);
        System.out.println("CONSUMO = " + consumoEnergico);
        System.out.println("PESO = " + peso);

    }

}
