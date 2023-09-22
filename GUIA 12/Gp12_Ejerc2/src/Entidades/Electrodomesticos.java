package Entidades;

import java.util.Scanner;

/**
 * 2. Crear una superclase llamada Electrodoméstico con los siguientes
 * atributos: precio, color, consumo energético (letras entre A y F) y peso. Los
 * constructores que se deben implementar son los siguientes: • Un constructor
 * vacío. • Un constructor con todos los atributos pasados por parámetro. Los
 * métodos a implementar son: • Métodos getters y setters de todos los
 * atributos.
 *
 * • Método precioFinal(): según el consumo energético y su tamaño, aumentará el
 * valor del precio. Esta es la lista de precios:
 *
 */
public class Electrodomesticos {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public Electrodomesticos() {

    }

    public Electrodomesticos(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
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

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

// Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
// sino es correcta usara la letra F por defecto. Este método se debe invocar al crear 
// el objeto y no será visible.
    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
//            System.out.println("El consumo energético seleccionado es: "+letra);
        } else {
            this.consumoEnergetico = 'F';
            System.out.println("El consumo energético asignado es: F");

        }

    }

// Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos 
//son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. 
//Este método se invocará al crear el objeto y no será visible.
    private void comprobarColor(String color) {

        String colorElegido = color.toLowerCase();

        if ((colorElegido.equalsIgnoreCase("blanco")
                || (colorElegido.equalsIgnoreCase("negro")
                || (colorElegido.equalsIgnoreCase("rojo")
                || (colorElegido.equalsIgnoreCase("azul")
                || (colorElegido.equalsIgnoreCase("gris"))))))) {
            this.color = colorElegido;
//            System.out.println("Color seleccionado es: "+colorElegido);

        } else {
            this.color = "blanco";
            System.out.println("Color asignado es: blanco");

        }
    }
// Metodo crearElectrodomestico(): le pide la información al usuario y llena
// * el electrodoméstico, también llama los métodos para comprobar el color y el
// * consumo. Al precio se le da un valor base de $1000.

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el precio del Electrodoméstico: ");
        this.precio = leer.nextDouble() + 1000;
        System.out.println("El precio inicial es de: $ " + precio);

        System.out.println("Ingrese el color del Electrodoméstico: ");
        String color = leer.next();
        comprobarColor(color);

        System.out.println("Ingrese el consumo energético del Electrodoméstico: ");
        char consumoEnergetico = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);

        System.out.println("Ingrese el peso del Electrodoméstico: ");
        this.peso = leer.nextDouble();

    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

LETRA PRECIO
A     $1000
B     $800
C     $600
D     $500
E     $300
F     $100

PESO             PRECIO
Entre 1 y 19 kg  $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg  $1000      */
    public void precioFinal() {

//        double precioFinal = this.precio;

        switch (this.consumoEnergetico) {
            case 'A':
                this.precio = precio + 1000;
                break;
            case 'B':
                this.precio = precio + 800;
                break;
            case 'C':
                this.precio = precio + 600;
                break;
            case 'D':
                this.precio = precio + 500;
                break;
            case 'E':
                this.precio = precio + 300;
                break;
            case 'F':
                this.precio = precio + 100;
                break;
        }

        if (this.peso >= 1 && this.peso < 19) {
            this.precio += 100;
        } else if (this.peso >= 20 && this.peso < 49) {
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso < 79) {
            this.precio += 800;
        } else if (this.peso >= 80) {
            this.precio += 1000;

        }
        

    }

}
