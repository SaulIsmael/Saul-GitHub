package Entidades;
/*Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.*/
public class Alquiler {
    private String nombreCliente;
    private int documento;
    private int fechaInicio;
    private int fechaDev;
    private int posicionAmarre;
    private Embarcaciones embarcacion;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int documento, int fechaInicio, int fechaDev, int posicionAmarre) {
        this.nombreCliente = nombreCliente;
        this.documento = documento;
        this.fechaInicio = fechaInicio;
        this.fechaDev = fechaDev;
        this.posicionAmarre = posicionAmarre;
        this.embarcacion = embarcacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(int fechaDev) {
        this.fechaDev = fechaDev;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Embarcaciones getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Embarcaciones embarcacion) {
        this.embarcacion = embarcacion;
    }
    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).*/

    public double calcularAlquiler (){
        int dias = fechaDev - fechaInicio;
        double mod = embarcacion.calcularModulo();
        return dias * mod;



    }


}


