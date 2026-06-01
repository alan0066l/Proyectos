
import java.util.Scanner;

public class Results202561112 {
    public static int calificaciones[][] = new int[4][2];
    
    public static void enterQualitifications(){
        Scanner Entrada = new Scanner(System.in);
        for(int alumno=0 ; alumno<calificaciones.length ; alumno++ ){
            System.out.println("Alumno no."+(alumno+1));
         for(int calificacion=0 ; calificacion<calificaciones[0].length ; calificacion++){
             System.out.println("\tEntre la calificación "+(calificacion+1)+": ");
             calificaciones[alumno][calificacion] = Entrada.nextInt();
             
              }
         }
    }
    public static void displayAverages(){
        for(int alumno=0 ; alumno<calificaciones.length ; alumno++ ){
            int suma=0;
            for(int calificacion=0 ; calificacion<calificaciones[0].length ; calificacion++){
                suma += calificaciones[alumno][calificacion];
            }
            int promedio = (int)(suma/calificaciones[0].length);
            System.out.println("Promedio del alumno "+ (alumno+1)+"=" + promedio);
        }
    }
    public static void main(String[] args){
        enterQualitifications();
        displayAverages();
    }
}
