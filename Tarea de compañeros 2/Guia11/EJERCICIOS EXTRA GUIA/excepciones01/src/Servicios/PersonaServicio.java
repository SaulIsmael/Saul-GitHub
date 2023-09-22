package Servicios;

import Entidades.Persona;
import java.util.Scanner;


public class PersonaServicio {
     Persona per=new Persona();
    
    
    public int size(){
        System.out.println("hola");
        return 6;
    
    }
    
    public int mostrarcar(PersonaServicio size){
        System.out.println(size.size());
        return 0;
    
    }
    
    public Persona crearPersona (){
                Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Nombre: ");
        per.setNombre(leer.nextLine());
        System.out.print("Edad: ");
        per.setEdad(leer.nextInt());
        
       
        boolean val = false;
        
        while (val==false) {
             System.out.print("Sexo (H-M-X): ");
     String sex=leer.next();
     
        if (!sex.equalsIgnoreCase("m")&&!sex.equalsIgnoreCase("h")&&!sex.equalsIgnoreCase("x")&&!sex.equalsIgnoreCase("M")&&!sex.equalsIgnoreCase("H")&&!sex.equalsIgnoreCase("X") ) {
           
                System.out.println("Dato inválido, intente de nuevo");
                        
                       
        }else {
        val=true;
        per.setSexo(sex);
        }
        }
//        while(val == false) {
//			System.out.print("» Ingrese sexo [M → Masculino | F → Femenino]: ");
//			String sexo = read.next();
//			if(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
//                                System.out.println();
//				System.out.println("Error: el sexo ingresado no es válido.");
//				System.out.println("Presione intro para seguir...");
//				read.next();
//			} else {
//				val = true;
//                                p.setSexo(sexo);
//			}
//		}
        System.out.print("Altura (m.): ");
        per.setAltura(leer.nextDouble());
        System.out.print("Peso (kg.): ");
        per.setPeso(leer.nextDouble());
        
        return per;

    }
    
    
    
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    
    public int calcularIMC (Persona per){
        int pesoIdeal=0;
    double imc= per.getPeso()/Math.pow(per.getAltura(),2);
        System.out.println("IMC: "+imc);
        if (imc<20) {
            System.out.println("Peso inferior al ideal");
            pesoIdeal=-1;
        }else {
            if (imc>=20&&imc<=25) {
                System.out.println("Peso ideal");
                   pesoIdeal=0;
            }else{
                if (imc>25) {
                    System.out.println("Peso superior al ideal");
                    pesoIdeal=1;
                }
            }
        
        }
        return pesoIdeal;
        
        
    }
    
    public boolean esMayorDeEdad(Persona per){
        boolean mayorEdad = false;
        if (per.getEdad()>=18) {
            mayorEdad=true;
            System.out.println("La persona es mayor de edad");
        }else{
            System.out.println("La persona es menor de edad");
        }
        
        
        return mayorEdad;
    
    }
    
    
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//un booleano.
}