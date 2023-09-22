package Entidades;

import java.util.List;

public class Baraja {
    private List<Carta> baraja;

    public Baraja() {
    }

    public Baraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    public List<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
    
}