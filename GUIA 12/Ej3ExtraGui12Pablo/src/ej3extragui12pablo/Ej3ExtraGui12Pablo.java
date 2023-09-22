package ej3extragui12pablo;

import Entidades.Alojamientos;
import Entidades.Camping;
import Entidades.Hotel4Estrellas;
import Entidades.Hotel5Estrellas;
import Entidades.Hoteles;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ej3ExtraGui12Pablo {

    public static void main(String[] args) {
        ArrayList<Alojamientos> alojamientos = new ArrayList<>();

        Hotel4Estrellas H4 = new Hotel4Estrellas(Enumeradores.TipoGym.A, "Pepe", 100, 20, 30, 2, 0d, "H4", "Av Alvear", "VGB", "Alicia");
        double aux = H4.calculoPrecioHabitacion();
        H4.setPrecioHabitacion(aux);

        alojamientos.add(H4);
        Hotel5Estrellas H5 = new Hotel5Estrellas(1, 10, 4, Enumeradores.TipoGym.B, "BAN", 50, 40, 100, 4, 0d, "H5", "Salta 153", "CABA", "Luis");
        double aux1 = H5.calculoPrecioHabitacion();
        H5.setPrecioHabitacion(aux1);

        alojamientos.add(H5);
        Camping C1 = new Camping(10, 2, Boolean.TRUE, 100, Enumeradores.TipoDeAcceso.PRIVADO, "Carpita", "Al lado del arroyo", "VGB", "Caro");
        alojamientos.add(C1);

        Residencia R1 = new Residencia(10, Boolean.TRUE, Boolean.TRUE, 1000, Enumeradores.TipoDeAcceso.PUBLICO, "Tus ultimos días", "Roca 152", "VCP", "Esteban");
        alojamientos.add(R1);

        int opc;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("-------------MENU-------------");

            System.out.println("1. Listado de Alojamientos: ");
            System.out.println("2. Orden de hoteles por precio: ");
            System.out.println("3. Lista de Campings con restaurante: ");
            System.out.println("4. Residencias con descuento para gremios: ");
            System.out.println("5. Salir del menu");
            System.out.println("Ingrese una opción");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Nombre de los Alojamientos");
                    System.out.println("--------------------------");
                    for (Alojamientos auxAloja : alojamientos) {
                        System.out.println("- "+auxAloja.getNombre());
                        
                    }
                    System.out.println("");
                    break;
                case 2:

                    ArrayList<Hoteles> hoteles = new ArrayList<>();
                    for (Alojamientos alojamiento : alojamientos) {
                        if (alojamiento instanceof Hoteles) {
                            hoteles.add((Hoteles) alojamiento);
                        }
                    }
                    hoteles.sort(Comparator.comparing(Hoteles::getPrecioHabitacion).reversed());
                    for (Hoteles hotel : hoteles) {
                        System.out.println("*************************");
                        System.out.println("Nombre Hotel:\n" + hotel.getNombre());
                        System.out.println("Precio Habitaciones:\n" + hotel.getPrecioHabitacion());

                    }
            
            break;

          case 3:
                    for (Alojamientos camping : alojamientos) {
                        if (camping instanceof Camping) {

                            // Se puede instanciar tambien:
//                            Camping object = (Camping) camping;
//                            objet.getRestaurante();
                            if (((Camping) camping).getRestaurante()) {
                                camping.infoAlojamiento();

                            }

                        }
                    }
                    break;

                case 4:
                    for (Alojamientos residencias : alojamientos) {
                        if (residencias instanceof Residencia) {
                            if (((Residencia) residencias).getDescuentoGremio()) {
                                residencias.infoAlojamiento();

                            }

                        }

                    }
                    break;
                case 5:
                    System.out.println("Chauuuuu!!!!");
                    break;

                default:
                    System.out.println("Ingrese una opción válida");
            }

        
    }
    while (opc 
!= 5);

    }
    }
