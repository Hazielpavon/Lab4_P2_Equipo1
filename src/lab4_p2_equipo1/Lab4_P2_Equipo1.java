package lab4_p2_equipo1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4_P2_Equipo1 {

    static int contador = 0;
    static int contador2 = 0;
    static ArrayList<Movimiento> movimientos = new ArrayList();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Entrenador> Entrenadores = new ArrayList();

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
                    contador2++;

                    break;

                case 2:

                    if (Entrenadores.size() < 2) {
                        System.out.println("Debe haber al menos 2 entrenadores registrados para la Battle Factory.");
                        break;
                    }

                    System.out.println("Seleccione el entrenador 1:");
                    for (int i = 0; i < Entrenadores.size(); i++) {
                        System.out.println(i + " - " + Entrenadores.get(i).getNombre());
                    }
                    int indiceEntrenador1 = leer.nextInt();
                    Entrenador entrenador1 = Entrenadores.get(indiceEntrenador1);

                    System.out.println("Seleccione el entrenador 2:");
                    for (int i = 0; i < Entrenadores.size(); i++) {
                        if (i != indiceEntrenador1) {
                            System.out.println(i + " - " + Entrenadores.get(i).getNombre());
                        }
                    }
                    int indiceEntrenador2 = leer.nextInt();
                    Entrenador entrenador2 = Entrenadores.get(indiceEntrenador2);

                    System.out.println("¡Comienza la batalla en la Battle Factory!");
                    System.out.println(entrenador1.getNombre() + " envía a la batalla a su Pokémon:");
                    Pokemon pokemonEntrenador1 = entrenador1.getPok()[0];
                    System.out.println(pokemonEntrenador1);

                    System.out.println(entrenador2.getNombre() + " envía a la batalla a su Pokémon:");
                    Pokemon pokemonEntrenador2 = entrenador2.getPok()[0];
                    System.out.println(pokemonEntrenador2);

                    
                    while (pokemonEntrenador1.getHP()> 0 && pokemonEntrenador2.getHP()> 0) {
                        System.out.println(entrenador1.getNombre() + " ataca a " + entrenador2.getNombre() + ":");
                        Movimiento movimientoEntrenador1 = pokemonEntrenador1.elegirMovimiento();
                        int danoEntrenador1 = movimientoEntrenador1.calcularDanio(pokemonEntrenador1, pokemonEntrenador2);
                        pokemonEntrenador2.recibirDanio(danoEntrenador1);
                        System.out.println(entrenador2.getNombre() + " tiene " + pokemonEntrenador2.getHP()+ " puntos de vida restantes.");

                        if (pokemonEntrenador2.getHP()<= 0) {
                            System.out.println(entrenador2.getNombre() + " ha perdido la batalla.");
                            break;
                        }

                        System.out.println(entrenador2.getNombre() + " ataca a " + entrenador1.getNombre() + ":");
                        Movimiento movimientoEntrenador2 = pokemonEntrenador2.elegirMovimiento();
                        int danoEntrenador2 = movimientoEntrenador2.calcularDanio(pokemonEntrenador2, pokemonEntrenador1);
                        pokemonEntrenador1.recibirDanio(danoEntrenador2);
                        System.out.println(entrenador1.getNombre() + " tiene " + pokemonEntrenador1.getHP()+ " puntos de vida restantes.");

                        if (pokemonEntrenador1.getHP()<= 0) {
                            System.out.println(entrenador1.getNombre() + " ha perdido la batalla.");
                            break;
                        }
                    }
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
                                    if (contador != 0) {
                                        System.out.println("Seleccione el Pokémon a entrenar:");
                                        int opcPokemon = leer.nextInt();
                                        Pokemon pokemonAEntrenar = trainer.getPok()[opcPokemon];

                                        int multiplicador = new Random().nextInt(3);
                                        int puntosExperiencia = new Random().nextInt(4900) + 100;

                                        pokemonAEntrenar.entrenar(multiplicador, puntosExperiencia);

                                    } else {
                                        System.out.println("Capture un pokemon primero");
                                    }

                                    break;

                                case 2:
                                    if (contador2 > 0) {
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
                                        contador++;
                                        break;
                                    } else {
                                        System.out.println("Ingrese un entrnador primero");
                                    }
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
                    mov();
                    break;

                case 5:
                    seguir = false;
                    break;

                default:
                    System.out.println("Ingrese un dato correcto");
            }

        }

    }

    public static void mov() {

        System.out.println("Ingrese el nombre del ataque");
        String nombre = leer.next();

        System.out.println("Ingrese los detalles");
        String detalles = leer.next();

        System.out.println("El tipo de movimiento: ");
        System.out.println("1. Estado");
        System.out.println("2. Fisico");
        System.out.println("3. Especial");
        int tipo = leer.nextInt();

        Movimiento m;

        switch (tipo) {
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
                m = new Estado(nombre, detalles, golpe);
                break;

            case 2:
                System.out.println("Ingrese la potencia Fisica");
                int potenciaFisica = leer.nextInt();
                System.out.println("Ingrese la precision fisica");
                int precisionFisica = leer.nextInt();

                m = new Fisico(nombre, detalles, potenciaFisica, precisionFisica);
                break;

            case 3:
                System.out.println("Ingrese la potencia especial");
                int potenciaEspecial = leer.nextInt();
                System.out.println("Ingrese la precision especial");
                int precisionEspecial = leer.nextInt();

                m = new Especiales(nombre, detalles, potenciaEspecial, precisionEspecial);
                break;

            default:
                System.out.println("Tipo de movimiento no válido");
                return;
        }

        movimientos.add(m);
        System.out.println("Movimiento agregado con éxito.");

    }
}
