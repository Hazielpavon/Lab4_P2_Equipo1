package lab4_p2_equipo1;

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

    @Override
    public String toString() {
        return "Pokemon {" + "Especie = " + especie + ", Nivel = " + nivel
                + "\n Experiencia = " + exp + ", Puntos necesarios para subir de nivel = " + subirnivel
                + "\n HP = " + HP
                + "\n Ataque = " + ataque + ", Defensa = " + defensa + ", Especial = " + especial
                + "\n Speed = " + speed + ", Estado = " + estado + '}';
    }
}

/*
        Scanner leer = new Scanner(System.in);
        ArrayList<Pokemon> cosas = new ArrayList();
        


System.out.println("Ingrese el numero para la especie del Pokemon");
                    System.out.println("1.");
                    System.out.println("2.");
                    System.out.println("3.");
                    int Car = leer.nextInt();
                    leer.nextLine();

                    while (Car != 1 && Car != 2 && Car != 3) {
                        System.out.println("Ingrese el numero para la especie del Pokemon");
                        System.out.println("1.");
                        System.out.println("2.");
                        System.out.println("3.");
                        Car = leer.nextInt();
                        leer.nextLine();
                    }

                    String especie = " ";
                    if (Car == 1) {
                        carnes = "Pequeno";
                    }

                    if (Car == 2) {
                        carnes = "Mediano";
                    }

                    if (Car == 3) {
                        carnes = "Grande";
                    }

 */
