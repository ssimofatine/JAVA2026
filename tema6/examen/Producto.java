package tema6.examen;

public class Producto implements Transportable {
    private String nombre;
    private double peso;
    private boolean envioInternacional;



    //Constructor
    public Producto(String nombre, double peso, boolean envioInternacional) {
        this.nombre = nombre;
        this.peso = peso;
        this.envioInternacional = envioInternacional;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean esEnvioInternacional() {
        return this.envioInternacional;
    }

    public void setEnvioInternacional(boolean envioInternacional) {
        this.envioInternacional = envioInternacional;
    }

    //toString Con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", peso=").append(peso);
        sb.append(", internacional=").append(envioInternacional);
        sb.append('}');
        return sb.toString();
    }


    // metodo del costo de envio internacional o no

    public double calcularCostoEnvio(boolean esInternacional){
        double costo = 20.0;

        if(esInternacional){
            costo += 30.0;
        }

        costo += (this.peso * 0.2);
        return costo;
    }
}
