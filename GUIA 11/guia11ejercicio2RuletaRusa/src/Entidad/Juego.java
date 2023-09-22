/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author katsu
 */
public class Juego {
    /*Clase Juego: esta clase posee los siguientes atributos: 
    Jugadores (conjunto de Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este 
    método recibe los jugadores y el revolver para guardarlos 
    en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con
    el revolver de agua y aprieta el gatillo. Sí el revolver 
    tira el agua el jugador se moja y se termina el juego, 
    sino se moja, se pasa al siguiente jugador hasta que uno 
    se moje. Si o si alguien se tiene que mojar. Al final del 
    juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los 
    atributos de la clase Juego*/
    private List<Jugador> jugadores;
    private Revolver rev;

    public Juego() {
        jugadores= new ArrayList();
    }
    
    public void llenarJuego(ArrayList <Jugador>jugadores, Revolver rev){
        this.jugadores=jugadores;
        this.rev= rev;
    }
    
    public void ronda(){
        int k=1;
        do{
        for (Jugador jugador : jugadores) {
            if (jugador.disparo(rev)) {
                k=0;
                break;   
            }
        }
        }while(k==1);
        }
  
    
    
    
    
    
    
    
    
    /* private List<Jugador> jugadores;
    private Revolver revol;
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public List<Jugador> cargarJugadores(){
        String opc;
        
        do {
            Jugador jug = new Jugador();
            
            System.out.println("Ingrese la id del jugador");
            jug.setId(sc.nextInt());
            //System.out.println("Ingrese el nombre del jugador");
            jug.setNombre("Jugador" + jug.getId());
            jugadores.add(jug);
            
            System.out.println("Desea ingresar otro jugador? S/N");
            opc = sc.next();
            
        } while (opc.equalsIgnoreCase("s"));
        
        
        
        return new ArrayList<>(jugadores);
    }
    
    public void llenarJuego( Revolver r){
        
       cargarJugadores();
       
       r.llenarRevolver();
        
    }
    
    public void ronda(){
        llenarJuego(revol);
        
    }*/
    
    
}
