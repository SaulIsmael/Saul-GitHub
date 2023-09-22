
package ejercicio_poo_ddr_3;

import java.util.Scanner;


public class Ejercicio_POO_DDR_3 {

    
    public static void main(String[] args) {
        Metodos chavo= new Metodos();
        Scanner entrada=new Scanner(System.in);
        int n1,n2,resultado, opción;
        boolean op= true;
        while (op){
           
            System.out.println("***********************");
            System.out.println("Menu");    
            System.out.println("1. sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. didvidir");
            System.out.println("5. salir");
            System.out.println("Seleccione Opcion:");
            opción= entrada.nextInt();
            
            if (opción == 5){
                System.out.println("Finalizó......");
                break;
                
            }else{
                switch (opción){
                    case 1:
                        System.out.println("Ingrese el ler.Valor:");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el 2do. valor:");
                        n2=entrada.nextInt();
                        resultado=chavo.sumar(n1, n2);
                        System.out.println("La suma es:"+ resultado);
                        break;
                        
                    case 2:
                        System.out.println("Ingrese el ler.Valor:");
                         n1 = entrada.nextInt();
                        System.out.println("Ingrese el 2do. valor:");
                        n2=entrada.nextInt();
                        resultado=chavo.restar(n1, n2);
                        System.out.println("La Resta es:"+ resultado);
                        break;
                        
                    case 3:
                        System.out.println("Ingrese el ler.Valor:");
                         n1 = entrada.nextInt();
                        System.out.println("Ingrese el 2do. valor:");
                        n2=entrada.nextInt();
                        resultado=chavo.multiplicar(n1, n2);
                        System.out.println("La Multiplicación es:"+ resultado);
                        break;
                    
                     case 4:
                        System.out.println("Ingrese el ler.Valor:");
                         n1 = entrada.nextInt();
                        System.out.println("Ingrese el 2do. valor:");
                        n2=entrada.nextInt();
                        resultado=chavo.dividir(n1, n2);
                        System.out.println("La División es:"+ resultado);
                        break;
                      
                     default:
                         System.out.println("Opción no valida.....");
                }
            }
        }
    }
    
}
