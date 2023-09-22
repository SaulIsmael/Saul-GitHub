
package Entidades;


public class AlojamientoExtraHotelero extends Alojamientos{
    protected double superficie;
    protected Enumeradores.TipoDeAcceso tipo;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(double superficie, Enumeradores.TipoDeAcceso tipo, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.superficie = superficie;
        this.tipo = tipo;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public Enumeradores.TipoDeAcceso getTipo() {
        return tipo;
    }

    public void setTipo(Enumeradores.TipoDeAcceso tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "AlojExtraHotel{" + "superficie=" + superficie + ", tipo=" + tipo + '}';
    }

    @Override
    public void infoAlojamiento() {
        super.infoAlojamiento();
        System.out.println("Superficie: ");
        System.out.println("Tipo de Acceso "+tipo);
        
    }
}
