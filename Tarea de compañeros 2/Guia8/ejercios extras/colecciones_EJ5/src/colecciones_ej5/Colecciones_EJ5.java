package colecciones_ej5;
import Entidades.Pais;
import Servicios.PaisServicio;
import java.util.HashSet;
import java.util.Scanner;

public class Colecciones_EJ5 {


    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServicio ps=new PaisServicio();
        HashSet<Pais> paises=new HashSet();
        String aux="";
        
        while (!aux.equalsIgnoreCase("n")) {
            paises.add(ps.flag());
            System.out.print("¿Querés ingresar otro?(S/N): ");
            aux=leer.next();
            System.out.println("");
        }
        
        ps.ordenar(paises);
        ps.eliminar(paises);
        System.out.println("");
    }

    
    
}

    
    
 
    
