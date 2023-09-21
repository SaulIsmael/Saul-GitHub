package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class Extras1 {
       
    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
        
        int num = leer.nextInt();
        
        int dias = num / 1440;
        int horas = ((num-(dias*1440))/60);
        int minutos = ((num-(dias*1440))-(horas*60));
        
        System.out.println("dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);   
    }

}
