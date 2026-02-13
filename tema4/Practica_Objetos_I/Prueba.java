package tema4.Practica_Objetos_I;
public class Prueba {

    private String descripcion;
    private int nivelDificultad;
    private int recompensa;

    public Prueba(String descripcion, int nivelDificultad, int recompensa) {
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prueba{");
        sb.append("descripcion='").append(descripcion).append('\'');
        sb.append(", nivelDificultad=").append(nivelDificultad);
        sb.append(", recompensa=").append(recompensa);
        sb.append('}');
        return sb.toString();
    }

    public boolean resolver(Hechizo hechizo) {
        return hechizo.esEfectivo(this);
    }
}