package ejercio1_extra;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Ejercio1_Extra {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Oziko", "perro", "huesos", 8, "mestizo");
        perro1.alimentar();

        Animal perro2 = new Perro("Negra", "perra", "alimento balanceado", 4, "mestiza");
        perro1.alimentar();

        Animal gato1 = new Gato("Suri", "gata", "pescado", 1, "manchada");
        gato1.alimentar();

        Animal caballo1 = new Caballo("Tornado", "caballo", "zanahorias", 10, "poderoso");
        caballo1.alimentar();

    }

}
