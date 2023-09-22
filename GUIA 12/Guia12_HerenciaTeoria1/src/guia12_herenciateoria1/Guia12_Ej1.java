package guia12_herenciateoria1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;

public class Guia12_Ej1 {

    /**
     * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
     * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad
     * y raza del Animal. Crear un método en la clase Animal a través del cual
     * cada clase hija deberá mostrar luego un mensaje por pantalla informando
     * de que se alimenta. Generar una clase Main que realice lo siguiente:
     */
    public static void main(String[] args) {

        List<Animal> listaAnimales = new ArrayList();

        Animal perro = new Perro("Pepe", "Balanceado", 5, "dogo");
        Animal gato = new Gato("Pejerrey", "12333", 7, "Calle");
        Animal caball = new Caballo("toto", "comida", 11, "po");
        listaAnimales.add(perro);
        listaAnimales.add(gato);
        listaAnimales.add(caball);
        
        for (Animal animal : listaAnimales) {
            animal.alimentarse();
        }
        
        
        
    }

}
