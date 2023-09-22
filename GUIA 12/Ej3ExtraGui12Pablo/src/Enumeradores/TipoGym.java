
package Enumeradores;


public enum TipoGym {
    A("A"),B("B");
   private String codigo;

    private TipoGym(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
