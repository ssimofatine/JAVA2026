package Tema4Mohamed.Cballo;

public class CaballoSimo {
    private String nombre;
    private String color;
    private int edad;
    private int casillasRecorridas;

    /**
     * Constructor de caballo
     * este metodo de Constructor de calse CaballoSimo
     * @param nombre
     * @param color
     * @param edad
     */

    public CaballoSimo(String nombre, String color, int edad){
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.casillasRecorridas = casillasRecorridas = 0;
    }

    /**
     * este metodo de forma calcular con (math.random)
     * por ejemplo casillasRecorridas tiene 0 y luego generat numero con math.random Ahora casillasRecorridas tiene numero 0 + 2 = 2 y ya esta
     * @return
     */
    public int correr(){
        this.casillasRecorridas += (int) (Math.random() * (6) + 1);
        return this.casillasRecorridas;
    }


    /**
     * este methods de pintar resultado de caballo y casillasRecorridas con Number y ya Esta
     */
    public void pintarCaballo(){
        System.out.println("Nombre: " + this.nombre + " acaba en la casilla: " + this.casillasRecorridas);
    }

}
