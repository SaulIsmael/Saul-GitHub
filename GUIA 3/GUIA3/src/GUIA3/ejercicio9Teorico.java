package GUIA3;
//Escriba un programa que lea 20 números. Si el número leído es igual a cero se
//debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
import java.util.Scanner;
//programa deberá calcular y mostrar el resultado de la suma de los números
//leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
//de la sentencia break.
/**
 *
 * @author Saul Ismael Mansilla
 */
public class ejercicio9Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       int cont=1;
       int suma=0;
       do{
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un número");
       num=leer.nextInt();
       cont=cont+1;
       if(num>0){
           suma=suma+num;
       }
       if(num==0){
       System.out.println("Se ha capturado un 0 y la suma de los números positivos hasta aquí es "+suma);
       break;
       }
           
       }while (cont<=20);
        System.out.println(" la suma de los numero es "+suma);   
       
    }
    }
