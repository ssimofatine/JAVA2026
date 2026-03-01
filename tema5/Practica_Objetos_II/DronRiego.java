package tema5.Practica_Objetos_II;

public class DronRiego extends Maquina {
    private int capacidadLitros;
    private float alcanceMetros;

    public DronRiego(int id, String modelo, int capacidadLitros, float alcanceMetros) {
        super(id, modelo);
        this.capacidadLitros = capacidadLitros;
        this.alcanceMetros = alcanceMetros;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public float getAlcanceMetros() {
        return alcanceMetros;
    }

    public void setAlcanceMetros(float alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    @Override
    public String toString() {
        return super.toString() + " DronRiego{capacidadLitros=" + capacidadLitros + ", alcanceMetros=" + alcanceMetros + "}";
    }

    @Override
    public String imprimirTipo() {
        return "Dron de Riego";
    }

}
