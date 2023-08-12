/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_p2_equipo1;

import java.util.Random;

public class Especiales extends Movimiento {

    Random random = new Random();

    public Especiales(String nombre, String descripcion, int potenciaEspecial, int precisionEspecial) {
        super(nombre, descripcion);
    }

    public int Generar() {
        int numero = 0;
        
        numero = random.nextInt(50) + 1;
        return numero;
    }
    
    public int Generar1() {
        int numero2 = 0;
        
        
        numero2 = random.nextInt(500) + 100;
        return numero2;
    }

}
