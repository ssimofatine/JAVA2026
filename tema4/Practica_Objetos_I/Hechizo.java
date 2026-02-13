package tema4.Practica_Objetos_I;
public class Hechizo {

    public enum Tipo {AIRE, FUEGO, ELECTRICIDAD}

    private String nombre;
    private int energiaNecesaria;
    private int potencia;
    private Tipo tipo;

    public Hechizo(String nombre, int energiaNecesaria, int potencia, Tipo tipo) {
        this.nombre = nombre;
        this.energiaNecesaria = energiaNecesaria;
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergiaNecesaria() {
        return energiaNecesaria;
    }

    public void setEnergiaNecesaria(int energiaNecesaria) {
        this.energiaNecesaria = energiaNecesaria;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hechizo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energiaNecesaria=").append(energiaNecesaria);
        sb.append(", potencia=").append(potencia);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    public boolean esEfectivo(Prueba prueba) {
        return this.potencia >= prueba.getNivelDificultad();
    }
}