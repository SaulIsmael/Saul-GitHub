
    
package ejercicio_poo_drr_10;
import java.util.Arrays;

public class Ejercicio_POO_DRR_10{

    public static void main(String[] args){
        int[] cincuenta = {10, 20, 30, 40, 50};
        int[] veinte = {5, 10, 15, 20};

        System.out.println(Arrays.toString(cincuenta));
        System.out.println(Arrays.toString(veinte));

        System.out.println();
        
        int[] resultado = funsionarOrdenarArreglos(cincuenta, veinte);

        for (int i = resultado.length - 1; i >= 0; --i) {
            
            System.out.println(resultado[i] + " ");        
   }
   
    }

    
    public static int[] funsionarOrdenarArreglos(int[]arreglo1, int[]arreglo2){

        int longitud = arreglo1.length + arreglo2.length;
        int[] resultado;
        resultado = new int[longitud];
        int indice = 0;

        for (int numero : arreglo1) {
            resultado[indice] = numero;
            ++indice;
        }
        for (int numero : arreglo2) {
            resultado[indice] = numero;
            ++indice;
        }
        Arrays.sort(resultado);
        return resultado;
    }
}
 




  

    
    
