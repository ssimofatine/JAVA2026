package tema4.Practica_Objetos_I;

public class Jugador {

    public static final int MAX_NIVEL = 10; // El nivel máximo es 10
    public static final int NIVEL_INICIAL = 1; // El nivel inicial es 1
    public static final int SALUD_INICIAL = 200; // La salud inicial es 200
    public static final int MAX_SALUD = 10000; // La MAx salud es 10000

    // Propiedades de Jugador
    private String nombre;
    private clase clase;
    private Integer nivel;
    private Integer experiencia;
    private double salud; // (inicialmente a 200)
    private Arma armaDerecha;
    private Arma armaIzquierda;

    // constructor

    public Jugador(String nombre, clase clase, Integer nivel, Integer experiencia, Integer salud, Arma armaDerecha, Arma armaIzquierda) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = NIVEL_INICIAL;// nivel por defecto 1
        this.experiencia = 0;// experiencia por defecto 0
        this.salud = SALUD_INICIAL; // salud por defecto 200
        this.armaDerecha = armaDerecha;
        this.armaIzquierda = armaIzquierda;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public clase getClase() {
        return clase;
    }

    public void setClase(clase clase) {
        this.clase = clase;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    // toString Con StringBuffer

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();
    }

    // Un método para subir de nivel

    public void subirNivel(){

        this.nivel = Math.min(MAX_NIVEL, this.nivel + 1); // protege max nivel
        this.salud += Math.pow(2.5, this.nivel);//  2.5 elevado a nivel

    }

    //  se puede poner el arma

    public boolean equipar(Arma arma){

        boolean equipar;

        if (arma.isDosManos() == false) {
            if (this.armaDerecha == null && this.armaIzquierda == null) {
                this.armaDerecha = arma;
                equipar = true;
            } else if (this.armaDerecha == null) {
                this.armaDerecha = arma;
                equipar = true;
            } else if (this.armaIzquierda == null) {
                this.armaIzquierda = arma;
                equipar = true;
            } else {
                equipar = false;
            }
        }


        /**
         * este arma para dos manos si o no
         * prueba Des Manos a ocupados o no ocupados
          */
        if (arma.isDosManos() ) {
            if (this.armaDerecha == null && this.armaIzquierda == null) {
                this.armaDerecha = arma;
                this.armaIzquierda = arma;
                equipar = true;
            } else {
                equipar = false;
            }
        }

        return equipar;
    }

    // Un método tomarPocion(int puntosS): método que sube la salud del jugador tanto como indica puntosS,
    //hasta un máximo de 10000.

    public void  tomarPocion(int puntosS){

        this.salud = Math.min(MAX_SALUD, this.salud + puntosS);
    }


    /**
     * Un método reducirVida(int puntosD): reduce la propia salud del jugador tanto como indica puntosD. Si la
     * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
     * devuelve true (muerto)
     * @param puntosD
     * @return
     */

    public boolean reducirVida(int puntosD){
        boolean vida;

        this.salud = this.salud - puntosD;
        if (this.salud == 0 || this.salud < 0) {
            this.salud = 0;
            System.out.println("El jugador (" + this.nombre + ") ha muerto :(" + " Salud Jugador es: " + this.salud);
            vida = true;
        }else  {
            vida = false;
        }
        return vida;
    }

    /**
     * Un método golpear(Monstruo monstruo): reduce la salud del monstruo tanto como sea el valor de la
     * propiedad puntosD de las armas que lleve equipada el jugador, si el arma es doble solo quita el valor de uno
     * de los brazos. Para reducir la salud debes llamar al método correspondiente reducirVida de la clase Monstruo.
     * Si del golpe matas a un monstruo tu experiencia sube 10 por el nivel del monstruo. Además, cada vez que tu
     * experiencia suba una centena (100, 200, 300, …) subes de nivel. El máximo de experiencia será por tanto
     * 1000.
     */

    public void golpear(Monstruo monstruo) {
        if (this.armaDerecha!= null) {
            monstruo.reducirVida(this.armaDerecha.getPuntosD());
            if (!this.armaDerecha.isDosManos() && this.armaIzquierda!= null) {
                monstruo.reducirVida(this.armaIzquierda.getPuntosD());
            }
        }
    }


}
