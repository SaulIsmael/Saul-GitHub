package Entidades;

public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String especie, String alimento, int edad, String raza) {
        super(nombre, especie, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        super.alimentar(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
