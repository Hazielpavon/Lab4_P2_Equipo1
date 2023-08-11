package lab4_p2_equipo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_P2_Equipo1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList Entrenadores = new ArrayList();

        ArrayList<Object> caja = new ArrayList();
        ArrayList<Object> Pokemones = new ArrayList();

        boolean seguir = true;

        while (seguir) {

            System.out.println("1. Registrar Entrenador");
            System.out.println("2. Battle Factory");
            System.out.println("3. Capturar/Entrenar");
            System.out.println("4. anadir movimientos");
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
                     for (Object arr : Entrenadores) {
                         
                            if (arr instanceof Entrenador) {
                                ok+= Entrenadores.indexOf(arr) + " - " + arr + "\n";
                                System.out.println(ok);
                            }
                        }
                     System.out.println(" ");
                     
                     for (Object arre : Pokemones) {
                            if (arre instanceof Pokemon) {
                            no += Pokemones.indexOf(arre) + " - " + arre + "\n";
                               }
                        }
                     
                     System.out.println("Ingrese el pokemon del Entrenador #1 que va a luchar ");
                     int entrepelea1 = leer.nextInt();
                     Pokemon.
                             
                             
                             
                     String ko = " "; 
                     String on = " ";
                     for (Object arr : Entrenadores) {
                         
                            if (arr instanceof Entrenador) {
                                ko+= Entrenadores.indexOf(arr) + " - " + arr + "\n";
                                System.out.println(ok);
                            }
                        }
                     
                     
                     for (Object arre : Pokemones) {
                            if (arre instanceof Pokemon) {
                            on+= Pokemones.indexOf(arre) + " - " + arre + "\n";
                               }
                        }
                     
                     System.out.println("Ingrese el pokemon del Entrenador #1 que va a luchar ");
                     int entrepelea12 = leer.nextInt();
                     
                     
                     
                     
                    break;

                case 3:

                    boolean seguir3 = true;

                    while (seguir3) {

                        int cont = 0;

                        for (Object arr : Entrenadores) {
                            if (arr instanceof Entrenador) {
                                System.out.println(Entrenadores.indexOf((arr))  + arr.toString());
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

                    break;

                case 5:

                    seguir = false;
                    break;

                default:

                    System.out.println("Ingrese un dato correcto");
            }

        }

    }
}
