package com.mycompany.guia13ej6practico;

import Entidades.A;
import Exception.MioException;

public class Guia13Ej6Practico {

    public static void main(String[] args) {
        boolean salida = true;
        A a = new A();
        do {
            try {
                a.metodoA();
                salida = false;
            } catch (MioException e) {
                System.out.println(e.getMessage());
            }
        } while (salida);
        System.out.println("Fin del programa");
    }
}
