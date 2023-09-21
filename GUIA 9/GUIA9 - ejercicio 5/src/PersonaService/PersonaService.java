/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaService;

import Persona.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class PersonaService {

    /* Método crearPersona que pida al usuario Nombre y fecha
    de nacimiento de la persona a crear. 
    Retornar el objeto Persona creado.*/
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre");
        String nom = sc.next();
        System.out.println("Ingrese la fecha de nacimiento cargando aaaa/MM/dd");
        Date fech = new Date(sc.nextInt() - 1900, sc.nextInt() - 1, sc.nextInt());

        return new Persona(nom, fech);
    }

    /*Método calcularEdad que calcule la edad del usuario 
    utilizando el atributo de fecha de nacimiento y la fecha 
    actual.*/
    public int calcularEdad(Persona per) {
        Date fechHoy = new Date();

        int edad = fechHoy.getYear() - per.getFechaN().getYear();

        return edad;
    }

    /*Método menorQue recibe como parámetro una Persona y una edad.    
Retorna true si la persona es menor que la edad consultada o 
    false en caso contrario.*/
    public boolean menorQue(Persona per, int edad) {
        boolean menor = calcularEdad(per) < edad;
        /* if (calcularEdad(per)< edad) {
        return true;
        }else{
        return false;
        }*/
        //abreviado
        //return calcularEdad(per)< edad;
        System.out.println("La edad ingresada es menor que la edad ingresada anteriormente  " + menor);
        return menor;
    }

    /*Método mostrarPersona que muestra la información de la
    persona deseada.*/
    public void mostrarPersona(Persona per) {
        int edad = calcularEdad(per);
        System.out.println(per.toString() + " La edad es " + edad);
    }

}

