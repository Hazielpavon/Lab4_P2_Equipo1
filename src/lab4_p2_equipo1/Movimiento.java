package lab4_p2_equipo1;

public abstract class Movimiento {

    private String nombre;
    private String descripcion;
    int poder;

    public Movimiento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Movimiento(String nombre, String descripcion, int poder) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Movimiento " + "Nombre = " + nombre + ", Descripcion = " + descripcion + "El poder es " + poder;
    }

    int calcularDanio(Pokemon pokemonEntrenador1, Pokemon pokemonEntrenador2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
