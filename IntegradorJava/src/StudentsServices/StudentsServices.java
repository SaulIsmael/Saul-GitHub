/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsServices;

import Estudiante.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class StudentsServices {

    int contProm = 0;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
//    public Estudiante crearEstudiante() {
//        Random random = new Random();
//        Estudiante array[] = new Estudiante[8];
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese el nombre del Estudiante");
//        String name = sc.next();
//        float nota = random.nextInt(11);
//        return new array(name, nota);
//    }

    public Estudiante[] crearEst() {
        System.out.println("Ingrese la cantidad de estudiantes");
        int dimension = sc.nextInt();

        Estudiante[] listaEst = new Estudiante[dimension];
        String nombre;
        int nota;

        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese nombre del estudiante");
            nombre = sc.next();
            nota = (int) (Math.random() * 100 + 1);

            Estudiante est = new Estudiante(nombre, nota);
            listaEst[i] = est;
        }

        return listaEst;
    }

    public float calcularProm(Estudiante listaEst[]) {
        float sumaNota = 0;
        for (int i = 0; i < listaEst.length; i++) {
            sumaNota += listaEst[i].getNota();

        }
        float prom = sumaNota / listaEst.length;
        System.out.println("El promedio es " + prom);
        return prom;
    }

    //Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al
    //promedio del curso  
    public String[] notaMayor(Estudiante[] lista) {
        float promedio = calcularProm(lista);
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getNota() > promedio) {
                contProm++;
            }
        }
        String mayores[] = new String[contProm];
        for (int j = 0; j < contProm; j++) {
            mayores[j] = lista[j].getNombre();
            System.out.println("El nombre del Promedio mayor " + mayores[j]);
        }

        return mayores;
    }

//3. Por último, deberemos mostrar todos los estudiantes con
// * una nota mayor al promedio.
//    public void mostrarNotaMayor(Estudiante[] lista) {
//        String [] notasMayores = new String[  contProm];
//        notasMayores = notaMayor();
//        for (int i = 0; i < 10; i++) { 
//            System.out.println("Estudiantes " + notasMayores[i]);
//        }
//      
//        
//        
//    }
    public void mostrarTodo(Estudiante[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("El nombre " + lista[i].getNombre() + "Nota " + lista[i].getNota());
        }

    }
}

