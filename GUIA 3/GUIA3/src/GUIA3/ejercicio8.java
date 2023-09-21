package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio8 {
       
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <= num; j++) {
                if (i>1 && i<num && j>1 && j<num) {
                    System.out.print("  ");
                } else {
                    System.out.print("* "); 
                }
            }
                System.out.println("");
        }    
    }

}
