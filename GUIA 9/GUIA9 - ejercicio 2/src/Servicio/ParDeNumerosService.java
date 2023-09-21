/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entindades.ParDeNumeros;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros Numero) {
        System.out.println("num1: " + Numero.getNum1());
        System.out.println("num2: " + Numero.getNum2());

    }

    public double devolverMayor(ParDeNumeros Numero) {
        if (Numero.getNum1() < Numero.getNum2()) {

            return Numero.getNum2();

        } else {
            return Numero.getNum1();

        }
    }

    public void calcularPotencia(ParDeNumeros Numero) {
        int num1 = (int) Math.round(Numero.getNum1());
        int num2 = (int) Math.round(Numero.getNum2());

        if (Numero.getNum1() < Numero.getNum2()) {
            System.out.println("num2 elevado a num1 es:" + Math.pow(num2, num1));

        } else {
            System.out.println("num1 elevado a num2 es:" + Math.pow(num1, num2));

        }
    }

    public void raiz(ParDeNumeros Numero) {
        if (Numero.getNum1() < Numero.getNum2()) {
            System.out.println("la raiz cuadrada de num1 es:" + Math.pow(Math.abs(Numero.getNum1()), 0.5));

        } else {
            System.out.println("la raiz cuadrada de num2 es:" + Math.pow(Math.abs(Numero.getNum2()), 0.5));

        }

    }

}
