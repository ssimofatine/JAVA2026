package tema6.examen.Tienda_Deportiva_Avanzada;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Tienda {
    //-List<Producto> inventario
    //-List<Compra> historialCompras.
    private List<Producto> inventario;
    private List<Compra> historialCompras;


    //Constructor


    public Tienda() {
        this.inventario = new ArrayList<>();
        this.historialCompras = new ArrayList<>();
    }

    //Getters Y Setters


    public List<Producto> getInventario() {
        return inventario;
    }

    public List<Compra> getHistorialCompras() {
        return historialCompras;
    }

    //ToString Con StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tienda{");
        sb.append("inventario=").append(inventario);
        sb.append(", historialCompras=").append(historialCompras);
        sb.append('}');
        return sb.toString();
    }

    // Metodo
    // void añadirProducto(Producto p)
   public void anadirProducto(Producto p){
       this.inventario.add(p);
   }

   //void eliminarProducto(String codigo)
    public void eliminarProducto(String codigo){
        for (int i = 0; i < inventario.size() ; i++) {
            if (inventario.get(i).getCodigo().equals(codigo)) {
                inventario.remove(i);
                break;
            }
        }
    }

    //void actualizarProducto(String codigo, double
    //nuevoPrecio, int nuevoStock)

    public void actualizarProducto(String codigo, double nuevoPrecio, int nuevoStock){
        for (Producto p : inventario){
            if (p.getCodigo().equals(codigo)) {
                ProductoBase pBase = (ProductoBase) p;
                pBase.setPrecio(nuevoPrecio);
                pBase.setStock(nuevoStock);
                break;
            }
        }
    }

    //void realizarCompra(String codigo, int cantidad)

    public void realizarCompra(String codigo, int cantidad) throws StockInsuficienteException{
        for (Producto p : inventario) {
            if (p.getCodigo().equals(codigo)) {
                ProductoBase pBase = (ProductoBase) p;
                if (pBase.getStock() >= cantidad && cantidad > 0 && pBase.getStock() > 0) {
                    pBase.descontarStock(cantidad);
                    Compra nuevaCompra = new Compra(LocalDate.now(), pBase, cantidad, pBase.getPrecio() * cantidad);
                    historialCompras.add(nuevaCompra);
                    break;
                } else if (pBase.getStock() < cantidad) {
                    throw new StockInsuficienteException("No hay suficiente stock para realizar la compra. " + codigo);
                }
            }
        }
    }

    //void mostrarInventario()
    public void mostrarInventario(){
        for (Producto p : inventario) {
            IO.println(p.getInfo());

        }
    }

    //void mostrarHistorialCompras()
    public void mostrarHistorialCompras(){
        for (Compra p : historialCompras) {
            IO.println(p.toString());
        }
    }

    
}
