package Intefaces;
/*llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.*/

public interface CalculosFormas {
    public double calcularArea();
    public double calcularPerimetro();
    public final double pi = Math.PI;
}
