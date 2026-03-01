package tema6.examen;

public class ProductoFragil extends Producto{
    // Atributo
    private Integer nivelFragil;

    //Constructor

    public ProductoFragil(String nombre, double peso, boolean internacional, Integer nivelFragil) {
        super(nombre, peso, internacional);
        this.nivelFragil = nivelFragil;
    }

    // Setters Y Getters


    public Integer getNivelFragil() {
        return nivelFragil;
    }

    public void setNivelFragil(Integer nivelFragil) {
        this.nivelFragil = nivelFragil;
    }

    // ToString Con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoFragil{");
        sb.append("nivelFragil=").append(nivelFragil);
        sb.append('}');
        return sb.toString();
    }

    //

    public double calcularCostoEnvio(boolean esInternacional){
        double costo = super.calcularCostoEnvio(esInternacional);
        if (this.nivelFragil == 1){
            costo = costo + 20;
            IO.println("Costo enviado para nivel frágil: " + costo);
        } else if (this.nivelFragil == 2) {
            costo = costo + 50;
            IO.println("Costo enviado para nivel muy frágil: " + costo);
        }
        return costo;
    }
}
