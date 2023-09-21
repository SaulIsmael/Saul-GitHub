package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio4 {
       
    
    public static void main(String[] args) {
    String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase");
        frase = leer.next();
         if ("A".equalsIgnoreCase(frase.substring(0,1))){
             System.out.println("Correcto");
        }else   {
             System.out.println("Incorrecto");    
    }}

}
