/*
 * ADALID ARNEZ TORRICO
 * 
 */
import java.util.Scanner;
public class Multiplicar {
    public static void main(String[] args) {
       
        Scanner teclado= new Scanner(System.in);
        Mult();
    }
    
    
     public static void Mult(){
     Scanner teclado = new Scanner(System.in);
     float num1,num2,multiplica;
     
        System.out.println("Ingrese Primer Número:");
        num1= teclado.nextInt();
        System.out.println("Ingrese Segundo Número:");
        num2= teclado.nextInt();
        multiplica= num1*num2;
        
        System.out.println("La Multiplicacion resultante es:" +multiplica);
}
}
