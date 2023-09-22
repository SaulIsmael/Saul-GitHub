
package integradorjava;

import Estudiante.Estudiante;
import StudentsServices.StudentsServices;
/**
 *ajio ajio ajio 
 * @author Saul Ismael Mansilla
 */
public class IntegradorJava {
       
    
    public static void main(String[] args) {
        
        
        StudentsServices serv = new StudentsServices();
        Estudiante listaEst[] = serv.crearEst();
        Estudiante persona = new Estudiante();
        //serv.calcularProm(listaEst);
        serv.notaMayor(listaEst);
        serv.mostrarTodo(listaEst);
    }

}
