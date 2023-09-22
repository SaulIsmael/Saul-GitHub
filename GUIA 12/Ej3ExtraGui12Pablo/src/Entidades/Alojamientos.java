
package Entidades;


public class Alojamientos {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamientos{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    public void infoAlojamiento(){
        System.out.println("Nombre del alojamiento: "+this.nombre);
        System.out.println("Dirección: "+this.direccion);
        System.out.println("Localidad: "+this.localidad);
        System.out.println("Nombre del Gerente: "+this.gerente);
                
    }  
}
