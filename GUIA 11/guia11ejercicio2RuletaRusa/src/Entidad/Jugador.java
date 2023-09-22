/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author katsu
 */
public class Jugador {
    
    /*Clase Jugador: esta clase posee los siguientes atributos: 
    id (representa el número del jugador), 
    nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y
    mojado (indica si está mojado o no el jugador). El número de
    jugadores será decidido por el usuario, pero debe ser entre 1 y 6.
    Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama
    a los métodos de mojar() y siguienteChorro() de Revolver.
    El jugador se apunta, aprieta el gatillo y si el revolver tira 
    el agua, el jugador se moja. El atributo mojado pasa a false y 
    el método devuelve true, sino false.*/
    
 private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador"+id;
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
    public boolean disparo(Revolver rev){
       /* el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
      
        if (rev.mojar()) {
            System.out.println("El jugador esta mojado!"+this.nombre);
            this.mojado=true;
            return true;
        }else{
            System.out.println("Sigue jugando!");
           rev.siguienteChorro();
           return false;
        }   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* private int id;
    private String nombre;
    private boolean mojado;
    
    public boolean disparo(Revolver r){
        this.mojado = false;
        
        if (r.mojar()) {
           return this.mojado = true;
        }
        r.siguienteChorro();
        
        return this.mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }*/
    
    
    
    
}
