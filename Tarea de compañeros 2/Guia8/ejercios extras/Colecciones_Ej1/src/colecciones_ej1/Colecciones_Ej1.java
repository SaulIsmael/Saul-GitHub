package colecciones_ej1;

import Servicios.PerroServicio;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones_Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Perro> perritos = new ArrayList();
        String resp = "r";
        PerroServicio ps = new PerroServicio();

        do {
            System.out.print("¿Desea ingresar una raza de perro? [S/N]: ");
            resp = leer.next();
            System.out.println();

            if (!resp.equalsIgnoreCase("N")) {
                ps.llenaRazas(perritos);

            }

        } while (!resp.equalsIgnoreCase("N"));
        System.out.println("----Razas de la lista----");
        ps.muestraPerros(perritos);

    }

}  
    

