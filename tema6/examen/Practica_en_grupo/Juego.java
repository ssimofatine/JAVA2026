package tema6.examen.Practica_en_grupo;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Heroe> equipo;
    private ArrayList<Sala> salas;
    private int salaActual;
    private boolean juegoTerminado;
    private ArrayList<Item> inventarioCompartido;

    public Juego() {
        this.equipo = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.inventarioCompartido = new ArrayList<>();
        this.salaActual = 0;
        this.juegoTerminado = false;
    }

    public void inicializarJuego() {
        for (int i = 1; i <= 5; i++) {
            salas.add(new Sala(i, false));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige tu equipo de 3 heroes.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Heroe " + i + ": 1.Guerrero 2.Mago 3.Arquero");
            int opcion = Integer.parseInt(sc.nextLine());
            System.out.println("Nombre:");
            String nombre = sc.nextLine();

            if (opcion == 1) {
                equipo.add(new Heroe(nombre, TipoHeroe.GUERRERO));
            } else if (opcion == 2) {
                equipo.add(new Heroe(nombre, TipoHeroe.MAGO));
            } else {
                equipo.add(new Heroe(nombre, TipoHeroe.ARQUERO));
            }
        }

        Item it1 = new Item("Pocion Pequeña1", TipoItem.POCION_PEQUENA, 30);
        Item it2 = new Item("Pocion Pequeña2", TipoItem.POCION_PEQUENA, 20);
        Item it3 = new Item("Pocion Grande", TipoItem.POCION_GRANDE, 10);

        inventarioCompartido.add(it1);
        inventarioCompartido.add(it2);
        inventarioCompartido.add(it3);
    }

    public void jugar() {
        Scanner sc = new Scanner(System.in);
        while (!juegoTerminado && salaActual < 5) {
            if (salaActual > 0) {
                menuEntreSalas(sc);
            }

            Sala sala = salas.get(salaActual);
            System.out.println(" SALA " + sala.getNumeroSala() );
            Combate combate = new Combate(equipo, sala);
            combate.iniciarCombate();

            verificarEstadoJuego();
            if (!juegoTerminado) {
                salaActual = salaActual + 1;
            }
        }
        mostrarResultadoFinal();
    }

    public void menuEntreSalas(Scanner sc) {
        boolean continuar = false;
        while (!continuar) {
            System.out.println("1. Ver equipo");
            System.out.println("2. Usar pocion");
            System.out.println("3. Descansar");
            System.out.println("4. Continuar a siguiente sala");
            int opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                for (int i = 0; i < equipo.size(); i++) {
                    Heroe h = equipo.get(i);
                    System.out.println(h.getNombre() + " - HP: " + h.getPuntosVidaActual() + " - Nivel: " + h.getNivel());
                }
            } else if (opcion == 2) {
                if (inventarioCompartido.isEmpty()) {
                    System.out.println("No hay pociones.");
                } else {
                    Item item = inventarioCompartido.get(0);
                    System.out.println("Usando " + item.getNombre());
                    for (int i = 0; i < equipo.size(); i++) {
                        if (equipo.get(i).estaVivo()) {
                            item.usar(equipo.get(i));
                            inventarioCompartido.remove(0);
                            break;
                        }
                    }
                }
            } else if (opcion == 3) {
                System.out.println("Descansando Recuperando 20 HP.");
                for (int i = 0; i < equipo.size(); i++) {
                    if (equipo.get(i).estaVivo()) {
                        equipo.get(i).curar(20);
                    }
                }
            } else if (opcion == 4) {
                continuar = true;
            }
        }
    }

    public void verificarEstadoJuego() {
        boolean todosMuertos = true;
        for (int i = 0; i < equipo.size(); i++) {
            if (equipo.get(i).estaVivo()) {
                todosMuertos = false;
                break;
            }
        }
        if (todosMuertos) {
            juegoTerminado = true;
        }
    }

    public void mostrarResultadoFinal() {
        if (salaActual >= 5 && !juegoTerminado) {
            System.out.println(" Has limpiado la mazmorra.");
        } else {
            System.out.println("Tu equipo ha caido.");
        }
    }
}