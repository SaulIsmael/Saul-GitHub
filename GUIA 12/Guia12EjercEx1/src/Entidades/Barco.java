package Entidades;
/* Potencia en CV para barcos a motor.*/
public class Barco extends Embarcaciones {
    protected int potenciaCv;

    public Barco(int matricula, int eslora, int anioFabricacion, int potenciaCv) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + this.potenciaCv;
    }
}
