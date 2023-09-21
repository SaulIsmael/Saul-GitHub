package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio10Teorico {
       
    
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        int contador=0;
        
       while (contador<4){
        
        System.out.println("Esciba un número entero entre 1 y 20");
        int num=leer.nextInt();
        
        if ((num<0) || (num>20)){
            System.out.println("Número fuera de rango ");
            
        }else {
           
            System.out.print(num);
       
      
            for (int i=0; i<num; i++){
            
            
            System.out.print("*");
        } 
            contador=contador+1;
        }
       System.out.println(" ");    
    } 
    }        
   
}
