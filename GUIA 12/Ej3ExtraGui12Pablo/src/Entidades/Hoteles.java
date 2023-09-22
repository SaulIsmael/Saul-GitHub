
package Entidades;


public class Hoteles extends Alojamientos{
    protected int cantHabitaciones;
    protected int nroCamas;
    protected int cantPisos;
    protected Double precioHabitacion;

    public Hoteles() {
    }

    public Hoteles(int cantHabitaciones, int nroCamas, int cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return super.toString() + this.cantHabitaciones + this.cantPisos + this.nroCamas + this.precioHabitacion; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.*/
    public int calculoCapacidadHotel() {

        int capHotel = cantHabitaciones * cantPisos * nroCamas;
        return capHotel;

    }

    @Override
    public void infoAlojamiento() {
        super.infoAlojamiento();
        System.out.println("Cantidad de habitaciones: " + this.cantHabitaciones);
        System.out.println("Cantidad de camas: " + this.nroCamas);
        System.out.println("Cantidad de pisos: " + this.cantPisos);
        System.out.println("Precio por habitación: " + precioHabitacion);

    }
}
