
package Entidades;


public class Hotel5Estrellas extends Hotel4Estrellas {
    private int cantSalones;
    private int canSuites;
    private int canLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantSalones, int canSuites, int canLimosinas, Enumeradores.TipoGym gimnasio, String nombreResto, int capResto, int cantHabitaciones, int nroCamas, int cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreResto, capResto, cantHabitaciones, nroCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.canSuites = canSuites;
        this.canLimosinas = canLimosinas;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCanSuites() {
        return canSuites;
    }

    public void setCanSuites(int canSuites) {
        this.canSuites = canSuites;
    }

    public int getCanLimosinas() {
        return canLimosinas;
    }

    public void setCanLimosinas(int canLimosinas) {
        this.canLimosinas = canLimosinas;
    }

    @Override
    public String toString() {
        return super.toString()+this.cantSalones+this.canSuites+this.canLimosinas; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

    @Override
    public int calculoPrecioHabitacion() {
        return super.calculoPrecioHabitacion() + (canLimosinas * 15);
    }

    @Override
    public void infoAlojamiento() {
        super.infoAlojamiento();
        System.out.println("Cantidad de Salones: "+cantSalones);
        System.out.println("Cantidad de Suites: "+canSuites);
        System.out.println("Cantidad de Limosinas: "+canLimosinas);
        System.out.println(" ");
    }
}
