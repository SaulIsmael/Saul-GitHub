package ejercicio_poo_drr_9;

import java.util.Scanner;

public class Ejercicio_POO_DRR_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer valor: ");
        int a = sc.nextInt();
        System.out.println("Ingrese segundo vaor ");
        int b = sc.nextInt();
        //a    
        int min = Math.min(a, b);
        System.out.println("El minimo es: " + min);
        int max = Math.max(a, b);
        System.out.println("El maximo es: " + max);

        //b
        double potencia = Math.pow(a, b);
        System.out.println("La potencia es: " + potencia);

        //c
        double raiz = Math.sqrt(b);
        System.out.println("La raiz es: " + raiz);

    }

}


    
   

   
