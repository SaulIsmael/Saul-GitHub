package Entidades;
/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
U
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
•
• .*/

public final class Velero extends Embarcaciones  {
    private  int numeroMastiles;

    public Velero(int matricula, int eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + this.numeroMastiles;
    }
}
