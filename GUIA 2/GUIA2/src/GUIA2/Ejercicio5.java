package GUIA2;
import java.util.Scanner;
/**
 *
 * @author Saul Ismael Mansilla
 */
public class Ejercicio5 {
    public static void main(String[] args) {
         /*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt(). */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num = leer.nextInt();
        System.out.println("El doble es :"+ (num*2));
        System.out.println("El triple es :"+ (num*3));
        System.out.println("La raiz cuadrada es :"+ Math.sqrt(num));
    }
    
}
