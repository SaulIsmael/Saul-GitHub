/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 * Se debe crear también una subclase llamada Televisor con los siguientes
 * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
 * los atributos heredados. Los constructores que se implementarán serán: • Un
 * constructor vacío. • Un constructor con la resolución, sintonizador TDT y el
 * resto de los atributos heredados. Recuerda que debes llamar al constructor de
 * la clase padre.
 *
 * Los métodos que se implementara serán: • Método get y set de los atributos
 * resolución y sintonizador TDT. • Método crearTelevisor(): este método llama a
 * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
 * atributos heredados del padre y después llenamos los atributos del televisor.
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
 * aumentará $500. Recuerda que las condiciones que hemos visto en la clase
 * Electrodomestico también deben afectar al precio. Finalmente, en el main
 * debemos realizar lo siguiente: Vamos a crear una Lavadora y un Televisor y
 * llamar a los métodos necesarios para mostrar el precio final de los dos
 * electrodomésticos.
 */
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean TDT;

    public Televisor(int resolucion, boolean TDT, Double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
        precioFinal(precio, consumo, peso, resolucion, TDT);
    }
    public void precioFinal(Double precio, char consumo, int peso, int resolucion, boolean tdt) {
        precioFinal(precio, consumo, peso);

        if (tdt) {
            this.precio = precio + 500d;
        }

        if (resolucion > 40) {
            this.precio = precio * 1.3;

        }

    }

}
