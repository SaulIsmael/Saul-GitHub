/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 * precio, color, consumo energético (letras entre A y F) y peso. Los
 * constructores que se deben implementar son los siguientes: • Un constructor
 * vacío. • Un constructor con todos los atributos pasados por parámetro. Los
 * métodos a implementar son: • Métodos getters y setters de todos los
 * atributos. • Método comprobarConsumoEnergetico(char letra): comprueba que la
 * letra es correcta, sino es correcta usara la letra F por defecto. Este método
 * se debe invocar al crear el objeto y no será visible. • Método
 * comprobarColor(String color): comprueba que el color es correcto, y si no lo
 * es, usa el color blanco por defecto. Los colores disponibles para los
 * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
 * nombre está en mayúsculas o en minúsculas. Este método se invocará al crear
 * el objeto y no será visible.
 *
 * • Metodo crearElectrodomestico(): le pide la información al usuario y llena
 * el electrodoméstico, también llama los métodos para comprobar el color y el
 * consumo. Al precio se le da un valor base de $1000. • Método precioFinal():
 * según el consumo energético y su tamaño, aumentará el valor del precio. Esta
 * es la lista de precios:
 *
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo
 * carga, además de los atributos heredados. Los constructores que se
 * implementarán serán: • Un constructor vacío. • Un constructor con la carga y
 * el resto de los atributos heredados. Recuerda que debes llamar al constructor
 * de la clase padre. Los métodos que se implementara serán: • Método get y set
 * del atributo carga. • Método crearLavadora (): este método llama a
 * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
 * atributos heredados del padre y después llenamos el atributo propio de la
 * lavadora. • Método precioFinal(): este método será heredado y se le sumará la
 * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el
 * precio en $500, si la carga es menor o igual, no se incrementará el precio.
 * Este método debe llamar al método padre y añadir el código necesario.
 * Recuerda que las condiciones que hemos visto en la clase Electrodoméstico
 * también deben afectar al precio.
 *
 *
 *
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
public class Electrodomestico {

    /**
     * Crear una superclase llamada Electrodoméstico con los siguientes
     * atributos: precio, color, consumo energético (letras entre A y F) y peso.
     * Los constructores que se deben implementar son los siguientes: • Un
     * constructor vacío. • Un constructor con todos los atributos pasados por
     * parámetro. Los métodos a implementar son: • Métodos getters y setters de
     * todos los atributos. • Método comprobarConsumoEnergetico(char letra):
     * comprueba que la letra es correcta, sino es correcta usara la letra F por
     * defecto. Este método se debe invocar al crear el objeto y no será
     * visible. • Método comprobarColor(String color): comprueba que el color es
     * correcto, y si no lo es, usa el color blanco por defecto. Los colores
     * disponibles para los electrodomésticos son blanco, negro, rojo, azul y
     * gris. No importa si el nombre está en mayúsculas o en minúsculas. Este
     * método se invocará al crear el objeto y no será visible.
     */
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Double precio;
    protected String color;
    protected char consumo;
    protected int peso;

    protected char letras[] = {'A', 'B', 'C', 'D', 'E', 'F'};
    protected String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        comprobarConsumoEnergetico(consumo);
        comprobarColores(color);
        precioFinal(precio, consumo, peso);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {

        letra = Character.toUpperCase(letra);
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                this.consumo = letra;
                break;
            } else {
                this.consumo = 'F';
            }
        }

    }

    public void comprobarColores(String colorX) {

        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(colorX)) {
                this.color = colorX;
                break;
            } else {
                this.color = colores[0];
            }

        }

    }

    public void crearElectrodomestico() {
        this.precio = 1000d;
        // Double precio, String color, char consumo, Double peso
        System.out.println("Ingrese color");
        this.color = leer.next();
        System.out.println("Ingrese el consumo");
        this.consumo = leer.next().charAt(0);
        System.out.println("Ingrese el peso ");
        this.peso = leer.nextInt();
        precioFinal(precio, consumo, peso);
        Electrodomestico e1 = new Electrodomestico(precio, color, consumo, peso);

    }

    public void precioFinal(Double precio, char consumo, int peso) {

        switch (consumo) {
            case 'A':
                this.precio = precio + 1000d;
                break;
            case 'B':
                this.precio = precio + 800d;
                break;
            case 'C':
                this.precio = precio + 600d;
                break;
            case 'D':
                this.precio = precio + 500d;
                break;
            case 'E':
                this.precio = precio + 300d;
                break;
            case 'F':
                this.precio = precio + 100d;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            this.precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            this.precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
    }
    
    
}
