package tema6.Practica_Objetos_III;

import java.time.LocalDate;

public class Cliente extends Personaje{
    private String licenciaConducir;
    private LocalDate fechaObtencionLicencia;

    public Cliente(String nombre, String apellidos, String dni, String email, String direccion, String telefono, String licenciaConducir, LocalDate fechaObtencionLicencia) {
        super(nombre, apellidos, dni, email, direccion, telefono);
        this.licenciaConducir = licenciaConducir;
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    public Cliente(Cliente c) {
        super(c.getNombre(), c.getApellidos(), c.getDni(), c.getEmail(), c.getDireccion(), c.getTelefono());
        this.licenciaConducir = c.getLicenciaConducir();
        this.fechaObtencionLicencia = c.getFechaObtencionLicencia();
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public LocalDate getFechaObtencionLicencia() {
        return fechaObtencionLicencia;
    }

    public void setFechaObtencionLicencia(LocalDate fechaObtencionLicencia) {
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("licenciaConducir='").append(licenciaConducir).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
