import java.util.ArrayList;
import java.util.Scanner;

public class Batalla {
    public void pelea() {

        String nombrej1;
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
        Scanner s = new Scanner(System.in);
        ArrayList<Pokemon> aux1 = new ArrayList<>();
        ArrayList<Pokemon> aux2 = new ArrayList<>();

        /**************************************************** */
        ArrayList<Pokemon> listapokemones = new ArrayList<>();

        Pocion pociones = new Pocion();

        Pokemon pokemon1 = new Pokemon("Pikachu", 250, 160, 180, 170, "OK", "Electrico", pociones);
        Pokemon pokemon2 = new Pokemon("Raikou", 173, 200, 160, 156, "OK", "Electrico", pociones);
        Pokemon pokemon3 = new Pokemon("Manectric", 250, 176, 180, 150, "OK", "Electrico", pociones);
        Pokemon pokemon4 = new Pokemon("Luxray", 240, 185, 180, 105, "OK", "Electrico", pociones);
        Pokemon pokemon5 = new Pokemon("Magnezone", 160, 183, 180, 107, "OK", "Electrico", pociones);

        // Fuego
        Pokemon pokemon6 = new Pokemon("Charmander", 248, 160, 180, 116, "OK", "Fuego", pociones);
        Pokemon pokemon7 = new Pokemon("Vilpix", 150, 200, 160, 150, "OK", "Fuego", pociones);
        Pokemon pokemon8 = new Pokemon("Entei", 157, 160, 152, 195, "OK", "Fuego", pociones);
        Pokemon pokemon9 = new Pokemon("Victini", 250, 189, 184, 178, "OK", "Fuego", pociones);
        Pokemon pokemon10 = new Pokemon("Torchic", 185, 200, 180, 185, "OK", "Fuego", pociones);

        // Hierba
        Pokemon pokemon11 = new Pokemon("Bulbasaur", 250, 160, 180, 150, "OK", "Hierba", pociones);
        Pokemon pokemon12 = new Pokemon("Oddish", 159, 200, 160, 149, "OK", "Hierba", pociones);
        Pokemon pokemon13 = new Pokemon("Serperior", 179, 170, 195, 150, "OK", "Hierba", pociones);
        Pokemon pokemon14 = new Pokemon("Chikorita", 238, 149, 162, 136, "OK", "Hierba", pociones);
        Pokemon pokemon15 = new Pokemon("Ludicolo", 154, 160, 184, 103, "OK", "Hierba", pociones);

        // Agua
        Pokemon pokemon16 = new Pokemon("Psyduck", 250, 160, 179, 150, "OK", "Agua", pociones);
        Pokemon pokemon17 = new Pokemon("Gyarados", 158, 240, 168, 148, "OK", "Agua", pociones);
        Pokemon pokemon18 = new Pokemon("Vaporeon", 159, 158, 165, 187, "OK", "Agua", pociones);
        Pokemon pokemon19 = new Pokemon("Suicune", 243, 181, 173, 185, "OK", "Agua", pociones);
        Pokemon pokemon20 = new Pokemon("Milotic", 172, 160, 189, 179, "OK", "Agua", pociones);

        // llenando arreglo
        listapokemones.add(pokemon1);
        listapokemones.add(pokemon2);
        listapokemones.add(pokemon3);
        listapokemones.add(pokemon4);
        listapokemones.add(pokemon5);
        listapokemones.add(pokemon6);
        listapokemones.add(pokemon7);
        listapokemones.add(pokemon8);
        listapokemones.add(pokemon9);
        listapokemones.add(pokemon10);
        listapokemones.add(pokemon11);
        listapokemones.add(pokemon12);
        listapokemones.add(pokemon13);
        listapokemones.add(pokemon14);
        listapokemones.add(pokemon15);
        listapokemones.add(pokemon16);
        listapokemones.add(pokemon17);
        listapokemones.add(pokemon18);
        listapokemones.add(pokemon19);
        listapokemones.add(pokemon20);

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

        System.out.println("\nEstos son los pokemones que puden estar en batalla");

        for (int i = 0; i < listapokemones.size(); i++) {
            System.out.println(
                    (i + 1) + "....." + listapokemones.get(i).getApodo() + "     tipo: " + listapokemones.get(i).tipo); 
        }

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
        System.out.println("\n\n");
        // "limpiar pantalla"
        for (int i = 0; i < 50; i++)
            System.out.println();
        System.out.println("INICIAMOS");
        System.out.println(jugador1.getNombre() + " es hora de elegir a tu pokemon para la primer batalla");
        System.out.println("Cual es tu mejor Guerrero?");
        auxj1 = jugador1.elegirPokemon();
        System.out.println("\n\n");

        // "Limpiar pantalla"
        for (int i = 0; i < 50; i++)
            System.out.println();

        System.out.println(jugador2.getNombre() + " es hora de elegir a tu pokemon para la primer batalla");
        System.out.println("Cual es tu mejor Guerrero?");
        auxj2 = jugador2.elegirPokemon();
        System.out.println("\n\n");

        while (partida < 7) {

            System.out.println("Batalla " + partida);
            if (auxj1.getVelocidad() < auxj2.getVelocidad()) {
                System.out.println(jugador2.getNombre() + ", " + auxj2.getApodo() + " tiene la Velocidad para atacar");
                System.out.println("Que accion vas a realizar");
                System.out.println("1...Atacar.");
                System.out.println("2...Usar pocion.");
                System.out.println("3...Camabiar pokemon.");
                accion2 = s.nextInt();
                switch (accion2) {

                    case 1:
                        if (partida == 1) {
                            System.out.println("\n\n");
                            auxj2.ataque1(auxj1);
                            auxj2.calculadorElemental(auxj1);
                        } else {
                            System.out.println("\n\n");
                            auxj2.ataque2(auxj1);
                            auxj2.calculadorElemental(auxj1);
                        }
                        break;

                    case 2:
                        int banVida = 0;
                        int banAtaque = 0;
                        int banDefensa = 0;
                        String usarpocion;
                        System.out.println("\n\n");
                        System.out.println("Pocion-> 'vida'");
                        System.out.println("Pocion-> 'ataque'");
                        System.out.println("Pocion-> 'defensa'");
                        usarpocion = s.next();
                        if (usarpocion.equals("vida")) {
                            if (banVida == 0) {
                               
                                auxj2.recibePuntosvida();
                                banVida = 1;
                            } else {
                                
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion.equals("ataque")) {
                            if (banAtaque == 0) {
                                auxj2.recibePuntosAtaque();
                                banAtaque = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion.equals("defensa")) {
                            if (banDefensa == 0) {
                                auxj2.recibePuntosDefensa();
                                banDefensa = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        }

                        break;

                    case 3:
                        banVida = 0;
                        banAtaque = 0;
                        banDefensa = 0;
                        System.out.println("\n\n");
                        Pokemon cambio = new Pokemon();
                        cambio = auxj2;
                        auxj2 = jugador2.guardarPokemon(cambio);
                        break;
                    /**************** */
                }
                System.out.println("\n\n");
                System.out.println(jugador1.getNombre() + ", es tu turno de atacar con  " + auxj1.getApodo());
                System.out.println("Que accion vas a realizar");
                System.out.println("1...Atacar");
                System.out.println("2...Usar pocion");
                System.out.println("3...Cambiar pokemon");
                accion1 = s.nextInt();
                switch (accion1) {

                    case 1:
                        if (partida == 1) {
                            System.out.println("\n\n");
                            auxj1.ataque1(auxj2);
                            auxj1.calculadorElemental(auxj2);
                        } else {
                            auxj1.ataque2(auxj2);
                            System.out.println("\n\n");
                            auxj1.calculadorElemental(auxj2);
                        }
                        break;

                    case 2:
                        int banVida1 = 0;
                        int banAtaque1 = 0;
                        int banDefensa1 = 0;
                        String usarpocion1;
                        System.out.println("Pocion-> 'vida'");
                        System.out.println("Pocion-> 'ataque'");
                        System.out.println("Pocion-> 'defensa'");
                        usarpocion1 = s.next();
                        if (usarpocion1.equals("vida")) {
                            if (banVida1 == 0) {
                                System.out.println("\n\n");
                                auxj1.recibePuntosvida();
                                banVida1 = 1;
                            } else {
                                System.out.println("\n\n");
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion1.equals("ataque")) {
                            if (banAtaque1 == 0) {
                                System.out.println("\n\n");
                                auxj1.recibePuntosAtaque();
                                banAtaque1 = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else {
                            if (banDefensa1 == 0) {
                                auxj1.recibePuntosDefensa();
                                banDefensa1 = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        }

                        break;

                    case 3:
                        banVida1 = 0;
                        banAtaque1 = 0;
                        banDefensa1 = 0;
                        Pokemon cambio1 = new Pokemon();
                        cambio1 = auxj1;
                        auxj1 = jugador1.guardarPokemon(cambio1);
                        break;

                }

            } else {
                System.out.println(jugador1.getNombre() + ", " + auxj1.getApodo() + " tiene la velocidad para atacar");
                System.out.println("Que accion vas a realizar?");
                System.out.println("1...Atacar");
                System.out.println("2...Usar pocion");
                System.out.println("3...Camabiar pokemon");
                accion1 = s.nextInt();
                switch (accion1) {

                    case 1:
                        if (partida == 1) {
                            auxj1.ataque1(auxj2);
                            auxj1.calculadorElemental(auxj2);
                        } else {
                            auxj1.ataque2(auxj1);
                            auxj1.calculadorElemental(auxj2);
                        }
                        break;

                    case 2:
                        int banVida = 0;
                        int banAtaque = 0;
                        int banDefensa = 0;
                        String usarpocion;
                        System.out.println("Poción-> 'vida'");
                        System.out.println("Poción-> 'ataque'");
                        System.out.println("Poción-> 'defensa'");
                        usarpocion = s.next();
                        if (usarpocion.equals("vida")) {
                            if (banVida == 0) {
                                auxj1.recibePuntosvida();
                                banVida = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion.equals("ataque")) {
                            if (banAtaque == 0) {
                                auxj1.recibePuntosAtaque();
                                banAtaque = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else {
                            if (banDefensa == 0) {
                                auxj1.recibePuntosDefensa();
                                banDefensa = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        }

                        break;

                    case 3:
                        banVida = 0;
                        banAtaque = 0;
                        banDefensa = 0;
                        Pokemon cambio = new Pokemon();
                        cambio = auxj1;
                        auxj1 = jugador1.guardarPokemon(cambio);
                        break;

                }
                /***************** */
                System.out.println(jugador2.getNombre() + ", es tu turno de atacar con  " + auxj2.getApodo());
                System.out.println("Que accion vas a realizar?");
                System.out.println("1...Atacar");
                System.out.println("2...Usar pocion");
                System.out.println("3...Camabiar pokemon");
                accion1 = s.nextInt();
                switch (accion1) {

                    case 1:
                        if (partida == 1) {
                            auxj2.ataque1(auxj1);
                            auxj2.calculadorElemental(auxj1);
                            
                        } else {
                            auxj2.ataque2(auxj1);
                            auxj2.calculadorElemental(auxj1);
                        }
                        break;

                    case 2:
                        int banVida1 = 0;
                        int banAtaque1 = 0;
                        int banDefensa1 = 0;
                        String usarpocion1;
                        System.out.println("Poción-> 'vida'");
                        System.out.println("Poción-> 'ataque'");
                        System.out.println("Poción-> 'defensa'");
                        usarpocion1 = s.next();
                        if (usarpocion1.equals("vida")) {
                            if (banVida1 == 0) {
                                auxj2.recibePuntosvida();
                                banVida1 = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion1.equals("ataque")) {
                            if (banAtaque1 == 0) {
                                auxj2.recibePuntosAtaque();
                                banAtaque1 = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else {
                            if (banDefensa1 == 0) {
                                auxj2.recibePuntosDefensa();
                                banDefensa1 = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        }

                        break;

                    case 3:
                        banVida1 = 0;
                        banAtaque1 = 0;
                        banDefensa1 = 0;
                        Pokemon cambio1 = new Pokemon();
                        cambio1 = auxj1;
                        auxj1 = jugador1.guardarPokemon(cambio1);
                        break;

                }

            }

            if (auxj1.getVida() < auxj2.getVida()) {
                System.out.println("\n\nEsta batalla la gana \n\n" + jugador2.getNombre());
                System.out.println(
                        jugador2.getNombre() + (puntajej2 + 1) + " - " + (puntajej1 + 1) + jugador1.getNombre());
                puntajej2 = 1;
            } else {
                System.out.println("\n\nEsta batalla la gana " + jugador1.getNombre()+"\n\n");
                System.out.println(
                        jugador1.getNombre() + (puntajej1 + 1) + " - " + (puntajej2 + 1) + jugador2.getNombre());
                puntajej1 = 1;
            }
            partida++;

        }
    }
}