package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio7 {
       
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String cadena;
       //String valido="&&&&&";
       int correctas=0, incorrectas=0;
        System.out.println("Ingrese una secuencia");
        cadena=leer.next().toUpperCase();
        //mientras que cadena sea distinta (!cadena) de "&&&&&" se puede escribir en forma explicita o asignar a la variable valido="&&&&&"
        while(!cadena.equals("&&&&&")){
            //La condicion será cierta si contiene 5 caracteres, empieza con X y termina con O
            //if(cadena.length()==5 && cadena.startsWith("X") && cadena.endsWith("O")){
            if(cadena.length()==5 && "X".equals(cadena.substring(0,1))&& "O".equals(cadena.substring(4,5))){
            correctas++;}  
            else{
            incorrectas++;} 
            System.out.println("Ingrese una secuencia"); 
            cadena=leer.next();
        }    
        System.out.println("La cantidad de secuencias correctas es:" + correctas);
        System.out.println("La cantidad de secuencias incorrectas es:" + incorrectas); 
    }

}
