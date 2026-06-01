
import java.util.Scanner;
public class Factorial {
    //atributo
    public long number;
    //metodo
    public void calculateFactorial(){
        //1...n
        Scanner MiEntrada = new Scanner(System.in);
        System.out.println("Ingrese el valor entero: ");
        number= MiEntrada.nextLong();
        if ( number>=1 && number<=20 ){
            long res=1;
            for( int i=1; i<=number; i++){
            res *= i;
            }
        System.out.println(res);
    }
        else System.out.println("El entero permitido es entre 1 y 20!");
}
}    