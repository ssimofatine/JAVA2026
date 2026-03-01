package tema5.Practica_Objetos_II;

public interface Operable {
    int APAGADA = 0;
    int ENCENDIDA = 1;
    int MANTENIMIENTO = 2;

    void encender();
    void apagar();
    void ponerEnMantenimiento();
}
