public class Juego {
    public static void main(String[] args){

        Personaje Player1 = new Personaje("Alan", 1, 100, 45);
        Personaje Player2 = new Personaje("Adela", 1, 100, 20);

        System.out.println("*** Personajes Iniciales ***");

        System.out.println(Player1.getNombre() + " - Nivel: " + Player1.getNivel() +
                " Vida: " + Player1.getVida() + " Ataque: " + Player1.getAtaque());

        System.out.println(Player2.getNombre() + " - Nivel: " + Player2.getNivel() +
                " Vida: " + Player2.getVida() + " Ataque: " + Player2.getAtaque());

        System.out.println("*** Actualizaciones ***");

        Player1.setNivel(2);
        Player1.setVida(148);
        Player2.setVida(40);
        Player2.setNivel(25);

        System.out.println(Player1.getNombre() + " - Nivel: " + Player1.getNivel() +
                " Vida: " + Player1.getVida() + " Ataque: " + Player1.getAtaque());

        System.out.println(Player2.getNombre() + " - Nivel: " + Player2.getNivel() +
                " Vida: " + Player2.getVida() + " Ataque: " + Player2.getAtaque());
    }
}