package Entidades;

public class Circulo implements CalculosFormas {

    double radio;
    double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public void area() {

        double area = PI * Math.pow(radio, 2);
        System.out.println("ÁREA: " + area);

    }

    @Override
    public void perimetro() {

        double perimetro = PI * diametro;
        System.out.println("PERÍMETRO: " + perimetro);

    }

}
