package persona;


public class Persona {
    public String nombre;
    public String apellido;
    public int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    public static void main(String[] args) {
     Persona per=new Persona();
     Persona p2=new Persona("Cande","Iriart",19);
     
     
     
    }
    
}
