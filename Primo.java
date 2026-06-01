
import java.util.Scanner;
public class Primo {
    //n primos, son divisibles entre si mismo,entre dos numeros (del 1 al n de si mosmo) y por si mismo 
    public long number; //atributo
    public void calculatePrimo(){ //metodo
        Scanner MiEntrada = new Scanner( System.in ); //7entrada de dato
        System.out.print("Ingrese un entero: ");
        number = MiEntrada.nextLong();
        //
        int c = 0;
        for ( int i=1; i<=number; i++ ){
            if ( number%i==0 ) c++;
        }
        if(c==2) System.out.println("Es primo");
        else System.out.println("No es primo");
    }

}


/*number = 4
    i= 1, 2, 3, 4
    number es divisible por i
       si el modulo es cero
*/