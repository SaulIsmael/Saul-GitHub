package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio1opcional {
       
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero par o impar");
        int num;
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par");

        } else {
            System.out.println("El numero es impar");
        }

    }
}
    


