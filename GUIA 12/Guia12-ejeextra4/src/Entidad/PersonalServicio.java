/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class PersonalServicio extends Empleado{
private String seccion;

    public PersonalServicio(int anoDeIncorporacion, int numDespacho, String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        super(anoDeIncorporacion, numDespacho, nombre, apellidos, numeroIdentificacion, estadoCivil);
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    
    
    
public void cambiarseccion(String nuevaseccion) {
this.seccion = nuevaseccion;

}

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("seccion " + seccion);


    }
    
    
    
    
}
