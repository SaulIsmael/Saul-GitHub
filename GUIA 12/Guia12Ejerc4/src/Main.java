import Entidades.Circulo;
import Entidades.Rectangulo;

public class Main {
    public static void main(String[] args){
        Circulo circulo = new Circulo( 100d);
        Rectangulo rectangulo = new Rectangulo(20d, 50d);
        System.out.println("El area del circulo: "+ circulo.calcularArea());
        System.out.println("El area del circulo: "+ circulo.calcularPerimetro());
        System.out.println("El area del rectángulo: "+ rectangulo.calcularArea());
        System.out.println("El area del rectángulo: "+ rectangulo.calcularPerimetro());




    }
}