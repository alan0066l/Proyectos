import java.util.Scanner;

public class Ascii202560112 {
    // Atributos
    public int enterOpt202560112;
    public int initial202560112;
    public int finish202560112;
    // Método 1
    public void displayMenu() {
        System.out.println("1) Un carácter");
        System.out.println("2) Un rango");
        System.out.print("Entrada de su elección: ");
    }
    // Método 2
    public void enterData() {
        Scanner input = new Scanner(System.in);
        enterOpt202560112 = input.nextInt();
        if (enterOpt202560112 == 1) {
            System.out.print("Entrada del valor a mostrar en ASCII: ");
            initial202560112 = input.nextInt();

        } else if (enterOpt202560112 == 2) {
            System.out.print("Entrada del valor ASCII inicial: ");
            initial202560112 = input.nextInt();
            System.out.print("Entrada del valor ASCII final: ");
            finish202560112 = input.nextInt();

        } else {
            System.out.println("Opción inválida.");
        }
    }

    // Método 3
    public void displayCharacter() {
        if (enterOpt202560112 == 1) {
            System.out.println("El carácter de " + initial202560112 +
                               " es " + (char) initial202560112);
        } else if (enterOpt202560112 == 2) {
            for (int i = initial202560112; i <= finish202560112; i++) {
                System.out.println("El carácter de " + i + " es " + (char) i);
            }
        }
    }
}