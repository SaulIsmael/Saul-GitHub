/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int pagina;

    public Libro(int isbn, String titulo, String autor, int pagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
    }

    public Libro() {
    }

    public void cargarlibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese datos isbn");
        isbn = leer.nextInt();
        System.out.println("ingrese titulos");
        titulo = leer.next();
        System.out.println("ingrese autor");
        autor = leer.next();
        System.out.println("ingrese pagina");
        pagina = leer.nextInt();

    }

    public void mostrarLibro() {
        System.out.println("isbn es:" + isbn);
        System.out.println("titulo es:" + titulo);
        System.out.println("autor es:" + autor);
        System.out.println("pagina es:" + pagina);

    }

    public void cargararlibro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
