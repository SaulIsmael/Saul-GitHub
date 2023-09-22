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
public class Revolver {
    /*Clase Revolver de agua: esta clase posee los siguientes atributos: 
    posición actual (posición del tambor que se dispara, puede que esté 
    el agua o no) y posición agua (la posición del tambor donde se 
    encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición 
    del agua. Los valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición
    actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde 
    está el agua)*/
    
   private int posActual;
    private int posAgua;

    public Revolver() {
        this.posActual= (int) (Math.random() *6);
        this.posAgua=(int) (Math.random() *6);
    }

    
    @Override
    public String toString() {
        return "RevolverAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }
    
    public boolean mojar(){
    // mojar(): devuelve true si la posición del agua coincide con la posición actual 
        if (this.posActual==this.posAgua) {
            return true;         
    }
    return false;
    }
    
    public void siguienteChorro(){
       // siguienteChorro(): cambia a la siguiente posición del tambor
        if (this.posActual==6) {
            this.posActual=1;
            
        }else{
            this.posActual++;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* private int posicionActual;
    private int posicionAgua;
    
    public void llenarRevolver(){
        
        this.posicionActual = (int) (Math.random() *6);
        this.posicionAgua = (int) (Math.random() *6);
        
    }
    
    public boolean mojar(){
        
        boolean mojado = false;
        llenarRevolver();
        
        if (this.posicionActual == this.posicionAgua) {
            mojado = true;
        }
        
        return mojado;
    }
    
    public int siguienteChorro(){
        llenarRevolver();
        //int siguiente;
        
        if (this.posicionActual < 6) {
            return (this.posicionActual + 1);
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    */
    
    
}
