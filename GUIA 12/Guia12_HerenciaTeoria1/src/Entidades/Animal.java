package Entidades;

public class Animal {
    //nombre, alimento, edad* y raza del Animal.

    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    
    public void alimentarse(){
        System.out.println("Este animal se alimenta de "+ alimento);
    }
    
    
    
    
    
}
