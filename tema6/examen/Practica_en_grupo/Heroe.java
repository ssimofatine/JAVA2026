package tema6.examen.Practica_en_grupo;
import java.util.ArrayList;
public class Heroe extends Personaje{


    //Atributos adicionales:
    private TipoHeroe tipo;
    private int nivel;
    private int experiencia;
    private ArrayList<Item> inventario;

    //Constructor
    public Heroe(String nombre, TipoHeroe tipo) {
        super(nombre, 0, 0, 0);
        this.tipo = tipo;
        this.nivel = 1;
        this.experiencia = 0;
        this.inventario = new ArrayList<>();
        //metodo tipoH(tipo) con enum del tipo heroe
        tipoH(tipo);
        this.puntosVidaActual = this.puntosVidaMax;
    }

    //Métodos void usarHabilidadEspecial(Personaje objetivo)
    @Override
    public void usarHabilidadEspecial(Personaje objetivo) {
        // crear una variavle int danio
        int danio;
        if (this.tipo == TipoHeroe.GUERRERO) {
            // hace el doble de daño
            danio = this.ataque * 2;
            System.out.println(this.nombre + " ataca Heroe " + objetivo.getNombre() + " causando " + danio);
            objetivo.recibirDanio(danio);
        } else if (this.tipo == TipoHeroe.MAGO) {
            // hace daño a todos los enemigos (se le pasa una lista)
            danio = this.ataque;
            System.out.println(this.nombre + " ataca Heroe " + objetivo.getNombre() + " causando " + danio);
            objetivo.recibirDanio(danio);
        } else if (this.tipo == TipoHeroe.ARQUERO) {
            // ignora la defensa del enemigo
            danio = this.ataque;
            System.out.println(this.nombre + " ataca Heroe " + objetivo.getNombre() + " causando " + danio);
            objetivo.recibirDanio(danio);
        }

    }

    // suma experiencia, si llega a 100 sube de nivel

    void ganarExperiencia(int exp){
        this.experiencia += exp;
        if(this.experiencia >= 100){
            this.nivel++;
        }
    }

    //aumenta stats (+20 vida, +5 ataque, +3 defensa), reinicia exp a 0
    void subirNivel(){
        this.puntosVidaMax += 20;
        this.ataque += 5;
        this.defensa += 3;
        this.experiencia = 0;
    }

    //usa una poción del inventario
    public void usarItem(Item item){
        this.inventario.remove(item);
        this.curar(item.getValorCuracion());
        System.out.println(this.nombre + " se ha curado. Vida actual: " + this.puntosVidaActual + ". Vida maxima: " + this.puntosVidaMax + " y ya esta");
    }


    //Setters y Getters


    public TipoHeroe getTipo() {
        return tipo;
    }

    public void setTipo(TipoHeroe tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public ArrayList<Item> getInventario() {
        return inventario;
    }


    // ToString Con StringBufferr

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Heroe{");
        sb.append("tipo=").append(tipo);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", inventario=").append(inventario);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", puntosVidaMax=").append(puntosVidaMax);
        sb.append(", puntosVidaActual=").append(puntosVidaActual);
        sb.append(", ataque=").append(ataque);
        sb.append(", defensa=").append(defensa);
        sb.append(", vivo=").append(vivo);
        sb.append('}');
        return sb.toString();
    }


    // Metodo tipoH(tipo) con enum del tipo heroe

    private void tipoH(TipoHeroe tipo){

        switch (tipo){
            case GUERRERO:
                this.puntosVidaMax = 100;
                this.ataque = 20;
                this.defensa = 15;
                break;
            case MAGO:
                this.puntosVidaMax = 60;
                this.ataque = 30;
                this.defensa = 5;
                break;
            case ARQUERO:
                this.puntosVidaMax = 80;
                this.ataque = 25;
                this.defensa = 10;
                break;
        }
    }


}
