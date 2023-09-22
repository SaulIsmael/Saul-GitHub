package ejercio4_extra;

import Entidades.Circulo;
import Entidades.Rectangulo;

public class Ejercio4_Extra {

    public static void main(String[] args) {

        Circulo cir = new Circulo(34, 56);
        Rectangulo rec = new Rectangulo(5.18, 19);

        System.out.println("---CÍRCULO---");
        System.out.println("");
        cir.area();
        cir.perimetro();
        System.out.println("");
        System.out.println("---RECTÁNGULO---");
        System.out.println("");
        rec.area();
        rec.perimetro();
    }

}
