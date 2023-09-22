package Entidad;

import Entidad.Edificio;

public class Polideportivo extends Edificio {
    
    String nombre;
    String tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipo, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public void calcularVolumen() {
        super.calcularVolumen(); //To change body of generated methods, choose Tools | Templates.
        int volumen = (ancho * largo) * alto;
        

        
            System.out.println("El volumen del polideportivo "+nombre+" es: "+volumen +" mts.");
    }

    @Override
    public void calcularSuperficie() {
        super.calcularSuperficie(); //To change body of generated methods, choose Tools | Templates.
            int superficie;
        int base = (ancho * largo) * 2;
        int cara1 = (ancho * alto) * 2;
        int cara2 = (alto * largo) * 2;

        superficie = (base + cara1 + cara2);

        

            System.out.println("La superficie del polideportivo "+nombre+" es: "+superficie +" mts.");

    }
    
    
    
    
    
}