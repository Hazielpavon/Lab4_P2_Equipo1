package lab4_p2_equipo1;

import java.util.ArrayList;

public class Entrenador {

    private String Nombre;
    private int edad;
    private double dinero;
    private String pok[] = new String[6];
    private ArrayList<Pokemon> caja = new ArrayList();
    
    public Entrenador() {
    }

    public Entrenador(String Nombre, int edad, double dinero) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.Nombre = this.Nombre; 
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String[] getPok() {
        return pok;
    }

    public void setPok(String[] pok) {
        this.pok = pok;
    }

    @Override
    public String toString() {
        return "Entrenador: " + "Nombre = " + Nombre + " , edad = " + edad + " , dinero = " + dinero + ", pokemones = " + pok;
    }

    
    
}
