package tema6.Practica_Objetos_III;

import java.util.Objects;

public abstract class Coche {
    private static long contador = 1;

    protected Long id;
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected int anio;
    protected TipoCombustible combustible;
    protected TipoCoche tipo;
    protected Double precioBase;
    protected boolean disponible;

    public Coche(String marca, String modelo, String matricula, int anio, TipoCombustible combustible, TipoCoche tipo, Double precioBase) {
        this.id = contador++;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio = anio;
        this.combustible = combustible;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.disponible = true;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }
    public TipoCombustible getCombustible() { return combustible; }
    public void setCombustible(TipoCombustible combustible) { this.combustible = combustible; }
    public TipoCoche getTipo() { return tipo; }
    public void setTipo(TipoCoche tipo) { this.tipo = tipo; }
    public Double getPrecioBase() { return precioBase; }
    public void setPrecioBase(Double precioBase) { this.precioBase = precioBase; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(id, coche.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Coche{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    public abstract double calcularPrecioAlquiler(int dias);
}
