/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1Guia8;

import Entidad.CuentaBancaria;
import java.util.Scanner;
import Servicio.CuentaBancariaServicio; 
/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio1guia8 {

    /*Realizar una clase llamada CuentaBancaria en el
paquete Entidades con los siguientes atributos:
numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y
 se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y 
se le restara al saldo actual. Si la cuenta no tiene la cantidad 
de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.*/
    public static void main(String asd[]) {
        Scanner sc = new Scanner(System.in);
        int opc;
        CuentaBancariaServicio plata = new CuentaBancariaServicio();
        CuentaBancaria biyuya = plata.crearCuenta();

        do {

            System.out.println("Seleccione una opcion:");
            System.out.println("1. Deposito");
            System.out.println("2. Extraccion");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    plata.ingresar(biyuya);
                    break;
                case 2:
                    plata.retirar(biyuya);
                    break;
                case 3:
                    plata.extraccionRapida(biyuya);
                    break;
                case 4:
                    plata.consultarSaldo(biyuya);
                    break;
                case 5:
                    plata.consultarDatos(biyuya);
                    break;
                case 6:
                    System.out.println("Buenas Tardes");
                    break;

            }
            /*} /*while*/
        }while(opc != 6);
       
    }
}
