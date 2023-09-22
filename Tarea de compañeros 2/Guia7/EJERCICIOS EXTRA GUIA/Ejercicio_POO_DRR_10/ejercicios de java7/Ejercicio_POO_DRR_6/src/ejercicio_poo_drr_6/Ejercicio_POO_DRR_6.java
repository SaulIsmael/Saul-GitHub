
package ejercicio_poo_drr_6;

import entidades.Cafetera;
import servicios.Funciones_De_Cafetera;


public class Ejercicio_POO_DRR_6 {

    
    public static void main(String[] args) {
        Funciones_De_Cafetera fc = new Funciones_De_Cafetera();
        Cafetera cafetera = fc.iniciarCafetera();
        fc.llenarCafetera(cafetera);
        fc.servirTaza(cafetera);
        fc.vaciarCafetera(cafetera);
        fc.agregarCafe(cafetera);
        
    }
    
}
