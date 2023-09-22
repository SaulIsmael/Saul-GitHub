package Entidades;

import java.util.Scanner;

/**
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo
 * carga, además de los atributos heredados.
 *
 * Los constructores que se implementarán serán: • Un constructor vacío. • Un
 * constructor con la carga y el resto de los atributos heredados. Recuerda que
 * debes llamar al constructor de la clase padre.
 *
 * Los métodos que se implementara serán: • Método get y set del atributo carga.
 */
public class Lavadora extends Electrodomesticos {

    private int carga;

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString()+"capacidad de carga "+ carga; 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   

//Método crearLavadora (): este método llama a crearElectrodomestico() de la
//clase padre, lo utilizamos para llenar los atributos heredados del padre y
//después llenamos el atributo propio de la lavadora.
    public void crearLavadora() {
        Scanner leer = new Scanner(System.in);
        System.out.println("--------------Lavadora--------------");
        crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga de la lavadora: ");
        this.carga = leer.nextInt();
        precioFinal();

    }
// Método precioFinal():
// * este método será heredado y se le sumará la siguiente funcionalidad. Si tiene
// * una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o
// * igual, no se incrementará el precio. Este método debe llamar al método padre
// * y añadir el código necesario. Recuerda que las condiciones que hemos visto en
// * la clase Electrodoméstico también deben afectar al precio.

    @Override
    public void precioFinal() {
        super.precioFinal();
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if (this.carga > 30) {
            this.precio += 500;

        }

    }

}
