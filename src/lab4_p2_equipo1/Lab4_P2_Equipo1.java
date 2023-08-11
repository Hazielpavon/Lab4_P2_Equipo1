package lab4_p2_equipo1;

import java.util.Scanner;

public class Lab4_P2_Equipo1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean seguir = true;

        while (seguir) {

            System.out.println("1. Registrar Entrenador");
            System.out.println("2. Battle Factory");
            System.out.println("3. Capturar/Entrnar");
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
                    
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    seguir = false;
                    break;

                default:

                    System.out.println("Ingrese un dato correcto");
            }
        }

    }

}
