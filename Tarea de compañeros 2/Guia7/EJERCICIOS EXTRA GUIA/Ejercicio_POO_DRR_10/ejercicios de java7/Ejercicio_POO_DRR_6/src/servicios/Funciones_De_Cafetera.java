package servicios;

import entidades.Cafetera;
import java.util.Scanner;

public class Funciones_De_Cafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera iniciarCafetera() {
        Cafetera cafeteraCas = new Cafetera();
        cafeteraCas.setCapacidadMaxima(30);//acá determinamos valor máximo
        return cafeteraCas;
    }

    public void llenarCafetera(Cafetera cafeteraCas) {
        cafeteraCas.setCantidadActual(cafeteraCas.getCapacidadMaxima());
        System.out.println(cafeteraCas.getCapacidadMaxima());

    }

    public void servirTaza(Cafetera cafeteraCas) {
        System.out.println("Ingrese el tamaño de la taza");
        int taza = leer.nextInt();
        if (taza > cafeteraCas.getCantidadActual()) {
            System.out.println("No va llenar la taza");
            System.out.println("Seva llenar la cantidadAcual" + cafeteraCas.getCantidadActual());
            cafeteraCas.setCantidadActual(0);

        } else {
            System.out.println("La taza se lleno al maximo");
            cafeteraCas.setCantidadActual(cafeteraCas.getCantidadActual() - taza);
        }

    }

    public void vaciarCafetera(Cafetera cafeteraCas) {
        cafeteraCas.setCantidadActual(0);
        
    }
public void agregarCafe(Cafetera cafeteraCas){
    System.out.println("Ingrese la cantidad");
        int cantidad = leer.nextInt();  
         cafeteraCas.setCantidadActual(cafeteraCas.getCantidadActual()+cantidad);
    
}  

}
