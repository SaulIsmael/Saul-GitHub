package tienda_2.entades;

public class fabricante {

    private int codigo;
    private String nombre;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public fabricante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;

    }
 @Override
    public String toString() {
        return "fabricante{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
}
