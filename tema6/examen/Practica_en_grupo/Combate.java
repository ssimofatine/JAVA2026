package tema6.examen.Practica_en_grupo;

import java.util.ArrayList;
import java.util.Random;

public class Combate {

    public static final int TURNOS = 1;
    private ArrayList<Heroe> heroes;
    private Sala sala;
    private int turno;
    private int simo;

    public Combate(ArrayList<Heroe> heroes, Sala sala) {
        this.heroes = heroes;
        this.sala = sala;
        this.turno = TURNOS;
    }


    //void iniciarCombate(): bucle principal del combate
    //Mientras haya héroes y enemigos vivos:
    //Mostrar estado (vida de todos)
    //Turno de héroes (cada héroe ataca)
    //Turno de enemigos (cada enemigo ataca)
    //Incrementar contador de turnos

    public void iniciarCombate() {
        while ( !combateTerminado() ) {
            System.out.println("Turno " + turno);
            mostrarEstadoCombate();
            turnoHeroes();
            if (!combateTerminado()) {
                turnoEnemigos();
            }
            turno = turno + 1;
        }

        if (sala.todosEnemigosMuertos()) {
            System.out.println("VICTORIA en la sala " + sala.getNumeroSala());
            distribuirRecompensas();
            sala.setCompletada(true);
        } else {
            System.out.println("DERROTA...");
        }
    }

    public void turnoHeroes() {
        ArrayList<Enemigo> enemigosVivos = sala.getEnemigosVivos();
        for (int i = 0; i < heroes.size(); i++) {
            Heroe h = heroes.get(i);
            if (h.estaVivo() && !enemigosVivos.isEmpty()) {
                Enemigo objetivo = enemigosVivos.get(0);
                h.atacar(objetivo);
                System.out.println(h.getNombre() + " ataca a " + objetivo.getNombre());

                if (!objetivo.estaVivo()) {
                    System.out.println(objetivo.getNombre() + " derrotado.");
                    enemigosVivos.remove(objetivo);
                }
            }
        }
    }

    public void turnoEnemigos() {
        ArrayList<Enemigo> enemigosVivos = sala.getEnemigosVivos();
        ArrayList<Heroe> heroesVivos = new ArrayList<>();

        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).estaVivo()) {
                heroesVivos.add(heroes.get(i));
            }
        }

        Random rand = new Random();
        for (int i = 0; i < enemigosVivos.size(); i++) {
            Enemigo e = enemigosVivos.get(i);
            if (!heroesVivos.isEmpty()) {
                int index = rand.nextInt(heroesVivos.size());
                Heroe objetivo = heroesVivos.get(index);
                e.atacar(objetivo);
                System.out.println(e.getNombre() + " ataca a " + objetivo.getNombre());

                if (!objetivo.estaVivo()) {
                    System.out.println(objetivo.getNombre() + " derrotado.");
                    heroesVivos.remove(objetivo);
                }
            }
        }

    }

    public boolean combateTerminado() {
        boolean todosHeroesMuertos = true;

        for (Heroe h : heroes) {
            if (h.estaVivo()) {
                todosHeroesMuertos = false;
                break;
            }
        }
        if (todosHeroesMuertos) {
            return true;
        }
        if (sala.todosEnemigosMuertos()) {
            return true;
        }
        return false;
    }

    public void mostrarEstadoCombate() {
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i).toString());
        }
        for (int i = 0; i < sala.getEnemigosVivos().size(); i++) {
            System.out.println(sala.getEnemigosVivos().get(i).toString());
        }
    }

    public void distribuirRecompensas() {
        int expTotal = 0;
        for (int i = 0; i < sala.getEnemigos().size(); i++) {
            expTotal = expTotal + sala.getEnemigos().get(i).getExpOtorgada();
        }

        for (Heroe h : heroes) {
            if (h.estaVivo()){
                h.ganarExperiencia(expTotal);
            }

        }
        System.out.println("Experiencia ganada: " + expTotal);
    }


}
