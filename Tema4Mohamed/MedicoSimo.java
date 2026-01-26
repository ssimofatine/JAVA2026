package Tema4Mohamed;

public class MedicoSimo {

    // Propiedades
    private String nombre;
    private Especialidad especialidad ;
    private Integer edad;
    private String email;
    private String telefono;
    private Estado estado;


    // Constructor con todo menos 'estado'. El estado por defecto es ACTIVO.
    public MedicoSimo(String nombre, Especialidad especialidad, Integer edad, String email, String telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.estado = Estado.ACTIVO;


    }


    // Getters de todo.
    public String getNombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public Estado getEstado() {
        return estado;
    }


    //Setters de todo menos 'estado'.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // ToString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MedicoSimo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", especialidad=").append(especialidad);
        sb.append(", edad=").append(edad);
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }



    // Metodos propios:
    // - baja() -> pone el estado en INACTIVO

    public void baja(int num) {
        if (num == 1) {
            if (this.estado == Estado.ACTIVO) {
                this.estado = Estado.INACTIVO;
            }
            System.out.println("Gracias pone Estado a INACTIVO es termine");

        }else if (num == 0) {
            System.out.println("Gracias no quiers pone Estado a INACTIVO");
        }
    }


    // - alta() -> pone el estado en ACTIVO

    public void alta(int num) {
        if (num == 1) {
            if (this.estado == Estado.INACTIVO) {
                this.estado = Estado.ACTIVO;
            }
            System.out.println("Gracias, pone Estado a ACTIVO es termine");

        }else if (num == 0) {
            System.out.println("Gracias, no quires pone Estado a ACTIVO");
        }
    }


}
