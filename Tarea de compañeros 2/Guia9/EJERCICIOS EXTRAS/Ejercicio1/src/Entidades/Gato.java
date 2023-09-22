package Entidades;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String especie, String alimento, int edad, String raza) {
        super(nombre, especie, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        super.alimentar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
