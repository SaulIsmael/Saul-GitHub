package com.mycompany.guia13ej04.entidades;
import java.util.Scanner;
public class DivisionNumero {
    private String num1;
    private String num2;
    public DivisionNumero() {
    }
    public DivisionNumero(String numero1, String numero2) {
        
        this.num1 = numero1;
        this.num2 = numero2;
    }
    public void convertirAEntero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
            //Se parsea a tipo int System.out.println("Realizando el parseo");
            System.out.println("Realizando parseo");
            int numero1 = Integer.parseInt(this.num1);
            int numero2 = Integer.parseInt(this.num2);
            System.out.println("Conversion CORRECTA!.");
            
            //Se realiza la division
            System.out.println("Realizando la division");
            double resultado = dividirNumeros(numero1, numero2);
            System.out.println("Llamado al metodo dividirNumeros() CORRECTO!.");
            System.out.println("El resultado de la division es: " + resultado);
        
    }
    private int dividirNumeros(int numero1, int numero2) throws ArithmeticException{
        if (numero2 == 0) {
            throw new ArithmeticException("Division por cero.");
        }
        return numero1 / numero2;
    }
}
