
public class Operandos {
    public static void main(String[] args) {
        int n1 = 2+2;
        long n2 = 2-2;
        float n3 = 2*2;
        double n4 = 2/2;
        n1 = (int)(n3)%3; //ESTO ES UN CASTEO, SE OBLIGA A QUE SE EJECUTE
        
        n2++; //1
        n2--; //0
        
        //n2 += 1; // == n2++, el += INCREMENTA LO QUE SE TIENE A LA DERECHA
        n2 = n1+ (int) (n3); //0 castin
        System.out.println( n1 ); //System.out.println( n1 );
        System.out.println( ++n2 ); //++n2 es 1, //n2 es 0
        System.out.println( n3 );
        System.out.println( n4 );
        System.out.println( 2%2 );
    }
}
