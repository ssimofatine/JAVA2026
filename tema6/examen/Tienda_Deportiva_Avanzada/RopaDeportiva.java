package tema6.examen.Tienda_Deportiva_Avanzada;

public class RopaDeportiva extends ProductoBase{
    //Atributos adicionales:
    //• Por ejemplo, String talla y String material.
    private String talla;
    private String material;

    //Constructor

    public RopaDeportiva(String codigo, String nombre, double precio, int stock, String talla, String material) {
        super(codigo, nombre, precio, stock);
        this.talla = talla;
        this.material = material;
    }
    //Getters Y Setters


    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //ToString Con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RopaDeportiva{");
        sb.append("talla='").append(talla).append('\'');
        sb.append(", material='").append(material).append('\'');
        sb.append('}');
        return sb.toString();
    }
    // getInfo()
    public String getInfo() {
        String mensaje;
        mensaje = "Los Datos : " + "Nombre: " + getNombre() + " Precio: " + getPrecio() + " Stock: " + getStock() + " Talla: " + getTalla() + " Material: " + getMaterial();
        return mensaje;
    }
}
