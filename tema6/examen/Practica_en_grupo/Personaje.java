package tema6.examen.Practica_en_grupo;

public abstract class Personaje {

    public static final Integer vidaMax = 100;

    // Atributos comunes
    protected String nombre;
    protected int puntosVidaMax;
    protected int puntosVidaActual;
    protected int ataque;
    protected int defensa;
    protected boolean vivo;

    // Constructor
    public Personaje(String nombre, int puntosVidaMax, int ataque, int defensa) {
        this.nombre = nombre;
        this.puntosVidaMax = puntosVidaMax;
        this.puntosVidaActual = puntosVidaMax;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vivo = true;
    }

    // Métodos
    public void atacar(Personaje objetivo) {
        int danio = this.ataque - objetivo.getDefensa();
        if (danio < 1) danio = 1;
        System.out.println(this.nombre + " ataca a " + objetivo.getNombre() + " causando " + danio + " de daño.");
        objetivo.recibirDanio(danio);
    }

    public void recibirDanio(int danio) {
        this.puntosVidaActual -= danio;
        if (this.puntosVidaActual <= 0) {
            this.puntosVidaActual = 0;
            this.vivo = false;
            System.out.println(this.nombre + " ha muerto.");
        }
    }

    public void curar(int cantidad) {
        if (this.vivo) {
            this.puntosVidaActual += cantidad;
            if (this.puntosVidaActual > this.puntosVidaMax) {
                this.puntosVidaActual = vidaMax;
            }
            System.out.println(this.nombre + " se ha curado. Vida actual: " + this.puntosVidaActual + ". Vida maxima: " + this.puntosVidaMax + " y ya esta");
        }
    }

    public boolean estaVivo() {

        return vivo;
    }

    public abstract void usarHabilidadEspecial(Personaje objetivo);


    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVidaMax() {
        return puntosVidaMax;
    }

    public void setPuntosVidaMax(int puntosVidaMax) {
        this.puntosVidaMax = puntosVidaMax;
    }

    public int getPuntosVidaActual() {
        return puntosVidaActual;
    }

    public void setPuntosVidaActual(int puntosVidaActual) {
        this.puntosVidaActual = puntosVidaActual;
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

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    // toString con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", puntosVidaMax=").append(puntosVidaMax);
        sb.append(", puntosVidaActual=").append(puntosVidaActual);
        sb.append(", ataque=").append(ataque);
        sb.append(", defensa=").append(defensa);
        sb.append(", vivo=").append(vivo);
        sb.append('}');
        return sb.toString();
    }
}
