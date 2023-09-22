package pkg1mano_de_obra;

import Entidades.DNI;
import Entidades.Persona;

/**
 * EJERCICIO PERSONA Realiza un programa en donde una clase Persona tenga como
 * atributo nombre, apellido y un objeto de clase Dni. La clase Dni tendrá como
 * atributos la serie (carácter) y número. Prueba acceder luego a los atributos
 * del dni de la persona creando objetos y jugando desde el main.
 */
public class Main {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        DNI dni = new DNI();

        persona1.setNombre("Luna");
        persona1.setApellido("orelogio");

        dni.setNumero(33498214);
        dni.setSerie("a");
        persona1.setDni(dni);
        
        System.out.println(persona1.toString());
    }

}
