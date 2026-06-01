
public class MetodoConRetorno {
    public int retornaNumero(){
        int num = (int)(Math.random()*100); //int num=200; //metodo estatico, no necesita ssr instanciado en obj para q sus metodos estaticos pueda ser usardos
        return num;   
    }   
    
    public double potencia(){
        return (float)(Math.pow(2, 3));    
    }
    
    public static void main(String[] args) {
        MetodoConRetorno MiRetorno = new MetodoConRetorno(); //instanciar, crear el obj
        System.out.println( MiRetorno.retornaNumero() );
        System.out.println( MiRetorno.potencia() );
    }
}
