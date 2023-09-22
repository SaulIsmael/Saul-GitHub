
package Entidades;

import Enumeradores.TipoGym;
import static Enumeradores.TipoGym.A;


public class Hotel4Estrellas extends Hoteles {
    protected TipoGym gimnasio;
    protected String nombreResto;
    protected int capResto;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(TipoGym gimnasio, String nombreResto, int capResto, int cantHabitaciones, int nroCamas, int cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capResto = capResto;
    }

    public TipoGym getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(TipoGym gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapResto() {
        return capResto;
    }

    public void setCapResto(int capResto) {
        this.capResto = capResto;
    }

    @Override
    public String toString() {
        return super.toString() + this.gimnasio + this.nombreResto + this.capResto; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
    public int calculoPrecioHabitacion() {

        int precioHabitacion = 50 + calculoCapacidadHotel();
        //Valor agregado por Restaurante

        if (capResto < 30) {
            precioHabitacion += 10;
        }
        if (capResto >= 31 && capResto < 50) {
            precioHabitacion += 30;

        }
        if (capResto > 50) {
            precioHabitacion += 50;
        }

        //Valor agregado por Tipo de Gimnasio
        if (gimnasio.equals(A)) {
            precioHabitacion += 50;
        } else {
            precioHabitacion += 30;
        }
        return precioHabitacion;

    }

    @Override
    public void infoAlojamiento() {
        super.infoAlojamiento();
        System.out.println("Tipo de gimnasio: " + gimnasio);
        System.out.println("Nombre Restaurante: " + nombreResto);
        System.out.println("Capacidad Restaurante: " + capResto);
        System.out.println(" ");

    }
}
