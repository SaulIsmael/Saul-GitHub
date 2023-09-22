package main;

import entidad.Persona;

public class NewMain {
    
    public static void main(String[] args) {
        Persona alejandro = new Persona();
        alejandro.setNombre("Candela");
        alejandro.setEdad(19);

        System.out.println(alejandro.toString());
    }
    
}
