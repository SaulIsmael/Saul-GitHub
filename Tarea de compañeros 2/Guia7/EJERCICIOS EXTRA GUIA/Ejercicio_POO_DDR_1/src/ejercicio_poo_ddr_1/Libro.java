
package ejercicio_poo_ddr_1;


public class Libro {
    
   private int ISBN;
   private String titulo;
   private String autor;
   private int numPaginas; 
   
   /*contructores*/

    public Libro(int pISBN,String pTitulo,String pAutor, int pNumPaginas) {
    this.ISBN=pISBN;
  titulo=pTitulo;
  autor=pAutor;
  numPaginas=pNumPaginas;
    }
   
  /*metodos*/

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
 
     
 } 

