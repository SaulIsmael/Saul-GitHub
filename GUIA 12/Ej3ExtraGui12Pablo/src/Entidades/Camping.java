
package Entidades;


public class Camping extends AlojamientoExtraHotelero {
    private int cantCarpas;
    private int cantBanios;
    private Boolean restaurante;

    public Camping() {
    }

    public Camping(int cantCarpas, int cantBanios, Boolean restaurante, double superficie, Enumeradores.TipoDeAcceso tipo, String nombre, String direccion, String localidad, String gerente) {
        super(superficie, tipo, nombre, direccion, localidad, gerente);
        this.cantCarpas = cantCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantCarpas=" + cantCarpas + ", cantBanios=" + cantBanios + ", restaurante=" + restaurante + '}';
    }

    @Override
    public void infoAlojamiento() {
        super.infoAlojamiento();
        System.out.println("Cantidad de carpas: "+cantCarpas);
        System.out.println("Cantidad de baños: "+cantBanios);
        if (restaurante) {
         System.out.println("Tiene Restaurante.");   
        }else{
            System.out.println("No tiene restaurante.");
        }
        
    }
}
