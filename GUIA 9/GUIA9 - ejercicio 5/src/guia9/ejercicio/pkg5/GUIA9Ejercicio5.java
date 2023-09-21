package guia9.ejercicio.pkg5;

import Persona.Persona;
import PersonaService.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class GUIA9Ejercicio5 {
       
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        PersonaService pServ = new PersonaService();
        Persona person = pServ.crearPersona();
        pServ.calcularEdad(person);
        System.out.println("Ingrese una edad para comparar con la ingresada anteriormente: ");
        int edad = sc.nextInt();
        pServ.menorQue(person, edad);
        pServ.mostrarPersona(person);
    }
}