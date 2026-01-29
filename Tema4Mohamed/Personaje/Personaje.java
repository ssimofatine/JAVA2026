package Tema4Mohamed.Personaje;

public class Personaje {
    public static final int MAX_SALUD = 200;
    public static final int SALUD_INICIAL = MAX_SALUD / 4;

    // Crea un clase Personaje
    //  Debe tener las siguientes propiedades (privadas):
     private String nombre;
     private String clase;
     private Integer salud;
     private Integer mana;
    private Integer damage;
    private Integer nivel;

     // Crea un constructor que inicialice todas las propiedades


    public Personaje(String nombre, String clase, Integer mana, Integer damage, Integer nivel) {
        this.nombre = nombre;
        this.clase = clase;
        this.salud = Personaje.SALUD_INICIAL;
        this.mana = mana;
        this.damage = damage;
        this.nivel = nivel;
    }


    // Crea los métodos getters y setters para todas las propiedades


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    // Crea el toString para que pinte todas las propiedades (StringBuffer)

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", salud=").append(salud);
        sb.append(", mana=").append(mana);
        sb.append(", damage=").append(damage);
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }


    //  Crea un método void quitarSalud(int vida) que reste esa vida a la del personaje

    public void quitarSalud(int vida){

        this.salud = Math.max(0, this.salud - vida);

        if (this.salud == 0 && this.mana == 200) {
            this.salud = Personaje.MAX_SALUD;
        } else if (this.salud == 0 && this.mana == 0) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("El personaje (" + this.nombre + ") ha muerto :(");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        }else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("El personaje (" + this.nombre + ") Él todavía está vivo ): tiene salud : " + this.salud);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }

    // Crea un método void revivir() que ponga la vida a 100.

    public void revivir(){
        if (this.mana == 200) {
            this.salud = Personaje.SALUD_INICIAL;
        }

    }

    // Cuando el personaje ataque que quite vida en función del nivel

    public void ataque(Personaje enemigo){

        enemigo.quitarSalud((int) ( this.damage * ( 1 + this.nivel * 0.15 ) ));

    }

    // Subir nivel:

    public void subirNivel(){
       this.nivel++;
       this.salud = Math.min(Personaje.MAX_SALUD, this.salud + 20);
    }

    // baja mana
    public void bajaMana(){
        this.mana = 0;
    }

}
