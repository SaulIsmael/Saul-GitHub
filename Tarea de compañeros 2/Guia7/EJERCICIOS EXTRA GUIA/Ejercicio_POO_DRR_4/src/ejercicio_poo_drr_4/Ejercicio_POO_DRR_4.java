package ejercicio_poo_drr_4;

import java.util.Scanner;

public class Ejercicio_POO_DRR_4 {

    
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
     int a;//CANTIDAD DE FILAS
     int b;//CANTIDAD DE FIJURAS POR CADA FILAS
     int i;//DIBUJAR LAS FILAS
     int j;//DIBUJAR LAS FIGURAS FILAS
     int e;//ESPACIO
     int opc;//SELECCIONA OPXIONES DE RECTANGULO (VACIO O LLENO)
     String fig;
     
    System.out.println("rectangulo");
    System.out.println("ingrese opcion");
    System.out.println("1:Reactangulo lleno");
    System.out.println("2:perimetro del trectangulo");
    opc = teclado.nextInt();
    
        System.out.println("Ingrese lado a: ");
        a=teclado.nextInt();
        System.out.println("Ingrese lado b: "); 
        b=teclado.nextInt();
        System.out.println("Ingrese figura: ");
        fig=teclado.nextLine();
        fig=teclado.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
    if(opc == 1)
    {
        for(i=1; i<=a; i++)
    {
         for(j=1;j<=b;j++)  
     {
         System.out.print(" "+fig);   
    }
         System.out.println(" ");
    } 
    
    if(opc == 2)
        for(i=1;i<=b;i++)
    {
     System.out.print(" "+fig);   
    }
      System.out.println(" ");
      
     for(i=1;i<=a-2;i++)
     {
         System.out.println(" "+fig);
         for(e=1;e<=b-2;e++)
         {
             System.out.print("  ");    
         }
         System.out.print(" "+fig); 
         System.out.println(" ");
     }
     for(i=1;i<=b;i++)
     {
         System.out.print(" "+fig);  
     }
        System.out.println(" ");   
     }
    {
    
    
   }
    
}
    
}
