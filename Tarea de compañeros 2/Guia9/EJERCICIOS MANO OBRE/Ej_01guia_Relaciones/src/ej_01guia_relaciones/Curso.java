package ej_01guia_relaciones;

class Profesor {

    private String Nombre;
    private String Apellido;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + Nombre + ", apellido=" + Apellido + '}';
    }

}

public class Curso {

    private int año;
    private char division;
    private Profesor profesor;

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        this.profesor = p;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Curso{" + "a\u00f1o=" + año + ", division=" + division + ", profesor=" + profesor + '}';
    }

}
