import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner MiEntrada = new Scanner( System.in );  
        System.out.print("Ingrese un entero: ");
        int num = MiEntrada.nextInt();
        if ( num%2==0 ) System.out.println("Es un número par");
        else System.out.println("Es un número impar");    
    }   
}
