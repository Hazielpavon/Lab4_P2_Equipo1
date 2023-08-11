package lab4_p2_equipo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_P2_Equipo1 {

    static int contador = 0; 
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList Entrenadores = new ArrayList();
        ArrayList<Object> caja = new ArrayList(); 
        ArrayList<Object> movimientos = new ArrayList();

        boolean seguir = true;

        while (seguir) {
            System.out.println("Te mando un beso Nuila");
            System.out.println("1. Registrar Entrenador");
            System.out.println("2. Battle Factory");
            System.out.println("3. Capturar/Entrenar");
            System.out.println("4. Anadir ataques");
            System.out.println("4. Salir");

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

                    break;

                case 3:

                    boolean seguir3 = true;

                    while (seguir3) {

                        int cont = 0;
                        int cont2 = 1;
                        for (Object arr : Entrenadores) {

                            if (arr instanceof Entrenador) {
                                System.out.println(Entrenadores.indexOf((arr)) + cont2 + arr.toString());
                                cont2++;
                            }
                        }

                        System.out.println("Ingrese el entrenador que quiere modificar:");
                        int mod = leer.nextInt() - 1;

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

                                    for (int i = 0; i < 10; i++) {

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
    
    public static void mov (){
        
    }
    
    
    
}
