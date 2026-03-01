package tema5.Practica_Objetos_II;

import java.util.ArrayList;
import java.util.List;

public class Granja {
    private String nombre;
    private String ubicacion;
    private double totalHorasOperacion;
    private List<Maquina> maquinas;

    public Granja(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.totalHorasOperacion = 0.0;
        this.maquinas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getTotalHorasOperacion() {
        return totalHorasOperacion;
    }

    public void setTotalHorasOperacion(double totalHorasOperacion) {
        this.totalHorasOperacion = totalHorasOperacion;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    protected void imprimirDatosGranja() {
        System.out.println("Granja: " + nombre + ", Ubicacion: " + ubicacion + ", Horas totales: " + totalHorasOperacion);
    }

    protected void addMaquina(Maquina m) {
        maquinas.add(m);
    }

    protected void calcularTotalHoras() {
        double suma = 0;
        for (int i = 0; i < maquinas.size(); i++) {
            suma += maquinas.get(i).getHorasUso();
        }
        this.totalHorasOperacion = suma;
    }

    @Override
    public String toString() {
        String texto = "Granja " + nombre + " maquinas: ";
        for (int i = 0; i < maquinas.size(); i++) {
            texto += maquinas.get(i).getModelo() + " ";
        }
        return texto;
    }

    protected Maquina buscarMaquinaPorId(int id) {
        for (int i = 0; i < maquinas.size(); i++) {
            if (maquinas.get(i).getId() == id) {
                return maquinas.get(i);
            }
        }
        return null;
    }
}
