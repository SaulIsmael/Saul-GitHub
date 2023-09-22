package ejercicio_mano_de_obra;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_Mano_De_Obra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AlumnoServicio as = new AlumnoServicio();

        ArrayList<Alumno> li = as.listado();
        System.out.println("");
        System.out.println("Ingrese el alumno a evaluar: ");
        String al = leer.next();
        int otro = 0;

        for (Alumno alum : li) {
            if (alum.getNombre().equalsIgnoreCase(al)) {
                as.notaFinal(alum.getNotas());

                otro++;

            }
        }
        if (otro == 0) {
            System.out.println("no se encontró al alumno");
        }

    }

}
