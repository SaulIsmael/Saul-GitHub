package ejercicio_poo_drr_5;
import java.util.Scanner;
public class Ejercicio_POO_DRR_5 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        
        String nombre;
        double saldo;
        
        System.out.println("Ingres el nombre del cliente");
        nombre= Sc.nextLine();
        
        System.out.println("Ingrese saldo de cuenta");
        saldo=Sc.nextDouble();
        
        System.out.println("El cliente"+ nombre +" Tiene un saldo de "+ saldo +" pesos ");
        
        double retiro,deposito;
        
        System.out.println("Ingrese el monto que desea depositar");
        deposito=Sc.nextDouble();
        
         double t= saldo + deposito;
         
        System.out.println("El cliente"+ nombre +"tiene nuevo saldo de "+ t +" peso ");
        
        System.out.println("Ingrese el monto a retirar");
        retiro=Sc.nextDouble();
        
        double r= t-retiro;
        
        System.out.println("El cliente" + nombre + "tiene un nuevo saldo" + r +" peso ");
    }
    
}
