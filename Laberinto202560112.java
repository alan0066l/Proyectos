import java.awt.Toolkit;
import java.util.*;

public class Laberinto202560112 {

    public static int laberinto[][] = new int[10][10];
    public static boolean win = false;

    public static void main(String[] args) {
        char opc;
        Scanner MiEntrada = new Scanner(System.in);

        llenalaberinto();
        int fila = 0, colu = 0;

        do {
            muestralaberinto();
            opc = MiEntrada.next().charAt(0);

            switch(opc){

                case 's':
                    if((fila+1 < laberinto.length) && laberinto[fila+1][colu] == 0){
                        laberinto[fila][colu] = 0;
                        laberinto[++fila][colu] = 2;
                    } else BeepSinSalida();
                    break;

                case 'w':
                    if((fila-1 >= 0) && laberinto[fila-1][colu] == 0){
                        laberinto[fila][colu] = 0;
                        laberinto[--fila][colu] = 2;
                    } else BeepSinSalida();
                    break;

                case 'a':
                    if((colu-1 >= 0) && laberinto[fila][colu-1] == 0){
                        laberinto[fila][colu] = 0;
                        laberinto[fila][--colu] = 2;
                    } else BeepSinSalida();
                    break;

                case 'd':
                    if((colu+1 < laberinto[0].length) && laberinto[fila][colu+1] == 0){
                        laberinto[fila][colu] = 0;
                        laberinto[fila][++colu] = 2;
                    } else BeepSinSalida();
                    break;

                case '6':
                    bomba(fila, colu);
                    break;
            }

            verificarVictoria();

            try { Thread.sleep(120); } catch(Exception e){}

        } while(opc != '0');

        System.out.println("Juego terminado");
    }

    // 🧼 limpiar pantalla
    public static void limpiapantalla(){
        for(int i=0; i<30; i++) System.out.println();
    }

    // 🧱 laberinto aleatorio
    public static void llenalaberinto(){
        for(int i=0; i<laberinto.length; i++){
            for(int j=0; j<laberinto[0].length; j++){
                laberinto[i][j] = (int)(Math.random()*2);
            }
        }
        laberinto[0][0] = 2;
    }

    // 🎮 mostrar mapa
    public static void muestralaberinto(){
        limpiapantalla();

        for(int i=0; i<laberinto.length; i++){
            for(int j=0; j<laberinto[0].length; j++){

                switch(laberinto[i][j]){

                    case 0:
                        System.out.print("  ");
                        break;

                    case 1:
                        System.out.print("▓");
                        break;

                    case 2:
                        boolean cerca = false;

                        if(i>0 && laberinto[i-1][j]==1) cerca = true;
                        if(i<laberinto.length-1 && laberinto[i+1][j]==1) cerca = true;
                        if(j>0 && laberinto[i][j-1]==1) cerca = true;
                        if(j<laberinto[0].length-1 && laberinto[i][j+1]==1) cerca = true;

                        if(cerca) System.out.print(":O");
                        else System.out.print(":D");
                        break;

                    case 3:
                        System.out.print("*");
                        break;
                }
            }
            System.out.println();
        }
    }

    // 💣 bomba con animación
    public static void bomba(int fila, int colu){

        laberinto[fila][colu] = 3;

        for(int i=0; i<3; i++){
            muestralaberinto();
            try { Thread.sleep(150); } catch(Exception e){}

            laberinto[fila][colu] = 0;
            muestralaberinto();
            try { Thread.sleep(150); } catch(Exception e){}

            laberinto[fila][colu] = 3;
        }

        for(int i=-1; i<=1; i++){
            for(int j=-1; j<=1; j++){
                int nf = fila + i;
                int nc = colu + j;

                if(nf>=0 && nf<laberinto.length && nc>=0 && nc<laberinto[0].length){
                    if(laberinto[nf][nc]==1){
                        laberinto[nf][nc]=0;
                    }
                }
            }
        }

        BeepBomba();
        laberinto[fila][colu] = 0;
    }

    // 🔊 error
    public static void BeepSinSalida(){
        try{
            Toolkit.getDefaultToolkit().beep();
        } catch(Exception e){}
    }

    // 💥 bomba sonido
    public static void BeepBomba(){
        try{
            Toolkit.getDefaultToolkit().beep();
        } catch(Exception e){}
    }

    // 🏁 victoria
    public static void verificarVictoria(){
        boolean muros = false;

        for(int i=0; i<laberinto.length; i++){
            for(int j=0; j<laberinto[0].length; j++){
                if(laberinto[i][j]==1){
                    muros = true;
                }
            }
        }

        if(!muros && !win){
            win = true;
            System.out.println("\n🎉 YOU WIN 🎉");
            System.out.println("Felicidades, terminaste el laberinto");
        }
    }
}