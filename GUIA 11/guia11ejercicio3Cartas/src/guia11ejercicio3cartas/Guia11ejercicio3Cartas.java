/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio3cartas;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.Scanner;

/**
 *
 * @author katsu
 */
public class Guia11ejercicio3Cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Carta cart = new Carta();
        Baraja bar = new Baraja();

        bar.llenarBaraja();
        
        String opcion;

        do {
            System.out.println("------MENU--------");
            System.out.println("1 para barajar");
            System.out.println("2 para mostrar la siguiente carta");
            System.out.println("3 para mostrar cartas diponibles");
            System.out.println("4 para dar cartas");
            System.out.println("5 mostrar las cartas repartidas");
            System.out.println("6 mostrar las cartas que quedan");

            System.out.println("Ingrese una opcion");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    bar.barajar();

                    break;
                case 2:
                    bar.siguienteCarta();

                    break;
                case 3:
                    bar.cartasDisponibles();

                    break;
                case 4:
                    System.out.println("Cuantas cartas quiere repartir?");
                    int num = sc.nextInt();
                    bar.darCarta(num);

                    break;
                case 5:
                    bar.cartasMonton();

                    break;
                case 6:
                    bar.mostrarBaraja();

                    break;

            }
            System.out.println("desea ingresar otra opcion? S/N");
             opcion = sc.next();

        } while (opcion.equalsIgnoreCase("s"));

    }

}
