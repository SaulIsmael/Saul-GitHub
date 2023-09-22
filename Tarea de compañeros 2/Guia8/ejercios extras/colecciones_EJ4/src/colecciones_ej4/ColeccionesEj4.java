package colecciones_ej4;

import Entidades.Pelicula;
import Servicios.ServicioPelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ColeccionesEj4 {

    public static void main(String[] args) {

        ArrayList<Pelicula> peli = new ArrayList();
        ServicioPelicula ps = new ServicioPelicula();

        String aux = "";
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        while (!aux.equalsIgnoreCase("n")) {
            peli.add(ps.crearPeli());
            System.out.print("¿Ingresar otra peli? (S/N): ");
            aux = leer.next();
            System.out.println("");
        }

        ps.mostrarPeli(peli);
        ps.unaHora(peli);
        ps.duracionOrden(peli);
        ps.duracionOrdenMenos(peli);
        ps.tituloOrden(peli);
        ps.directorOrden(peli);

        System.out.println("");

    }//final main

}
