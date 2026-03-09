package tema6.Practica_Objetos_III;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements  Enviable {
    private static long contador = 1;

    public int diasCaluclar() {
        int dias = (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        if (dias <= 0) {
            dias = 1;
        }
        return dias;
    }

    private Long id;
    private Cliente cliente;
    private Coche coche;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioTotal;

    public Alquiler(Cliente cliente, Coche coche, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = contador++;
        this.cliente = cliente;
        this.coche = coche;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

        int dias = diasCaluclar();
        this.precioTotal = coche.calcularPrecioAlquiler(dias);
    }

    public static long getContador() {
        return contador;
    }

    public static void setContador(long contador) {
        Alquiler.contador = contador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void cancelarAlquiler() {
        this.coche.setDisponible(true);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alquiler{");
        sb.append("id=").append(id);
        sb.append(", cliente=").append(cliente);
        sb.append(", coche=").append(coche);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String crearEmail() {
        return "Alquiler de " + cliente.getNombre() + " | Coche: " + coche.getMatricula() + " | Total: " + precioTotal;
    }
}
