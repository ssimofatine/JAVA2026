package tema6.examen.Practica_en_grupo;

public class Item {
    //Atributos
    private String nombre;
    private TipoItem tipo;
    private int valorCuracion;

    //Constructor


    public Item(String nombre, TipoItem tipo, int valorCuracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valorCuracion = valorCuracion;
    }




    // metodo void usar(Heroe heroe) : aplica la curación al héroe
    //curación pertenecientes heroe
    public void usar(Heroe heroe){
        heroe.curar(this.valorCuracion);

    }

    // Getters


    public String getNombre() {
        return nombre;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public int getValorCuracion() {
        return valorCuracion;
    }

    // Tostring con StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", valorCuracion=").append(valorCuracion);
        sb.append('}');
        return sb.toString();
    }


    // Metodo tipoE(tipo) con enum del tipo Enemigo

    private void tipoI(TipoItem tipo){

        switch (tipo){
            case POCION_PEQUENA:
                this.valorCuracion = 30;
                break;
            case POCION_GRANDE:
                this.valorCuracion = 60;
                break;
            case ELIXIR:
                this.valorCuracion = 100;
                break;
        }
    }
}
