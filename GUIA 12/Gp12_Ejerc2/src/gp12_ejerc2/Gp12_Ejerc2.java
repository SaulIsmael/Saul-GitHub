
package gp12_ejerc2;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iptal
 */
public class Gp12_Ejerc2 {
    
/* Finalmente, en el main debemos realizar lo siguiente: Vamos a crear una
    Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el
    precio final de los dos electrodomésticos.*/


   
    public static void main(String[] args) {
       
//        Lavadora lavadora=new Lavadora(0);
//        lavadora.crearLavadora();
//        System.out.println("El precio final de la Lavadora es $: "+lavadora.getPrecio());
//        Televisor televisor = new Televisor(0, true);
//        televisor.crearTelevisor();
//        System.out.println("El precio final del Televisor es de $: "+televisor.getPrecio());
        
//    Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.    

List<Electrodomesticos> listaElectrodom = new ArrayList<>();
listaElectrodom.add(new Lavadora(32, 1000d, "gris", 'A', 81d));
listaElectrodom.add(new Lavadora(32, 1000d, "gris", 'A', 81d));
listaElectrodom.add(new Televisor(42, true, 1000d, "azul", 'B', 50d));
listaElectrodom.add(new Televisor(35, false, 1000d, "azul", 'B', 18d));

        for (Electrodomesticos aux : listaElectrodom) {
            aux.precioFinal();
            System.out.println("Tipo"+aux.getClass());
            System.out.println(aux.toString());
            System.out.println(aux.getPrecio());
            
        }



        
        
        
    }
    
}
