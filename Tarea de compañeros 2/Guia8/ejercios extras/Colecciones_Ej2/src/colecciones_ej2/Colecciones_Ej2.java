
package colecciones_ej2;

import Entidades.Perro2;
import Servicios.PerroServicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones_Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Perro2> perritos = new ArrayList();
        String resp = "r";
        PerroServicio2 ps = new PerroServicio2();

        do {
            System.out.print("¿Ingresar raza de perro? [S/N]: ");
            resp = leer.next();
            System.out.println();

            if (!resp.equalsIgnoreCase("N")) {
                ps.llenaRazas(perritos);

            }

        } while (!resp.equalsIgnoreCase("N"));
        System.out.println("");

        System.out.println("---Razas de la lista---");
        ps.muestraPerros(perritos);

        ps.eliminarPerro(perritos);

        System.out.println("---Razas de la lista---");
        ps.muestraPerros(perritos);

//EL PROBLEMA ESTÁ EN EL REMOVER (ELIMINARPERRO), ELIMINA TODO EN VEZ DE SOLO UN INDICE
    }

}
