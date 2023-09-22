package Entidades;

import Exception.MioException;
import java.util.Scanner;

public class A {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public void metodoA() throws MioException {
        String letra = "";
        System.out.println("Bienvenido");
        System.out.println("Ingrese una letra");
        letra = leer.next();
        if (!letra.equalsIgnoreCase("a")) {
            throw new MioException();
        }
        System.out.println("A encontrado la letra 'a'");
        System.out.println("Fin del juego");
    }
}
