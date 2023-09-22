/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones01;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();

        System.out.println("--- PERSONA 1 ---");
        //Persona per1 = ps.crearPersona();
        Persona per1 = null;
        //int per1imc = ps.calcularIMC(per1);
        boolean per1may;

        try {
            per1may = ps.esMayorDeEdad(per1);

            //  System.out.println(per1imc);
        } catch (NullPointerException a) {
            System.out.println("la persona es nula");
            System.out.println (a.fillInStackTrace() );
        }
        
    }

}
