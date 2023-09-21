package GUIA2;
import java.util.Scanner;
/**
 *
 * @author Saul Ismael Mansilla
 */
public class Ejercicio1{

//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
//El programa deberá después mostrar el resultado de la suma




    
    public static void main(String[] args) {
        int num1, num2, resul;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        resul= num1 + num2;
        System.out.println("El resultado es: " + resul );
        
    }
    
}
