package lab4_p2_equipo1;

public class Entrenador {

    private String Nombre;
    private int edad;
    private double dinero;

    public Entrenador() {
    }

    public Entrenador(String Nombre, int edad, double dinero) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.dinero = dinero;
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

    @Override
    public String toString() {
        return " Entrenedor: " + "Nombre = " + Nombre + " , edad = " + edad + " , dinero = " + dinero;
    }

}
