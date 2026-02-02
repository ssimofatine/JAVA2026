package tema4.Practica_Objetos_I;

public class Monstruo {

    public static final int MAX_NIVEL = 10;
    public static final int NIVEL_INICIAL = 1;
    public static final int SALUD_INICIAL = 100;

    //Propiedades de Monstruo
    private String nombre;
    private clase1 clase1; //(enum de GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA)
    private Integer nivel;
    private double salud; //(inicialmente a 100)
    private Integer puntosD; //(puntos de daño que hace el monstruo al golpear)

    //Constructor

    public Monstruo(String nombre, clase1 clase1, Integer nivel, double salud, Integer puntosD) {
        this.nombre = nombre;
        this.clase1 = clase1;
        this.nivel = NIVEL_INICIAL;
        this.salud = SALUD_INICIAL;
        this.puntosD = puntosD;
    }


    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public clase1 getClase1() {
        return clase1;
    }

    public void setClase1(clase1 clase1) {
        this.clase1 = clase1;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }


    //toString Con StringBuffer


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase1=").append(clase1);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }

    // Un método para subir de nivel

    public void subirNivel(){

        this.nivel = Math.min(MAX_NIVEL, this.nivel + 1); // protege max nivel
        this.salud += Math.pow(2, this.nivel);//  2 elevado a nivel

    }

    /**
     * Un método reducirVida(int puntosD): reduce la propia salud del monstruo tanto como indica puntosD. Si la
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
            System.out.println("El Monstruo (" + this.nombre + ") ha muerto :(" + " Salud monstruo es: " + this.salud);
            vida = true;
        }else  {
            vida = false;
        }
        return vida;
    }

    /**
     * Un método golpear(Jugador jugador): reduce la salud del jugador tanto como sea el valor de la propiedad
     * puntosD del monstruo. Para reducir la salud debes llamar al método correspondiente de la clase Jugador.
     */

    public void golpear(Jugador jugador) {
        jugador.reducirVida(this.puntosD);
    }

}
