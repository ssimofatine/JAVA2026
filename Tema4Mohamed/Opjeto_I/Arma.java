package Tema4Mohamed.Opjeto_I;

public class Arma {
    /**
     * Clase Arma
     * Propiedades:
     * ● nombre
     * ● tipo (enum de ESPADA, HACHA, BASTON, ARCO)
     * ● puntosD (puntos de daño)
     * ● dosManos (boolean)
     * Métodos:
     * ● Constructor parametrizado con todas las propiedades.
     * ● Getters, setters y toString.
     */

    // Propiedades:

    private String nombre;
    private Tipo tipo;
    private Integer puntosD;
    private boolean dosManos;

    // Constructor parametrizado con todas las propiedades.


    public Arma(String nombre, Tipo tipo, boolean dosManos, Integer puntosD) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dosManos = dosManos;
        this.puntosD = puntosD;
    }

    // Getters, setters.


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    public boolean isDosManos() {
        return dosManos;
    }

    public void setDosManos(boolean dosManos) {
        this.dosManos = dosManos;
    }

    // ToString Con StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", dosManos=").append(dosManos);
        sb.append('}');
        return sb.toString();
    }
}
