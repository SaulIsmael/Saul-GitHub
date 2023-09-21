package guia9.ejercicio.pkg2;

import Entindades.ParDeNumeros;
import Servicio.ParDeNumerosService;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class GUIA9Ejercicio2 {

    public static void main(String[] args) {
        ParDeNumeros num = new ParDeNumeros();
        ParDeNumerosService nums = new ParDeNumerosService();
        nums.mostrarValores(num);

        System.out.println("El mayor es: " + nums.devolverMayor(num));

        nums.calcularPotencia(num);
        nums.raiz(num);

    }

}
