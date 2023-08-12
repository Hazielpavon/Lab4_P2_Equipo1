package lab4_p2_equipo1;

import java.util.Random;
import static lab4_p2_equipo1.Lab4_P2_Equipo1.movimientos;

public class Pokemon {

    private String especie;
    private int nivel;
    private int exp;
    private int subirnivel;
    private int HP;
    private int ataque;
    private int defensa;
    private int especial;
    private int speed;
    private String estado;
    private Movimiento moveset[] = new Movimiento[4];

    public Pokemon(String especie, int nivel, int exp, int subirnivel, int HP, int ataque, int defensa, int especial, int speed, String estado) {
        this.especie = especie;
        this.nivel = nivel;
        this.exp = exp;
        this.subirnivel = subirnivel;
        this.HP = HP;
        this.ataque = ataque;
        this.defensa = defensa;
        this.especial = especial;
        this.speed = speed;
        this.estado = estado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSubirnivel() {
        return subirnivel;
    }

    public void setSubirnivel(int subirnivel) {
        this.subirnivel = subirnivel;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Movimiento[] getMoveset() {
        return moveset;
    }

    public void setMoveset(Movimiento[] moveset) {
        this.moveset = moveset;
    }

    public void setMove(Movimiento m, int cont) {
        this.moveset[cont] = m;
    }

    public void entrenar(int multiplicador, int puntosExperiencia) {
        int experienciaAnterior = this.exp;
        this.exp += puntosExperiencia * multiplicador;

        while (this.exp >= this.subirnivel) {
            this.exp -= this.subirnivel;
            this.nivel++;
            this.subirnivel += 50; // Actualizar puntos necesarios para el siguiente nivel

            // Ajustar las estadísticas del Pokémon
            this.HP += 5;
            this.ataque += 2;
            this.defensa += 2;
            this.especial += 2;
            this.speed += 1;

            System.out.println(this.especie + " ha subido de nivel ");
        }

        System.out.println(this.especie + " ha ganado " + (this.exp - experienciaAnterior) + " puntos de experiencia.");
    }

    public Movimiento elegirMovimiento() {
        Random random = new Random();
        int indiceMovimiento = random.nextInt(movimientos.size());
        return movimientos.get(indiceMovimiento);
    }

    public int calcularDanio(Pokemon atacante, Pokemon objetivo, Movimiento movimiento) {
        int poderAtaque = atacante.getAtaque();
        int defensaObjetivo = objetivo.getDefensa();
        int poderMovimiento = movimiento.getPoder();

        int daño = (poderAtaque - defensaObjetivo) + poderMovimiento;

        if (daño < 0) {
            daño = 0;
        }

        return daño;
    }

    @Override
    public String toString() {
        return "Pokemon {" + "Especie = " + especie + ", Nivel = " + nivel
                + "\n Experiencia = " + exp + ", Puntos necesarios para subir de nivel = " + subirnivel
                + "\n HP = " + HP
                + "\n Ataque = " + ataque + ", Defensa = " + defensa + ", Especial = " + especial
                + "\n Speed = " + speed + ", Estado = " + estado + '}';
    }

    void recibirDanio(int danoEntrenador1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
