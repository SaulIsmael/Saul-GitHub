/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author katsu
 */
public class Baraja {

    Carta car = new Carta();
    Set<Carta> cartas = new HashSet();
    List<Carta> listCartas = new ArrayList();
    List<Carta> repartidas = new ArrayList();
    List<Carta> enMano = new ArrayList();

    public Carta crearCarta() {
        int numero = (int) (Math.random() * 13);

        while (numero == 8 || numero == 9 || numero == 0) {
            numero = (int) (Math.random() * 13);
        }

        int opc = (int) (Math.random() * 5);

        switch (opc) {
            case 1:
                car.setPalo("espada");
                break;
            case 2:
                car.setPalo("oro");
                break;
            case 3:
                car.setPalo("basto");
                break;
            case 4:
                car.setPalo("copa");
                break;

        }

        return new Carta(car.getPalo(), numero);
    }

    public void llenarBaraja() {

        for (int i = 0; i < 40; i++) {

            cartas.add(crearCarta());
        }
        listCartas = new ArrayList(cartas);
        enMano = listCartas;
        /* for (Carta elemento : cartas) {
            System.out.println(elemento);
        }
        System.out.println(cartas.size());*/
    }

    public void barajar() {
        //llenarBaraja();
        Collections.shuffle(listCartas);
    }

    public void darCarta(int num) {


        if (num > enMano.size()) {
            System.out.println("No hay suficientes cartas para repartir");
        } else {
            for (int i = 0; i < num; i++) {
                repartidas.add(enMano.remove(enMano.size() - 1));
            }
            System.out.println("Las cartas fueron repartidas");
        }

    }

    public void cartasMonton() {  //mostar repartidas
        int i = 1;
        if (repartidas.size() == 0) {
            System.out.println("No se repartieron cartas");
        } else {
            for (Carta elemento : repartidas) {
                System.out.println("Carta " + i + elemento);
                i++;
            }
        }
    }

    public void mostrarBaraja() {   //muetra en mano
        int i = 1;
        if (enMano.size() == 0) {
            System.out.println("Se repartieron todas las cartas");
        } else {
            // for (Carta elemento : enMano) {
            // System.out.println("Carta " + i + elemento);

            for (int j = enMano.size() - 1; j >= 0; j--) {
                System.out.println("Carta " + i + enMano.get(j));
                i++;
            }
        }

    }
    
    public void cartasDisponibles(){
        System.out.println("La cantidad de cartas disponibles es "+ enMano.size());
    }
    
    public void siguienteCarta(){
        System.out.println("La siguiente carta es "+enMano.get(enMano.size()-1));
    }

}
