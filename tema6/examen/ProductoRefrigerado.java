package tema6.examen;

public class ProductoRefrigerado extends Producto{
    // Attribution

    private Integer nivelRefrigeracion;

    // Constructor

    public ProductoRefrigerado(String nombre, double peso, boolean envioInternacional, Integer nivelRefrigeracion) {
        super(nombre, peso, envioInternacional);
        this.nivelRefrigeracion = nivelRefrigeracion;
    }

    // Getters Y Setters

    public Integer getNivelRefrigeracion() {
        return nivelRefrigeracion;
    }

    public void setNivelRefrigeracion(Integer nivelRefrigeracion) {
        this.nivelRefrigeracion = nivelRefrigeracion;
    }

    // ToString Con StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoRefrigerado{");
        sb.append("nivelRefrigeracion=").append(nivelRefrigeracion);
        sb.append('}');
        return sb.toString();
    }

    public double calcularCostoEnvio(boolean esInternacional){
        double costo = super.calcularCostoEnvio(esInternacional);
        if (this.nivelRefrigeracion == 1) {
            costo = costo + 10;
        } else if (this.nivelRefrigeracion == 2) {
            costo += 30;
        }
        return  costo;
    }
}
