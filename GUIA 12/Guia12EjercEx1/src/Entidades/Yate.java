package Entidades;
/*Potencia en CV y número de camarotes para yates de lujo*/
public final class Yate extends Barco {
    private int numeroDeCamarotes;

    public Yate(int matricula, int eslora, int anioFabricacion, int potenciaCv, int numeroDeCamarotes) {
        super(matricula, eslora, anioFabricacion, potenciaCv);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public int getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + this.numeroDeCamarotes;
        
    }
}
