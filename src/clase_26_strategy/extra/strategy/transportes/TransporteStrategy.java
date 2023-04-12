package clase_26_strategy.extra.strategy.transportes;

public abstract class TransporteStrategy {

    // Atributo privado
    private String nombre;
    private String destino;

    public TransporteStrategy(String nombre, String destino) {
        this.nombre  = nombre;
        this.destino = destino;
    }

    // Método abstracto
    public abstract void transportar();

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
