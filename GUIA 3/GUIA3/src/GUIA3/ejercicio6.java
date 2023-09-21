package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio6 {
       
    
    public static void main(String[] args) {
              int num1, num2, opcion;
        String salir;
        Boolean flag = true;
     Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer operando"); 
        num1=leer.nextInt();
        System.out.println("ingrese el segundo operando"); 
        num2=leer.nextInt();
     
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        do{
            System.out.println("Elija Opcion");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La suma es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("El producto es: "+(num1*num2));
                    break;
                case 4:
                    if (num2!=0)
                    System.out.println("La division es: "+(num1/num2)); 
                    else
                    System.out.println("La division por cero no esta permitida");
                    break;
                case 5:
                    System.out.println("Si quiere salir del sistema ingrese s/S"); 
                    salir=leer.next();
                     if (salir.equalsIgnoreCase("s"))
                         flag=false; 
                     break;     
                default:
                    System.out.println("La opcion ingresada no es valida");             
            }
        }while(flag);
    }

    }

