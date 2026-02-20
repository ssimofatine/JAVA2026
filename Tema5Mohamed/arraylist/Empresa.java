package Tema5Mohamed.arraylist;
import java.util.ArrayList;

public class Empresa {

    /**
     * Propiedades de clase
     */

    private String nombre;
    private ArrayList<Empleado> empleados;

    /**
     * Constructor parametrizado
     */

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
    }

    /**
     * Getters y Setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Añade un empleado al ArrayList, al final
     * @param empleado
     */

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Busca un empleado en el ArrayList y lo elimina
     * @param empleado
     */

    public void removeEmpleado(Empleado empleado){
        empleados.remove(empleado);
    }
    /**
     * toString Con StringBuffer
     */

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empresa{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", empleados=").append(empleados);
        for (Empleado empleado : empleados) {
            sb.append(empleado).append('\n');
        }
        sb.append('}');
        return sb.toString();
    }
}
