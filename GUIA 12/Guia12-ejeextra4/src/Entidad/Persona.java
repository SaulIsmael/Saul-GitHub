/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class Persona {
protected String nombre;
protected String apellidos;
protected String numeroIdentificacion;
protected String estadoCivil;

    public Persona() {
     
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

    public Persona(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

public void cambiarEstadoCivil (String nuevoestadocivil){
this.estadoCivil = nuevoestadocivil;

}
public void imprimirInformacion (){
    System.out.println("nombre " + nombre);
    System.out.println("apellido " + apellidos);
    System.out.println("numero de identificacion " + numeroIdentificacion);
    System.out.println("estado civil " + estadoCivil);

}  

    
    
    
}
