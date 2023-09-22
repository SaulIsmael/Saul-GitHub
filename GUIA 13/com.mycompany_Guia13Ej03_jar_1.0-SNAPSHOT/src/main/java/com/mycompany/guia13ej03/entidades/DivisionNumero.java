package com.mycompany.guia13ej03.entidades;

public class DivisionNumero {

    private int num1;
    private int num2;

    public DivisionNumero() {
    }

    public DivisionNumero(int numero1, int numero2) {

        this.num1 = numero1;
        this.num2 = numero2;
    }

    public int dividirNumeros() throws ArithmeticException {
        System.out.println("Llamado al metodo dividirNumeros() CORRECTO!.");
        if (this.num2 == 0) {
            throw new ArithmeticException("Division por cero.");
        }
        return this.num1 / this.num2;
    }
}
