package com.mycompany.guia13ej03;
import com.mycompany.guia13ej03.entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
        //Ingresando valores, el programa espera enteros
        System.out.println("Ingrese los valores");
        DivisionNumero dv = new DivisionNumero(leer.nextInt(), leer.nextInt());
        //Si no son numeros el programa lanza una excepcion
            dv.dividirNumeros();
        } catch (InputMismatchException e) {
            System.out.println("Error: No ingreso un numero valido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage() + " No puede realizarse.");
        }

    }
}
