package tema6.examen.Practica_en_grupo;
import java.util.ArrayList;
public class Sala {
    /**
     * Representa una sala de la mazmorra con enemigos.
     *
     * Atributos:
     *
     * int numeroSala
     * ArrayList<Enemigo> enemigos
     * boolean completada
     * Constructor:
     *
     * Recibe el número de sala
     * Genera enemigos aleatorios según la dificultad:
     * Salas 1-2: 2-3 Goblins
     * Salas 3-4: 1-2 Orcos + 1 Goblin
     * Sala 5 (JEFE): 1 Dragón + 2 Orcos
     * Métodos:
     *
     * void generarEnemigos(): crea los enemigos de la sala
     * boolean todosEnemigosmuertos(): verifica si no quedan enemigos vivos
     * ArrayList<Enemigo> getEnemigosVivos(): devuelve solo los enemigos con vida
     * toString que muestre los enemigos
     */


    //Atributos
    private int numeroSala;
    private ArrayList<Enemigo> enemigos;
    private boolean completada;

    //Constructor


    public Sala(int numeroSala, boolean completada) {
        this.numeroSala = numeroSala;
        this.completada = completada;
        this.enemigos = new ArrayList<>();
    }

    //Getters y Setters


    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public ArrayList<Enemigo> getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(ArrayList<Enemigo> enemigos) {
        this.enemigos = enemigos;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    //Métodos
    public void generarEnemigos(){
        int numEnemigos;
        if(this.numeroSala == 1 || this.numeroSala == 2){
            numEnemigos = (int)(Math.random() * 2) + 2;
            for(int i = 1; i <= numEnemigos; i++){
                Enemigo genrarEnemigo = new Enemigo("Goblin", 30, 8, 3, TipoEnemigo.GOBLIN, 20);
                this.enemigos.add(genrarEnemigo);

            }
        } else if (this.numeroSala == 3 || this.numeroSala == 4) {
            numEnemigos = (int)(Math.random() * 2) + 1;
            for(int i = 1; i <= numEnemigos; i++){
                Enemigo genrarEnemigo = new Enemigo("Orco", 60, 15, 8, TipoEnemigo.ORCO, 40);
                this.enemigos.add(genrarEnemigo);
            }
        }else if (this.numeroSala == 5) {
            Enemigo jefe = new Enemigo("Dragon Jefe", 150, 25, 12, TipoEnemigo.DRAGON, 100);
            this.enemigos.add(jefe);
        }
    }

    //boolean todosEnemigosmuertos(): verifica si no quedan enemigos vivos
    public boolean todosEnemigosMuertos() {
        for (Enemigo e : enemigos) {
            if (e.estaVivo()){
                return false;
            }
        }
        return true;
    }

    //ArrayList<Enemigo> getEnemigosVivos(): devuelve solo los enemigos con vida
    public ArrayList<Enemigo> getEnemigosVivos() {
        ArrayList<Enemigo> vivos = new ArrayList<>();

        for (Enemigo e : enemigos) {
            if (e.estaVivo()){
                vivos.add(e);
            }
        }
        return vivos;
    }

    //toString que muestre los enemigos


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sala{");
        sb.append("numeroSala=").append(numeroSala);
        sb.append("enemigos=").append(enemigos.size());
        sb.append('}');
        return sb.toString();
    }
}
