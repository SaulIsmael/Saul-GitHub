package ejercicio_poo_drr_7;

import java.util.Scanner;

public class Ejercicio_POO_DRR_7 {
  public static double calcularIMC(double peso, double estatura) {
        return peso / Math.pow(estatura, 2);
    }

    public static String nivelDePeso(double IMC) {
        if (IMC < 18.5)
            return "Bajo Peso";
        else if (IMC >= 18.5 && IMC <= 24.0)
            return "Normal";
        else if (IMC >= 25 && IMC <= 24.0) {
            return "Sobrepeso"; 
//4        
        
            
        } else if (IMC >= 30 && IMC <= 34.0) {
            return "Sobrepeso I";
        } else if (IMC >= 35 && IMC <= 39.0) {
            return "Sobrepeso II";
        } else if (IMC >= 40 && IMC <= 49.0) {
            return "sobrepeso III";    
         }else {
            return "Sobrepeso IV";
        }
   }
        
public static void main(String[] args) {
 Scanner  lector  = new Scanner(System.in);

    double peso, estatura; 
        System.out.println("Ingrese su pesoc(Km)");
        peso=lector.nextDouble();
        System.out.println("Ingrese su estatura(m)");
        estatura=lector.nextDouble();
        
        System.out.println("Su nivel de peso es:  " + nivelDePeso(calcularIMC(peso, estatura)));
    
    }
     
}
