package Entidades;

import java.util.Comparator;

public class Perro2 {

    private String raza;

    public Perro2() {
    }

    public Perro2(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return raza;
    }

    public static Comparator<Perro2> ordenarRaza = new Comparator<Perro2>() {
        @Override
        public int compare(Perro2 t, Perro2 t1) {
            return t.getRaza().compareTo(t1.getRaza());
        }

    };//final comparator

}
