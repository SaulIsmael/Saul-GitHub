package ej_03extra;

import Entidades.Baraja;
import Entidades.Mano;
import Servicio.ServicioCartas;

public class Ej_03Extra {

    public static void main(String[] args) {
        ServicioCartas sdc = new ServicioCartas(); //Servicio con el cual crearé el objeto mano, baraja que a su vez contendrá como atributo una lista de clase carta      
        Baraja barajaJugador = sdc.crearBaraja(); //Creo mi objeto baraja que tendrá como atributo una lista de cartas de la clase carta
        Mano manoJugador = sdc.crearMano(); //Creo mi objeto mano que tendrá como atributo una lista de cartas de la clase carta
        sdc.rondaCartas(barajaJugador, manoJugador);
    }

}
