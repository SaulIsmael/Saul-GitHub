package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class Extras2 {
       
    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 numeros enteros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        int num3= leer.nextInt();
        int num4= leer.nextInt();
        
        System.out.println("Variable A: " + num1);
        System.out.println("Variable B: " + num2);
        System.out.println("Variable C: " + num3);
        System.out.println("Variable D: " + num4);
        
        int numAux= num2;
        num2=num3;
        num3=num1;
        num1=num4;
        num4=numAux;
        System.out.println("Ahora");
        System.out.println("Variable A: " + num1);
        System.out.println("Variable B: " + num2);
        System.out.println("Variable C: " + num3);
        System.out.println("Variable D: " + num4);   
    }

}
