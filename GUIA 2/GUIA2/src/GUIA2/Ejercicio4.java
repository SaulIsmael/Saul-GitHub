package GUIA2;
import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5) .*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temp. en ° centrigrados:");
        double cent = leer.nextDouble();
        double fahren = 32 + (9 * cent / 5);
        System.out.println(cent + "° equivalen a " + fahren + "° Fahrenheit");
    }
    
}
