

package GUIA2;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class Ejercicio3 {
       
    
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        frase = leer.next();
        System.out.println("La frase ingresada en mayúsculas queda asi:" + frase.toUpperCase());
        System.out.println("Y la misma frase en minúsculas que así: " + frase.toLowerCase());
        System.out.println(" Gracias totales y hasta luego");
    }

}
