package ej_01guia_relaciones;

public class Ej_01guia_Relaciones {

    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        profesor.setNombre("Agustin");
        profesor.setApellido("Lima");
        Curso curso = new Curso();
        curso.setProfesor(profesor);//Seteamos un profesor del curso
    }
}
