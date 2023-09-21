package guia9.ejercicio.pkg1;

import Cadena.Cadena;
import CadenaService.CadenaService;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class GUIA9Ejercicio1 {
       
    
    public static void main(String[] args) {
        CadenaService cs = new CadenaService();
        
        Cadena c1 = cs.crearFrase();
        
        cs.mostrarMenu(c1);
    }

    
}
