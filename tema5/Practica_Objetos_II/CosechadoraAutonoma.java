package tema5.Practica_Objetos_II;

public class CosechadoraAutonoma extends Maquina {
    private float anchoCorte;
    private float rendimientoToneladasHora;

    public CosechadoraAutonoma(int id, String modelo, float anchoCorte, float rendimientoToneladasHora) {
        super(id, modelo);
        this.anchoCorte = anchoCorte;
        this.rendimientoToneladasHora = rendimientoToneladasHora;
    }

    public float getAnchoCorte() {
        return anchoCorte;
    }

    public void setAnchoCorte(float anchoCorte) {
        this.anchoCorte = anchoCorte;
    }

    public float getRendimientoToneladasHora() {
        return rendimientoToneladasHora;
    }

    public void setRendimientoToneladasHora(float rendimientoToneladasHora) {
        this.rendimientoToneladasHora = rendimientoToneladasHora;
    }

    @Override
    public String toString() {
        return super.toString() + " CosechadoraAutonoma{anchoCorte=" + anchoCorte + ", rendimientoToneladasHora=" + rendimientoToneladasHora + "}";
    }

    @Override
    public String imprimirTipo() {
        return "Cosechadora Autónoma";
    }
}