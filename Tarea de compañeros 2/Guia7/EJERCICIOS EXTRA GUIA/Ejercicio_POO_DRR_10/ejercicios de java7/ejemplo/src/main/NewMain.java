package main;

import entidad.Persona;

public class NewMain {
    
    public static void main(String[] args) {
        Persona alejandro = new Persona();
        alejandro.setNombre("alejandro");
        alejandro.setEdad(21);
//alejandro=new Persona("alejandro",21);
        System.out.println(alejandro.toString());
    }
    
}
