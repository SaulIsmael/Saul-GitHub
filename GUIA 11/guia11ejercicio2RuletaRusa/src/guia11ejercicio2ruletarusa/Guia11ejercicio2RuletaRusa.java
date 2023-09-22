/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio2ruletarusa;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author katsu
 */
public class Guia11ejercicio2RuletaRusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Juego juego= new Juego();
        ArrayList<Jugador>jugadores=new ArrayList ();
        Revolver rev;
       // Jugador j1 = new Jugador();
        System.out.println("Cuantos jugadores participan?");
        int cant=sc.nextInt();
        if (cant==0) {
            cant=6;
        }
        
        for (int i = 0; i < cant; i++) {
            jugadores.add(new Jugador(i+1));        
        }
        
        juego.llenarJuego(jugadores, new Revolver());
       
        juego.ronda();  
    }
    
    
}
