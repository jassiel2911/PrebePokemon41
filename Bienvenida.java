import java.util.ArrayList;
import java.util.Scanner;

public class Bienvenida{

    String nombrej1;
    Scanner s = new Scanner(System.in);
    String nombrej2;
    int opcion;
    int partida = 1;
    int accion1;
    int accion2;
    int puntajej1 = 0;
    int puntajej2 = 0;

    Pokemon auxj1 = new Pokemon();
    Pokemon auxj2 = new Pokemon();
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    ArrayList<Pokemon> aux1 = new ArrayList<>();
    ArrayList<Pokemon> aux2 = new ArrayList<>();
    ArrayList<Pokemon> listapokemones = new ArrayList<>();

    public void inicio() {
        System.out.println("*******BIENVENIDO A POKEMON*******");

        /*** pedir datos */
        System.out.print("Ingresa el nombre del jugador 1: ");
        nombrej1 = s.nextLine();
        jugador1.setNombre(nombrej1);
        System.out.println("Jugador registrado...");
        System.out.print("\nIngresa el nombre del jugador 2: ");
        nombrej2 = s.nextLine();
        jugador2.setNombre(nombrej2);
        System.out.println("Jugador registrado...");

        Colecciones a = new Colecciones();
        a.listadopokemones();


        /* Modo de Juego */
        System.out.println(
                "\nSi deseas que la eleccion de pokemones sea manual (1) o si deseas que sea de forma aleadoria (2)?");
        opcion = s.nextInt();
        if (opcion == 1) {

            String apodo;
            int i = 1;
            System.out.println(jugador1.getNombre() + " ingresa el apodo de tus pokemones");

            while (i < 6) {
                System.out.println("ingresa el apodo de tu pokemon " + i);
                apodo = s.next();

                for (int j = 0; j < listapokemones.size(); j++) {

                    if (listapokemones.get(j).getApodo().equalsIgnoreCase(apodo)) {
                        aux1.add(listapokemones.get(j));
                    }
                }
                i++;
            }
            /* para jugador 2 */
            String apodo1;
            System.out.println(jugador2.getNombre() + " ingresa el apodo de tus pokemones");
            i = 1;
            while (i < 6) {
                System.out.println("Ingresa el apodo de tu pokemon " + i);
                apodo1 = s.next();

                for (int j = 0; j < listapokemones.size(); j++) {

                    if (listapokemones.get(j).getApodo().equalsIgnoreCase(apodo1)) {
                        aux2.add(listapokemones.get(j));
                    }
                }
                i++;

            }
            jugador1.setPokemones(aux1);
            jugador2.setPokemones(aux2);
        }
    }
}
