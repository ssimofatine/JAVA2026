package tema4.Practica_Objetos_I;
import java.util.ArrayList;
import java.util.List;

public class Mago {

    private String nombre;
    private int energia;
    private List<Hechizo> hechizos;

    public Mago(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.hechizos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public List<Hechizo> getHechizos() {
        return hechizos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mago{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append(", hechizos=").append(hechizos);
        sb.append('}');
        return sb.toString();
    }

    public void aprenderHechizo(Hechizo hechizo) {
        this.hechizos.add(hechizo);
    }

    public boolean lanzarHechizo(String nombreHechizo, Prueba prueba) {
        Hechizo hechizo = buscar(nombreHechizo);
        if (hechizo!= null && this.energia >= hechizo.getEnergiaNecesaria()) {
            this.energia -= hechizo.getEnergiaNecesaria();
            if (hechizo.esEfectivo(prueba)) {
                this.energia += prueba.getRecompensa();
                return true;
            } else {
                this.energia -= prueba.getNivelDificultad();
                return false;
            }
        } else {
            return false;
        }
    }

    public Hechizo buscar(String nombreHechizo) {
        for (Hechizo hechizo: hechizos) {
            if (hechizo.getNombre().equalsIgnoreCase(nombreHechizo)) {
                return hechizo;
            }
        }
        return null;
    }

    public void recargarEnergia(int cantidad) {
        this.energia += cantidad;
        if (this.energia > 100) {
            this.energia = 100;
        }
    }
}