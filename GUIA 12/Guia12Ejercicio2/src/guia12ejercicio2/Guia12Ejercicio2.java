/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12ejercicio2;

import Entidad.Lavadora;
import Entidad.Televisor;

/**
 *
 * @author Jib
 */
public class Guia12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lavadora e1 = new Lavadora();
        System.out.println("*Crear Lavadora");
        e1.crearLavadora();
        e1.precioFinal();
//        System.out.println("Datos de la lavadora:");
//        System.out.println(e1.getColor());
//        System.out.println("Consumo " + e1.getConsumo());
//        System.out.println("Peso " + e1.getPeso());
//        System.out.println("Carga " +e1.getCarga());
        System.out.println("Precio de la lavadora" + e1.getPrecio());
        
        
        Televisor e2 = new Televisor();
        System.out.println("*Crear Televisor*");
        e2.crearTelevisor();
        e2.precioFinal();
        e2.toString();
        
        System.out.println("Precio del televisor: " + e2.getPrecio());
        
    }

}
