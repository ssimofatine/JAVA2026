package tema6.Practica_Objetos_III;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agencia {
    private ArrayList<Coche> coches;
    private ArrayList<Alquiler> alquileres;

    public Agencia() {
        this.coches = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    public void addCoche(Coche c) {
        this.coches.add(c);
    }

    public void removeCoche(Coche c) {
        this.coches.remove(c);
    }

    public void listarCochesDisponibles() {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).isDisponible()) {
                System.out.println(coches.get(i).toString());
            }
        }
    }

    public Coche buscarCocheDisponible(TipoCoche tipo) throws NoHayCochesDisponiblesException {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getTipo() == tipo && coches.get(i).isDisponible()) {
                return coches.get(i);
            }
        }
        throw new NoHayCochesDisponiblesException("No hay coches disponibles del tipo " + tipo);
    }

    public boolean realizarAlquiler(Cliente cliente, TipoCoche tipo, LocalDate fechaInicio, LocalDate fechaFin) {
        try {
            Coche c = buscarCocheDisponible(tipo);
            c.setDisponible(false);
            Alquiler a = new Alquiler(cliente, c, fechaInicio, fechaFin);
            this.alquileres.add(a);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}