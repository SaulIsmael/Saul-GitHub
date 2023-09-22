
package ejercico_poo_ddr_2;

import java.util.Scanner;


public class Ejercico_POO_DDR_2 {

    
    public static void main(String[] args) {
       Scanner circuferencia=new Scanner(System.in);
       double Radio,Perimetro,Area;
        System.out.println("introduce radio de la circuferencia");
        Radio=circuferencia.nextDouble();
        Perimetro=2*Math.PI*Radio;
        Area=Math.PI*Math.pow(Radio,2);
        System.out.println("Longitud de la circuferencia:"+Perimetro);
        System.out.println("Longitud de la circuferencia:"+Area);




    }
    
}
