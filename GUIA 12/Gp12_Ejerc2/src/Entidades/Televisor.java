package Entidades;

import java.util.Scanner;

/**
 * Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. 
* Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• 
• 
 *
 * @author iptal
 */
public class Televisor extends Electrodomesticos {
    
    private int pulgadas;
    private boolean TDT;

    public Televisor(int pulgadas, boolean TDT) {
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Televisor(int pulgadas, boolean TDT, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Televisor(int i, double d, String gris, char c, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return super.toString()+"pulgadas"+pulgadas+"sintonizador TDT"+TDT; 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
//Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in);
        System.out.println("----------------Televisor----------------");
        crearElectrodomestico();
        System.out.println("Ingrese la cantidad de pulgadas del Televisor: ");
        this.pulgadas=leer.nextInt();
        System.out.println("El Televisor tiene sintonizador TDT: true/false");
        this.TDT=leer.nextBoolean();
        precioFinal();
    }
   
//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio. 

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (this.pulgadas>40) {
            this.precio+=precio*.30;
                       
        }
        if (this.TDT) {
            this.precio+=500;
            
        }
    }
    
    
    
    
}
