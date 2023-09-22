package tienda_2.entades;

public class producto {

    private int codigo;
    private String nombre;
    private double Precio;
    private int codigo_fabricante;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
   public double getPresio() {
        return Precio;
    }

    public int getCodigo_fabricante() {
        return codigo_fabricante;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPresio(double Presio) {
        this.Precio = Precio;
    }

    public void setCodigo_fabricante(int codigo_fabricante) {
        this.codigo_fabricante = codigo_fabricante;
    }

    public producto(int codigo, String nombre, double Precio, int codigo_fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Precio = Precio;
        this.codigo_fabricante = codigo_fabricante;
    }
 @Override
    public String toString() {
        return "producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + Precio + ", codigo_fabricante=" + codigo_fabricante + '}';
    }
}
