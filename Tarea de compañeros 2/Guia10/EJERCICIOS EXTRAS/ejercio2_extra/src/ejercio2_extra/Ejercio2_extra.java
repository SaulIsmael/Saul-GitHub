package ejercio2_extra;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

public class Ejercio2_extra {

    public static void main(String[] args) {
        Lavadora lavarropa = new Lavadora();

        System.out.println("---LAVARROPA DREAN---");
        lavarropa.crearLavadora();
        System.out.println("");
        lavarropa.precioFinal();
        System.out.println("");
        System.out.println("---TELEVISOR LG---");
        Televisor tele = new Televisor();
        tele.crearTv();
        System.out.println("");
        tele.precioFinal();
    }

}
