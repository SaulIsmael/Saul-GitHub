
package Entidades;


public class Residencia extends AlojamientoExtraHotelero{
    private int cantHabitacionesR;
    private Boolean descuentoGremio;
    private Boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitacionesR, Boolean descuentoGremio, Boolean campoDeportivo, double superficie, Enumeradores.TipoDeAcceso tipo, String nombre, String direccion, String localidad, String gerente) {
        super(superficie, tipo, nombre, direccion, localidad, gerente);
        this.cantHabitacionesR = cantHabitacionesR;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitacionesR() {
        return cantHabitacionesR;
    }

    public void setCantHabitacionesR(int cantHabitacionesR) {
        this.cantHabitacionesR = cantHabitacionesR;
    }

    public Boolean getDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(Boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHabitacionesR=" + cantHabitacionesR + ", descuentoGremio=" + descuentoGremio + ", campoDeportivo=" + campoDeportivo + '}';
    }

    @Override
    public void infoAlojamiento() {
        super.infoAlojamiento();
        System.out.println("Cantidad de habitaciones: "+cantHabitacionesR);
        if (descuentoGremio) {
            System.out.println("Tiene descuento por gremio.");
            
        }else{
        System.out.println("No tiene descuentos.");
        }
        if (campoDeportivo){
            System.out.println("Tiene campo deportivo.");
        }else{
            System.out.println("No tiene campo deportivo.");
        }
    }
}
