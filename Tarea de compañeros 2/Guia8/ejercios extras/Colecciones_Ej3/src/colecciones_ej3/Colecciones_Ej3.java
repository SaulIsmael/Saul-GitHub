
package colecciones_ej3;

import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;


public class Colecciones_Ej3 {

    
    public static void main(String[] args) {
        
Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AlumnoServicio as = new AlumnoServicio();
        ArrayList<Alumno> alumnito = new ArrayList();
        String aux = "";

        while (!aux.equalsIgnoreCase("n")) {
            alumnito.add(as.crearAlumno());
            System.out.print("¿Ingresar otro alumno?(S/N): ");
            aux=leer.nextLine();
            System.out.println("");
            
            
            }
            
        as.notaFinal(alumnito);
            
        
            

        
        
        
        System.out.println("");

    }//final
        
    }
    
}
