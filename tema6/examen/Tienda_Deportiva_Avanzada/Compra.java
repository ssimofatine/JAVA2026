package tema6.examen.Tienda_Deportiva_Avanzada;
import java.time.LocalDate;
public class Compra {
    // Atributos:
    //• LocalDate fecha (o una cadena con la fecha)
    //• Producto producto
    //• int cantidad
    //• double precioTotal

    private LocalDate fecha;
    private Producto producto;
    private int cantidad;
    private double precioTotal;

    //Constructor


    public Compra(LocalDate fecha, Producto producto, int cantidad, double precioTotal) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    //Getters Y Setters


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    //ToString Con StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("fecha=").append(fecha);
        sb.append(", producto=").append(producto);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }
}
