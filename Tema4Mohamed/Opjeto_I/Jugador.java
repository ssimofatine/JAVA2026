package Tema4Mohamed.Opjeto_I;

public class Jugador {


    public static final int Salud_inicial = 200;
    public static final int Salud_maximo = 10000;
    public static final int Nivel_inicial = 1;
    public static final int Nivel_maximo = 10;
    public static final int Experiencia_inicial = 0;
    public static final int Experiencia_maximo = 1000;


    /**
     * Clase Jugador
     * Propiedades:
     * ● nombre
     * ● clase (enum de MAGO, BRUJO, BARBARO, CABALLERO)
     * ● nivel
     * ● experiencia
     * ● salud (inicialmente a 200)
     * ● Arma armaDerecha
     * ● Arma armaIzquierda
     * Métodos:
     * ● Debes hacer el constructor parametrizado, menos nivel que será por defecto 1, salud por defecto 200,
     * experiencia 0 por defecto, ni las armas que serán null.
     * ● Getters, setters y toString.
     * ● Un método para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2.5 elevado a
     * nivel. El nivel máximo es 10.
     * ● Un método equipar(Arma arma). Si están libres el arma derecha o izquierda, asignará esa arma a uno de los
     * dos y devolverá true. Si están ocupados los dos devolverá false pues no se puede poner el arma. Si lo que
     * intentas equipar es un arma a dos manos, solo se puede poner si están los dos brazos libres, y se pone la
     * misma arma en los brazos. Se empieza equipando por la derecha.
     * ● Un método tomarPocion(int puntosS): método que sube la salud del jugador tanto como indica puntosS,
     * hasta un máximo de 10000.
     * ● Un método reducirVida(int puntosD): reduce la propia salud del jugador tanto como indica puntosD. Si la
     * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
     * devuelve true (muerto).
     * ● Un método golpear(Monstruo monstruo): reduce la salud del monstruo tanto como sea el valor de la
     * propiedad puntosD de las armas que lleve equipada el jugador, si el arma es doble solo quita el valor de uno
     * de los brazos. Para reducir la salud debes llamar al método correspondiente reducirVida de la clase Monstruo.
     * Si del golpe matas a un monstruo tu experiencia sube 10 por el nivel del monstruo. Además, cada vez que tu
     * experiencia suba una centena (100, 200, 300, …) subes de nivel. El máximo de experiencia será por tanto
     * 1000.
     * A modo de ayuda te pongo cómo sería una parte del método golpear:
     */

    // Propiedades:

    private String nombre;
    private Clase clase;
    private Integer nivel;
    private Integer experiencia;
    private double salud;
    private Arma armaDerecha;
    private Arma armaIzquierda;


    // Constructor


    public Jugador(String nombre, Clase clase, Integer nivel, Integer experiencia, Integer salud, Arma armaDerecha, Arma armaIzquierda) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = Nivel_inicial;
        this.experiencia = Experiencia_inicial;
        this.salud = Salud_inicial;
        this.armaDerecha = armaDerecha;
        this.armaIzquierda = armaIzquierda;
    }

    // Getters, setters.


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
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

    public void setSalud(double salud) {
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

    // ToString Con StringBuffer


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

    //Un método para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2.5 elevado a
    //nivel. El nivel máximo es 10.

    public void subirNivel(){
        this.nivel += 1;
        this.salud += 2.5;
        if (this.nivel > Nivel_maximo){
            this.nivel = Nivel_maximo;
            System.out.println("Has llegado al nivel máximo");
        }

    }

    //Un método equipar(Arma arma). Si están libres el arma derecha o izquierda,
    //asignará esa arma a uno de los dos y devolverá true. Si están ocupados los dos devolverá false
    //pues no se puede poner el arma. Si lo que intentas equipar es un arma a dos manos,
    //solo se puede poner si están los dos brazos libres, y se pone la misma arma en los brazos.
    //Se empieza equipando por la derecha

    public boolean equipar(Arma arma){
        boolean equipqr = false;

        if (!arma.isDosManos()) {
            if (this.armaDerecha == null && this.armaIzquierda == null) {
                this.armaDerecha = arma;
                equipqr = true;
            } else if (this.armaDerecha == null) {
                this.armaDerecha = arma;
                equipqr = true;
            } else if (this.armaIzquierda == null) {
                this.armaIzquierda = arma;
                equipqr = true;
            }
        }else {
            if (this.armaDerecha == null && this.armaIzquierda == null){
                this.armaDerecha = arma;
                this.armaIzquierda = arma;
                equipqr = true;
            }
        }
        return equipqr;
    }

    //Un método tomarPocion(int puntosS):
    //método que sube la salud del jugador tanto como indica puntosS, hasta un máximo de 10000

    public void tomarPocion(int puntosS){
        this.salud += puntosS;
        if (this.salud > Salud_maximo){
            this.salud = Salud_maximo;
            System.out.println("Has llegado al máximo de salud");
        }
    }

    //Un método reducirVida(int puntosD):
    //reduce la propia salud del jugador tanto como indica puntosD. Si la salud no es cero tras restar
    //devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se devuelve
    //true (muerto)

    public boolean reducirVida(int puntosD){
        boolean reducir = false;
        if (this.salud > 0) {
            this.salud -= puntosD;
        } else if (this.salud <= 0) {
            this.salud = 0;
            System.out.println("Has muerto");
            reducir = true;
        }
        return reducir;
    }

    //Un método golpear(Monstruo monstruo): reduce la salud del monstruo tanto como sea el valor de la
    //propiedad puntosD de las armas que lleve equipada el jugador, si el arma es doble solo quita el valor de uno
    //de los brazos. Para reducir la salud debes llamar al método correspondiente reducirVida de la clase Monstruo.
    //Si del golpe matas a un monstruo tu experiencia sube 10 por el nivel del monstruo. Además, cada vez que tu
    //experiencia suba una centena (100, 200, 300, …) subes de nivel. El máximo de experiencia será por tanto
    //1000.
    //A modo de ayuda te pongo cómo sería una parte del método golpear:




}