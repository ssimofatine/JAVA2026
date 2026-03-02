package tema6.examen.Tienda_Deportiva_Avanzada;

public interface Producto {
    /**
     * Métodos a implementar:
     * • String getCodigo()
     * • String getNombre()
     * • double getPrecio()
     * • int getStock()
     * • void descontarStock(int cantidad)
     * • String getInfo() // Devuelve información detallada
     */
    String getCodigo();
    String getNombre();
    double getPrecio();
    int getStock();
    void descontarStock(int cantidad);
    String getInfo();

}