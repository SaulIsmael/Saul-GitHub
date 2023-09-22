package mano_a_la_obra1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Mano_A_La_Obra1 {

    public static void main(String[] args) {
        //Listas
        ArrayList<Integer> numerosA = new ArrayList(); //LISTA DE TIPO INTEGER
        //int x = 20;
        //numerosA.add(x); //agregamos el numer 20 a la lista, en la posicion 0

        numerosA.add(1);
        numerosA.add(2);
        numerosA.add(3);
        numerosA.add(4);

        System.out.println(numerosA);

        //Conjunto
        HashSet<Integer> numerosB = new HashSet();
        // int y = 20;
        // numerosB.add(y);

        numerosB.add(1);
        numerosB.add(2);
        numerosB.add(3);
        numerosB.add(4);
        numerosB.add(5);
        System.out.println(numerosB);

        //MAPAS
        
        HashMap<Integer, String> alumnos = new HashMap();

        int dni = 34576189;
        String nombreAlumno = "Pepe";

        int edad = 34;
        String apellidoAlumno = "Gonsales";
       
        String sexo = "masculino";
        String sexoAlumno = "Masculino";
        
        // System.out.println(dni,nombreAlumno,edad, apellidoAlumno,sexo,sexoAlumno);
        //alumnos.put(dni,edad,sexo);//agremaos la llave y el valor 
     
        
               
         
    }

}
