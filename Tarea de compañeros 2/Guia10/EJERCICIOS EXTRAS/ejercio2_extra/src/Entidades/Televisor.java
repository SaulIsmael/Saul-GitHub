
package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    int resolucion;
    boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, Double precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTv() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        crearElectrodomestico();

        System.out.print("Escriba las pulgadas: ");
        setResolucion(leer.nextInt());
        System.out.print("¿Tiene sintonizador TDT? (S/N): ");
        String aux = leer.next();

        if (aux.equalsIgnoreCase("N")) {
            setSintonizador(false);
        } else {
            setSintonizador(true);

        }

    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (getResolucion() > 40) {
            setPrecio(getPrecio() + (getPrecio() * 0.3));
            System.out.println("(por sus pulgadas aumenta %30)");

        }
        if (isSintonizador()) {
            setPrecio(getPrecio() + 500);
            System.out.println("(por tener TDT aumenta $500)");

        }

        System.out.println("PRECIO FINAL: $" + getPrecio());

    }

}//final clase