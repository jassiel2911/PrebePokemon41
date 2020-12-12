import java.util.ArrayList;
import java.util.Scanner;

public class Batalla {

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
    ArrayList<Pokemon> aux1 = new ArrayList<>();
    ArrayList<Pokemon> aux2 = new ArrayList<>();
    public static Scanner s = new Scanner(System.in);

    public void turno() {
        // "limpiar pantalla"
        for (int i = 0; i < 50; i++)
            System.out.println();

        Jugador c = new Jugador();
        c.listarPokemon();

        System.out.println("INICIAMOS");
        System.out.println(jugador1.getNombre() + "Es hora de elegir a tu pokemon para la primer batalla");
        System.out.println("Cual es tu mejor Guerrero?");
        auxj1 = jugador1.elegirPokemon();

        // "Limpiar pantalla"
        for (int i = 0; i < 50; i++)
            System.out.println();

        System.out.println(jugador2.getNombre() + "Es hora de elegir a tu pokemon para la primer batalla");
        System.out.println("Cual es tu mejor Guerrero?");
        auxj2 = jugador2.elegirPokemon();
        System.out.println(auxj1);

        while (partida < 7) {

            System.out.println("Batalla " + partida);
            if (auxj1.getVelocidad() < auxj2.getVelocidad()) {
                System.out.println(jugador2.getNombre() + ", " + auxj2.getApodo() + "tine la Velocidad para atacar");
                System.out.println("Que accion vas a realizar");
                System.out.println("1...Atacar");
                System.out.println("2...Usar pocion");
                System.out.println("3...Camabiar pokemon");
                accion2 = s.nextInt();
                switch (accion2) {

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
                        int banVida = 0;
                        int banAtaque = 0;
                        int banDefensa = 0;
                        String usarpocion;
                        System.out.println("Pocion 'vida'");
                        System.out.println("Pocion 'ataque'");
                        System.out.println("Pocion 'defensa'");
                        usarpocion = s.next();
                        if (usarpocion == "vida") {
                            if (banVida == 0) {
                                auxj2.recibePuntosvida();
                                banVida = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion == "ataque") {
                            if (banAtaque == 0) {
                                auxj2.recibePuntosAtaque();
                                banAtaque = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion == "defensa") {
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
                        Pokemon cambio = new Pokemon();
                        cambio = auxj2;
                        auxj2 = jugador2.guardarPokemon(cambio);
                        break;
                    /**************** */
                }
                System.out.println(jugador1.getNombre() + ", es tu turno de atacar con  " + auxj1.getApodo());
                System.out.println("Que accion vas a realizar");
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
                            auxj1.ataque2(auxj2);
                            auxj1.calculadorElemental(auxj2);
                        }
                        break;

                    case 2:
                        int banVida1 = 0;
                        int banAtaque1 = 0;
                        int banDefensa1 = 0;
                        String usarpocion1;
                        System.out.println("Pocion 'vida'");
                        System.out.println("Pocion 'ataque'");
                        System.out.println("Pocion 'defensa'");
                        usarpocion1 = s.next();
                        if (usarpocion1 == "vida") {
                            if (banVida1 == 0) {
                                auxj1.recibePuntosvida();
                                banVida1 = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion1 == "ataque") {
                            if (banAtaque1 == 0) {
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
                System.out.println(jugador1.getNombre() + ", " + auxj1.getApodo() + " tiene la Velocidad para atacar");
                System.out.println("Que accion vas a realizar");
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
                        System.out.println("Poción 'vida'");
                        System.out.println("Poción 'ataque'");
                        System.out.println("Poción 'defensa'");
                        usarpocion = s.next();
                        if (usarpocion == "vida") {
                            if (banVida == 0) {
                                auxj1.recibePuntosvida();
                                banVida = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion == "ataque") {
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
                        System.out.println("Poción 'vida'");
                        System.out.println("Poción 'ataque'");
                        System.out.println("Poción 'defensa'");
                        usarpocion1 = s.next();
                        if (usarpocion1 == "vida") {
                            if (banVida1 == 0) {
                                auxj2.recibePuntosvida();
                                banVida1 = 1;
                            } else {
                                System.out.println("Pocion agotada");
                            }

                        } else if (usarpocion1 == "ataque") {
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
                System.out.println("Esta batalla la gana" + jugador2.getNombre());
                System.out.println(
                        jugador2.getNombre() + (puntajej2 + 1) + " - " + (puntajej1 + 1) + jugador1.getNombre());
                puntajej2 = 1;
            } else {
                System.out.println("Esta batalla la gana" + jugador1.getNombre());
                System.out.println(
                        jugador1.getNombre() + (puntajej1 + 1) + " - " + (puntajej2 + 1) + jugador2.getNombre());
                puntajej1 = 1;
            }
            partida++;
        }
    }
}
