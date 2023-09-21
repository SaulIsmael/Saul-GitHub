package GUIA4;

import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.*/
/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio1 {
       
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        double num1 = leer.nextDouble();
        System.out.println("ingrese otro numero");
        double num2 = leer.nextDouble();
        System.out.println("Opcion 1 sumar");
        System.out.println("Opcion 2 restar");
        System.out.println("Opcion 3 multiplicar");
        System.out.println("Opcion 4 dividir");
        System.out.println("igrese una opcion");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                double retorno1 = sumar (num1, num2);
                System.out.println("la suma es "+ retorno1);
                break;
            case 2:
                 double retorno2 = restar (num1, num2);
                System.out.println("la resta es "+ retorno2);
                break;
            case 3:
                 double retorno3 = multiplicar (num1, num2);
                System.out.println("la multiplicacion es "+ retorno3);
                break;
            case 4:
                double retorno4 = dividir (num1, num2);
                System.out.println("la division es "+ retorno4);
                break;    
            
        }
    }
public static double sumar(double num1, double num2){
double suma = num1 + num2;
        return suma;
 }
public static double restar(double num1, double num2){
double restar = num1 - num2;
       return restar;
}
public static double multiplicar(double num1, double num2){
double multiplicar = num1 * num2;
       return multiplicar;
}
public static double dividir(double num1, double num2){
double dividir = num1 / num2;
       return dividir;
}
}