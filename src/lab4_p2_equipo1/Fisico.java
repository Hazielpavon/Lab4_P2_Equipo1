package lab4_p2_equipo1;

import java.util.Random;

public class Fisico extends Movimiento{
     Random random = new Random();
    public Fisico(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
    
    public int Generar(){ 
    int numero = 0;    
   
          numero = random.nextInt(50)+1;
   
    return numero;
    }
}
