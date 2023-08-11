package lab4_p2_equipo1;

import java.util.ArrayList;

public class Entrenador {

    private String Nombre;
    private int edad;
    private double dinero;
    private Pokemon pok[] = new Pokemon[6];
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

    public Pokemon[] getPok() {
        return pok;
    }

    public void setPok(Pokemon[] pok) {
        this.pok = pok;
    }
    
    public void setPokInTeam(Pokemon p, int cont){
        this.pok[cont]=p;
    }

    public void setPokeInBox(Pokemon p){
        this.caja.add(p);
    }

    public ArrayList<Pokemon> getCaja() {
        return caja;
    }

    public void setCaja(ArrayList<Pokemon> caja) {
        this.caja = caja;
    }
    
    
    @Override
    public String toString() {
        return "Entrenador: " + "Nombre = " + Nombre + " , edad = " + edad + " , dinero = " + dinero + ", pokemones = " + pok;
    }

    
    
}
