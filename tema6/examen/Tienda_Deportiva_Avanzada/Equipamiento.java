package tema6.examen.Tienda_Deportiva_Avanzada;

public class Equipamiento extends ProductoBase {
    //Atributos adicionales:
    //• Por ejemplo, String deporte o String marca.
    private String deporte;
    private String marca;

    //Constructor

    public Equipamiento(String codigo, String nombre, double precio, int stock, String deporte, String marca) {
        super(codigo, nombre, precio, stock);
        this.deporte = deporte;
        this.marca = marca;
    }
    //Getters Y Setters

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //ToString Con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipamiento{");
        sb.append("deporte='").append(deporte).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // getInfo()
    public String getInfo() {
        String mensaje;
        mensaje = "Los Datos : " + "Nombre: " + getNombre() + " Precio: " + getPrecio() + " Stock: " + getStock() + " Deporte: " + getDeporte() + " Marca: " + getMarca();
        return mensaje;
    }
}
