package Entidades;

public class DNI {

    private int numero;
    private String serie;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "DNI{" + "numero=" + numero + ", serie=" + serie + '}';
    }
}
