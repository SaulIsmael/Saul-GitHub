/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entindades;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class ParDeNumeros {

    private double num1, num2;

    public ParDeNumeros() {
        num1 = Math.random() * 100;
        num2 = Math.random() * 100;

    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

}
