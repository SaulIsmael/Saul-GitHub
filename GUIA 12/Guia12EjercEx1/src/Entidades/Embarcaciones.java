package Entidades;
/*n Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.*/

public class Embarcaciones {
    protected int matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Embarcaciones() {
    }

    public Embarcaciones(int matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public double calcularModulo(){
        return eslora*10;

    }
}
