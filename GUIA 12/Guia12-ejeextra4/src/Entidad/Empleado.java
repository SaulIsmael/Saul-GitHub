/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class Empleado extends Persona{
private int anoDeIncorporacion;
private int numDespacho;

    public Empleado(int anoDeIncorporacion, int numDespacho, String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.anoDeIncorporacion = anoDeIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnoDeIncorporacion() {
        return anoDeIncorporacion;
    }

    public void setAnoDeIncorporacion(int anoDeIncorporacion) {
        this.anoDeIncorporacion = anoDeIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
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

    public void reasignardespacho (int nuevodespacho){
    this.numDespacho = nuevodespacho;
       
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion(); 
        System.out.println("año de incorporacion " + anoDeIncorporacion);
        System.out.println("numero de despacho " + numDespacho);
        
    }
   
      


}
