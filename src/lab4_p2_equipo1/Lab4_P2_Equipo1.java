package lab4_p2_equipo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_P2_Equipo1 {

    static int contador = 0;

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Entrenador> Entrenadores = new ArrayList();

        ArrayList<Movimiento> movimientos = new ArrayList();

        boolean seguir = true;

        while (seguir) {
            System.out.println("Te mando un beso Nuila");
            System.out.println("1. Registrar Entrenador");
            System.out.println("2. Battle Factory");
            System.out.println("3. Capturar/Entrenar");
            System.out.println("4. Anadir ataques");
            System.out.println("5. Salir");

            int opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el nombre del entrnador");
                    String nombree;

                    nombree = leer.next();

                    System.out.println("Ingrese la edad");
                    int edad = leer.nextInt();

                    System.out.println("Ingrese la cantidad de dinero en la cuenta");
                    double dineroencuenta = leer.nextDouble();

                    Entrenador a = new Entrenador(nombree, edad, dineroencuenta);

                    Entrenadores.add(a);

                    break;

                case 2:

                    String ok = " ";
                    String no = " ";
                    for (Entrenador arr : Entrenadores) {

                        ok += Entrenadores.indexOf(arr) + " - " + arr + "\n";
                        System.out.println(ok);
                    }
                    System.out.println("Seleccione el entrenador 1");
                    int opcTrainer = leer.nextInt();
                    Entrenador trainer1 = Entrenadores.get(opcTrainer);
                    Pokemon[] team = trainer1.getPok();
                    for (int i = 0; i < team.length; i++) {
                        System.out.println(i+"--->"+team[i].toString());
                    }
                    System.out.println("Seleccione el poke a usar");
                    int opcPokeTrainer1 = leer.nextInt();
                    Pokemon pokInUse = team[opcPokeTrainer1];
                    System.out.println(" ");

                    for (Object arre : Pokemones) {
                        if (arre instanceof Pokemon) {
                            no += Pokemones.indexOf(arre) + " - " + arre + "\n";
                        }
                    }

                    System.out.println("Ingrese el pokemon del Entrenador #1 que va a luchar ");
                    int entrepelea1 = leer.nextInt();
                    Pokemon.String ko = " ";
                    String on = " ";
                    for (Object arr : Entrenadores) {

                        if (arr instanceof Entrenador) {
                            ko += Entrenadores.indexOf(arr) + " - " + arr + "\n";
                            System.out.println(ok);
                        }
                    }

                    for (Object arre : Pokemones) {
                        if (arre instanceof Pokemon) {
                            on += Pokemones.indexOf(arre) + " - " + arre + "\n";
                        }
                    }

                    System.out.println("Ingrese el pokemon del Entrenador #1 que va a luchar ");
                    int entrepelea12 = leer.nextInt();

                    break;

                case 3:

                    boolean seguir3 = true;

                    while (seguir3) {

                        int cont = 0;
                        int cont2 = 1;
                        for (Entrenador arr : Entrenadores) {

                            System.out.println(Entrenadores.indexOf((arr)) + cont2 + arr.toString());
                            cont2++;
                        }

                        System.out.println("Ingrese el entrenador que quiere modificar:");
                        int mod = leer.nextInt() - 1;
                        Entrenador trainer = Entrenadores.get(mod);
                        if (mod >= 0 && mod < Entrenadores.size()) {

                            System.out.println("1. Entrenar");
                            System.out.println("2. Capturar");
                            System.out.println("3. Salir");
                            int opcion2 = leer.nextInt();

                            switch (opcion2) {

                                case 1:
                                    if (cont != 0) {

                                    } else {
                                        System.out.println("Capture un pokemon primero");
                                    }

                                    break;

                                case 2:

                                    System.out.println("Ingrese el nombre del pokemon");
                                    String nombre;

                                    nombre = leer.next();

                                    int nivel = 0;

                                    int exp = 0;

                                    int subnivel = 50;

                                    System.out.println("Ingrese la vida del pokemon");
                                    int vida = leer.nextInt();

                                    System.out.println("Ingrese el ataque");
                                    int ataque = leer.nextInt();

                                    System.out.println("Ingrese la defensa");
                                    int defensa = leer.nextInt();

                                    System.out.println("Ingrese el especial");
                                    int es = leer.nextInt();

                                    System.out.println("Ingrese la velocidad");
                                    int vel = leer.nextInt();

                                    String estado = "Neutral";
                                    Pokemon p = new Pokemon(nombre, nivel, exp, subnivel, vida, ataque, defensa, es, vel, estado);

                                    int cantMoves = 0;

                                    while (cantMoves != 4) {
                                        for (int i = 0; i < movimientos.size(); i++) {
                                            System.out.println(i + "->" + movimientos.get(i).toString());
                                        }
                                        System.out.println("Seleccione el ataque que tendra el Pokemon");
                                        int opc = leer.nextInt();
                                        Movimiento m = movimientos.get(opc);
                                        p.setMove(m, cantMoves);
                                        cantMoves++;
                                    }
                                    System.out.println("1. Anadir En equipo 2. Anadir en Caja");
                                    int boxOrTeam = leer.nextInt();
                                    if (boxOrTeam == 1) {
                                        int cantPokes = trainer.getPok().length;
                                        trainer.setPokInTeam(p, cantPokes);
                                    } else {
                                        trainer.setPokeInBox(p);
                                    }
                                    break;

                                case 3:

                                    seguir = false;
                                    break;

                                default:
                                    System.out.println("Ingrese un valor correcto");

                            }
                        } else {
                            System.out.println("Ingrese un indice correcto");
                        }
                    }

                case 4:
                    seguir = false;
                    break;

                default:
                    System.out.println("Ingrese un dato correcto");
            }

        }

    }

    public static void mov() {

        System.out.println("Ingrese el nombre del ataque");
        String nombre;

        nombre = leer.next();

        System.out.println("Ingrese los detalles");
        String detalles;

        detalles = leer.next();

        Movimiento m = new Movimiento(nombre, detalles);

        System.out.println("El golpe puede ser de 3 tipos");
        System.out.println("1. para Estado");
        System.out.println("2. para fisico");
        System.out.println("3. para especial");
        int opcion = leer.nextInt();

        switch (opcion) {

            case 1:
                String golpe = "";
                System.out.println("Ingrese el estado del ataque 1. para neutral 2. para dormido 3. paralizado 4. quemado 5. Neutral");
                int go = leer.nextInt();
             
                
                boolean se = true;

                while (se) {

                    if (go == 1) {
                        golpe = "neutral";
                        se = false;
                    } else if (go == 2) {
                        golpe = "dormido";

                    } else if (go == 3) {
                        golpe = "paralizado";
                    } else if (go == 4) {
                        golpe = "quemado";

                    } else if (go == 5) {
                        golpe = "neutral";
                    } else {
                        System.out.println("Ingrese una opcion valida");
                    }
                }

            case 2:
                System.out.println("Ingrese la precision");
                int prec = leer.nextInt();

                System.out.println("Ingrese los puntos de poder");
                int pun = leer.nextInt();

            case 3:
                System.out.println("Ingrese la precision");
                int preces = leer.nextInt();

                System.out.println("Ingrese los puntos de poder");
                int punes = leer.nextInt();
        }

    }

}
