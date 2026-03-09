package tema6.Practica_Objetos_III;

public class CochePremium extends  Coche {
    private boolean gps;
    private boolean seguroExtra;

    public CochePremium(String marca, String modelo, String matricula, int anio, TipoCombustible combustible, TipoCoche tipo, Double precioBase, boolean gps, boolean seguroExtra) {
        super(marca, modelo, matricula, anio, combustible, tipo, precioBase);
        if (tipo != TipoCoche.DEPORTIVO && tipo != TipoCoche.FURGONETA) {
            this.tipo = TipoCoche.DEPORTIVO;
        }
        this.gps = gps;
        this.seguroExtra = seguroExtra;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isSeguroExtra() {
        return seguroExtra;
    }

    public void setSeguroExtra(boolean seguroExtra) {
        this.seguroExtra = seguroExtra;
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        double precio = (this.precioBase * 1.20) * dias;
        if (this.gps) {
            precio = precio + (10 * dias);
        }
        if (this.seguroExtra) {
            precio = precio + (15 * dias);
        }
        return precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CochePremium{");
        sb.append("gps=").append(gps);
        sb.append(", seguroExtra=").append(seguroExtra);
        sb.append('}');
        return sb.toString();
    }
}
