package tema6.examen.Tienda_Deportiva_Avanzada;

public abstract class  ProductoBase implements Producto {
    //Atributos comunes:
    //• codigo, nombre, precio y stock

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    //Constructor


    public ProductoBase(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Getters Y Setters


    @Override
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //ToString Con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoBase{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }

    // descontarStock()
    public void descontarStock(int cantidad) {
        this.stock -= cantidad;
    }
    // getInfo()
    public abstract String getInfo();
}
