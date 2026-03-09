package tema6.examen.Practica_en_grupo;

public class Enemigo extends Personaje{
    /**
     * Atributos adicionales:
     *
     * TipoEnemigo tipo
     * int expOtorgada (experiencia que da al morir)
     */

    // Atributos

    private TipoEnemigo tipo;
    private int expOtorgada;

    // Constructor


    public Enemigo(String nombre, int puntosVidaMax, int ataque, int defensa, TipoEnemigo tipo, int expOtorgada) {
        super(nombre, puntosVidaMax, ataque, defensa);
        this.tipo = tipo;
        this.expOtorgada = expOtorgada;
        //metodo tipoH(tipo) con enum del tipo heroe
        tipoE(tipo);
    }

    // setters y getters


    public TipoEnemigo getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnemigo tipo) {
        this.tipo = tipo;
    }

    public int getExpOtorgada() {
        return expOtorgada;
    }

    public void setExpOtorgada(int expOtorgada) {
        this.expOtorgada = expOtorgada;
    }

    //ToString cin StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Enemigo{");
        sb.append("tipo=").append(tipo);
        sb.append(", expOtorgada=").append(expOtorgada);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", puntosVidaMax=").append(puntosVidaMax);
        sb.append(", puntosVidaActual=").append(puntosVidaActual);
        sb.append(", ataque=").append(ataque);
        sb.append(", defensa=").append(defensa);
        sb.append(", vivo=").append(vivo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * void usarHabilidadEspecial(Personaje objetivo):
     * GOBLIN: "Golpe Rápido" - ataca dos veces seguidas con daño reducido
     * ORCO: "Grito de Guerra" - aumenta su ataque temporalmente
     * DRAGON: "Aliento de Fuego" - daña a todos los héroes
     * @param objetivo
     */


    public void usarHabilidadEspecial(Personaje objetivo){
        // crear una variavle int danio
        int danio;
        if(this.tipo == TipoEnemigo.GOBLIN){
            // GOBLIN: "Golpe Rápido" - ataca dos veces seguidas con daño reducido
            danio = this.ataque;
            System.out.println(this.nombre + " ataca Heroe " + objetivo.getNombre() + " causando " + danio);
            objetivo.recibirDanio(danio);
        } else if (this.tipo == TipoEnemigo.ORCO) {
            // aumenta su ataque temporalmente
            danio = this.ataque ;
            System.out.println(this.nombre + " ataca Heroe " + objetivo.getNombre() + " causando " + danio);
            objetivo.recibirDanio(danio);
        } else if (this.tipo == TipoEnemigo.DRAGON) {
            //"Aliento de Fuego" - daña a todos los héroes
            danio = this.ataque;
            System.out.println(this.nombre + " ataca Heroe " + objetivo.getNombre() + " causando " + danio);
            objetivo.recibirDanio(danio);


        }
    }
    // Metodo tipoE(tipo) con enum del tipo Enemigo
    private void tipoE(TipoEnemigo tipo){

        switch (tipo){
            case GOBLIN:
                this.puntosVidaMax = 30;
                this.ataque = 8;
                this.defensa = 3;
                this.expOtorgada = 20;
                break;
            case ORCO:
                this.puntosVidaMax = 60;
                this.ataque = 15;
                this.defensa = 8;
                this.expOtorgada = 40;
                break;
            case DRAGON:
                this.puntosVidaMax = 150;
                this.ataque = 25;
                this.defensa = 12;
                this.expOtorgada = 100;
                break;
        }
    }
}
