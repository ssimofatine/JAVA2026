package tema5.Practica_Objetos_II;

public class TractorAutonomo extends Maquina {
    private float potenciaCV;
    private float consumoPorHora;

    public TractorAutonomo(int id, String modelo, float potenciaCV, float consumoPorHora) {
        super(id, modelo);
        this.potenciaCV = potenciaCV;
        this.consumoPorHora = consumoPorHora;
    }

    public float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public float getConsumoPorHora() {
        return consumoPorHora;
    }

    public void setConsumoPorHora(float consumoPorHora) {
        this.consumoPorHora = consumoPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + " TractorAutonomo{potenciaCV=" + potenciaCV + ", consumoPorHora=" + consumoPorHora + "}";
    }

    @Override
    public String imprimirTipo() {
        return "Tractor Autónomo";
    }
}