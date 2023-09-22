package ejercicio_poo_drr_8;

import java.util.Stack;
import java.util.StringTokenizer;

public class Ejercicio_POO_DRR_8 {

    public class InversionCadenaCaracteres {

    }

    public static void main(String[] args) {
        String lenguaje = "Java es un lenguaje de programación";

       StringBuilder sb= new StringBuilder(lenguaje);
       
        System.out.println(sb.reverse());
        
        Stack<String> palabra = new Stack<>();
        
        StringTokenizer st= new StringTokenizer(lenguaje," ");
        
        while(st.hasMoreTokens()){
            palabra.add(st.nextToken());            
      }
       while(!palabra.empty()){
           System.out.println(palabra.pop());
           System.out.println(' ');
       }  
    }

}
