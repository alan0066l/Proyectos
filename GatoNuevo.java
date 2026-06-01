import java.util.Scanner;


public class Gato202560112 {
    public static char gato[][] = new char[3][3];
    
    public static void main(String[] args){
        Scanner MiEntrada = new Scanner(System.in);
        System.out.println("1.- Jugar con X");
        System.out.println("2.- Jugar con O");
        System.out.print("Elige una opcion: ");

        int op = MiEntrada.nextInt();
        
        boolean attempt = false;
        initCat();
        if(op == 2){  
            do{
                if (!attempt){
                    compuPlay();        
                    attempt = findWinner();
                }
                if (!attempt){
                    gamerPlay();        
                    attempt = findWinner();
                }
            }while( !attempt );
        }else{
            do{
                if (!attempt){
                    compuPlay1();        
                    attempt = findWinner();
                }
                if (!attempt){
                    
                    gamerPlayX();
                    attempt = findWinner();
                }
            }while( !attempt );
        
        }
    }       
    
    public static void initCat(){
        for(int i=0; i<gato.length; i++){
            for( int j=0; j<gato[0].length; j++ ){
                gato[i][j] = ' ';
            }
        }
        drawCat();
    }

    public static void drawCat(){
        for(int i=0; i<30; i++)
            System.out.println("");
        for(int i=0; i<gato.length; i++){
            System.out.println(" "+gato[i][0]+" | "+gato[i][1]+" | "+gato[i][2]);
            if (i<2) System.out.println("---+---+---");
        }
    }

    public static void compuPlay(){
        int fila, colu;
        do{
            fila = (int)(Math.random()*10%3);
            colu = (int)(Math.random()*10%3);
        }while( gato[fila][colu]!=' ' );
        gato[fila][colu] = 'X';
        drawCat();
    }
    
    public static void compuPlay1(){
        int fila, colu;
        do{
            fila = (int)(Math.random()*10%3);
            colu = (int)(Math.random()*10%3);
        }while( gato[fila][colu]!=' ' );
        gato[fila][colu] = 'O';
        drawCat();
    }

    public static void gamerPlay(){
        Scanner Entrada = new Scanner(System.in);
        int fila, colu;
        do{
            System.out.print("Dame la fila de tu jugada (1-3): ");
            fila = Entrada.nextInt();
            System.out.print("Dame la columna de tu jugada (1-3): ");
            colu = Entrada.nextInt();
        }while( gato[--fila][--colu]!=' ' );
        gato[fila][colu] = 'O';
        drawCat();
    }
    
    public static void gamerPlayX(){ 
        Scanner Entrada = new Scanner(System.in);
        int fila, colu;
        do{
            System.out.print("Dame la fila de tu jugada (1-3): ");
            fila = Entrada.nextInt();
            System.out.print("Dame la columna de tu jugada (1-3): ");
            colu = Entrada.nextInt();
        }while( gato[--fila][--colu]!=' ' );
        gato[fila][colu] = 'X';
        drawCat();
    }

    public static boolean findWinner(){
        boolean winner = false;
        boolean tie = false;
        int cuenta=0;
        for( int i=0; i<3; i++){
            for( int j=0; j<3; j++){
                if ( gato[i][j]==' ' ) 
                    cuenta++;
            }
        }
        // busca ganador por filas
        for(int fila=0; fila<3; fila++){
            if( gato[fila][0]!=' ' && gato[fila][0]==gato[fila][1] && gato[fila][0]==gato[fila][2] ){
                if( gato[fila][0]=='X') System.out.println("You lose!");
                else System.out.println("You win!");
                winner = true;
                break;
            }
        }
        // busca ganador por columna
        for(int colu=0; colu<3; colu++){
            if( gato[0][colu]!=' ' && gato[0][colu]==gato[1][colu] && gato[0][colu]==gato[2][colu] ){
                if( gato[0][colu]=='X') System.out.println("You lose!");
                else System.out.println("You win!");
                winner = true;
                break;
            }
        }
        // busca ganador por diagonal
        if( gato[0][0]!=' ' && gato[0][0]==gato[1][1] && gato[0][0]==gato[2][2] ){
           if( gato[0][0]=='X') System.out.println("You lose!");
           else System.out.println("You win!");
           winner = true;
        }
        
        if( gato[2][0]!=' ' && gato[2][0]==gato[1][1] && gato[2][0]==gato[0][2] ){
           if( gato[2][0]=='X') System.out.println("You lose!");
           else System.out.println("You win!");
           winner = true;
        }
        if (winner)
            return true;
        else
            if ( tie )
                return true;
            else return false;
    }
}