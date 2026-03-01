package tema5.Practica_Objetos_II;

public abstract class Maquina implements Operable {
    private int id;
    private String modelo;
    private int estado;
    private float horasUso;

    public Maquina(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        this.estado = APAGADA;
        this.horasUso = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public float getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(float horasUso) {
        this.horasUso = horasUso;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Maquina maquina = (Maquina) obj;
        return id == maquina.id;
    }

    @Override
    public String toString() {
        return "Maquina{id=" + id + ", modelo='" + modelo + "', estado=" + estado + ", horasUso=" + horasUso + "}";
    }

    public void trabajar(float horas) {
        if (this.estado == ENCENDIDA) {
            this.horasUso += horas;
        }
    }

    @Override
    public void encender() {
        this.estado = ENCENDIDA;
    }

    @Override
    public void apagar() {
        this.estado = APAGADA;
    }

    @Override
    public void ponerEnMantenimiento() {
        this.estado = MANTENIMIENTO;
    }

    public abstract String imprimirTipo();
}
