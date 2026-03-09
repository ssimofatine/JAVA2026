package tema6.Practica_Objetos_III;

public class CocheEstandar extends Coche{
    private boolean aireAcondicionado;

    public CocheEstandar(String marca, String modelo, String matricula, int anio, TipoCombustible combustible, TipoCoche tipo, Double precioBase, boolean aireAcondicionado) {
        super(marca, modelo, matricula, anio, combustible, tipo, precioBase);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CocheEstandar{");
        sb.append("aireAcondicionado=").append(aireAcondicionado);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        double precio = this.precioBase * dias;
        if (this.aireAcondicionado) {
            precio = precio + (5 * dias);
        }
        return precio;
    }


}
