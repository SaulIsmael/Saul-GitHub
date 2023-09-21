package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio2 {
       
    
    public static void main(String[] args) {
        
  String frase;
        Scanner leer = new Scanner(System.in);
            System.out.println("Por favor, ingrese la frase deseada: ");
            frase = leer.next();
            if (frase.equalsIgnoreCase("eureka") ) {
                System.out.println("La palabra ingresada es correcta");
            }else
                System.out.println("Lo sentimos,la palabra no es la esperada");
    } }


