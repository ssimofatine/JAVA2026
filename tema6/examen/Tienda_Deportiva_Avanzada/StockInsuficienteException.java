package tema6.examen.Tienda_Deportiva_Avanzada;

public class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException(String message) {
        super(message);
    }
}
