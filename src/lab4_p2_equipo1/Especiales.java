/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_p2_equipo1;

import java.util.Random;

public class Especiales extends Movimiento {

    Random random = new Random();

    public Especiales(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
    
    public int Generar(){ 
    int numero = 0;    
    for (int i = 0; i < 10; i++) {
          numero = random.nextInt(100)+1;
        }
    return numero;
    }

}
