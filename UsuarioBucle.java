import java.util.Scanner;
public class UsuarioBucle {
    public static void main(String[] args) {
        Scanner MiEntrada = new Scanner(System.in); //instanciar obj de cualquier tipo de dato
        
       /*
        System.out.print("Entrada de un texto: ");
        String texto = MiEntrada.nextLine();
        System.out.println(texto);
        */
        
       System.out.print("Entrada de un numero inicial: ");
        int num = MiEntrada.nextInt();
        //System.out.println(num);
        
        System.out.print("Entrada de un numero final: ");
        int fin = MiEntrada.nextInt();
        
        for( int i=num; i<=fin; i++)
            System.out.println(i);
    }
    
}
