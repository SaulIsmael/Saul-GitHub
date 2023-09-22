package mano_a_la_obra2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Mano_A_La_Obra2 {

    public static void main(String[] args) {

        //Listas
        ArrayList<Integer> numerosA = new ArrayList(); //LISTA DE TIPO INTEGER
        //int x = 20;
        //numerosA.add(x); //agregamos el numero 20 a la lista, en la posicion 0

        numerosA.add(1);
        numerosA.add(2);
        numerosA.add(3);
        numerosA.add(4);
        
        numerosA.remove(0);//remove(elemento): Este método remueve la primera aparición de un elemento a borrar en una lista


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
        
        numerosB.remove(4);//remove(int índice): Este método remueve un elemento de un índice especifico. Esto mueve los elementos, de manera que no queden índices sin elementos
        System.out.println(numerosB);

        //MAPAS
        HashMap<Integer,String> Alumnos = new HashMap();

        int dni = 34576189;
        String nombreAlumno = "Pepe";

        int edad = 34;
        String apellidoAlumno = "Gonsales";

        String sexo = "masculino";
        String sexoAlumno = "Masculino";

       //System.out.println(Alumnos,edad);
       //Alumnos.put(dni,edad,sexo); //agremaos la llave y el valor  
    }

}
