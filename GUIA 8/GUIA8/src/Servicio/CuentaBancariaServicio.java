/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class CuentaBancariaServicio {
    private final Scanner sc = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese su numero de cuenta");
        int num = sc.nextInt();
        System.out.println("Ingrese su DNI");
        int dni = sc.nextInt();
        return new CuentaBancaria(num,dni);
    }
    public void ingresar(CuentaBancaria ingreso){
        double saldo = ingreso.getSaldoActual();
        System.out.println("Cuanta quiere ingresar?");
        double ingresado = sc.nextDouble();
        ingreso.setSaldoActual(saldo + ingresado);
       
    }
    public void retirar(CuentaBancaria retirar){
        System.out.println("Cuanto quiere retirar?");
        double retiro = sc.nextDouble();
        double saldo = retirar.getSaldoActual();
        
        if (saldo >= retiro) {
            retirar.setSaldoActual(saldo - retiro);
        }else{
            retirar.setSaldoActual(0);
        }
       
        
    }
    
    public void extraccionRapida(CuentaBancaria ingreso){
        System.out.println("Cuanto quiere retirar?");
        double retiro = sc.nextDouble();
        double saldo = ingreso.getSaldoActual();
        
        if (retiro <= 0.2 * saldo) {
            ingreso.setSaldoActual(saldo - retiro);
        }else{
            ingreso.setSaldoActual(saldo);
            System.out.println("Saldo insuficiente");
        }
        
    }
    
    public void consultarSaldo(CuentaBancaria ingreso){
        System.out.println("Su saldo es "+ ingreso.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria ingreso){
        System.out.println(ingreso.toString());
    }
}
    