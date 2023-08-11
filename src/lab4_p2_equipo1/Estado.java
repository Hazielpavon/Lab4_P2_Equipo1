package lab4_p2_equipo1;

import java.util.Random;

public class Estado extends Movimiento {

    Random random = new Random();
    private String estado;

    public Estado(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estado{" + "" + estado + '}';
    }

    public int Generar(){ 
    int numero = 0;    
    for (int i = 0; i < 10; i++) {
          numero = random.nextInt(100)+1;
        }
    return numero;
    }

}
