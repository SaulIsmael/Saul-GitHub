package ej_02guia_relaciones;

import java.util.List;

public class Curso {

    private int año;
    private char division;
    private List<Alumno> alumnos;

    
    public void setAño(int año) {
        this.año = año;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int getAño() {
        return año;
    }

    public char getDivision() {
        return division;
    }
    
    public List<Alumno> getAlumnos(){
        return alumnos;
    }
    public void aetAlumno(List<Alumno> alumnos){
     this.alumnos = alumnos;   
    }
}
