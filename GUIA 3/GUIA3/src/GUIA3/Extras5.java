package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class Extras5 {
       
    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        String plan;
        int importe;
        double total=0;
        do {
            System.out.println("Ingrese el tipo de Plan");
            plan=leer.next();
        } while ((!plan.equalsIgnoreCase("A")) && (!plan.equalsIgnoreCase("B")) && (!plan.equalsIgnoreCase("C")));
        
        System.out.println("Ingrese el importe del tratamiento");
            importe=leer.nextInt();
         
        switch (plan.toUpperCase()) {
            case "A":
                total=((double)importe*.5);
                break;
            case "B":
                total=((double)importe*.65);
                break;
            case "C":
                total=importe;
                break;
                
        }
        System.out.println("El importe a pagar es: " + total);  
    }

}
