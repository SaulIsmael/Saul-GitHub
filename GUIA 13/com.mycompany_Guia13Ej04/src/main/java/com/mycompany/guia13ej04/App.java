package com.mycompany.guia13ej04;

import com.mycompany.guia13ej04.entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // los valores ingresados entran como String
        try {
            System.out.println("Ingrese los valores");
            DivisionNumero dv = new DivisionNumero(leer.next(), leer.next());
            //Llamo al metodo convertir numero

            dv.convertirAEntero();
        } catch (NumberFormatException e) {
            System.out.println("Error: No se puede convertir la cadena a un numero entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage() + " No puede realizarse.");
        }

    }
}
