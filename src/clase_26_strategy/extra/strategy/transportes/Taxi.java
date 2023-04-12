package clase_26_strategy.extra.strategy.transportes;

public class Taxi extends TransporteStrategy {

    public Taxi(String nombre, String destino) {
        super(nombre, destino);
    }

    // Definición del método obligatorio
    @Override
    public void transportar() {
        System.out.println("\nLlamar a un taxi");
        System.out.println("Subir al taxi");
        System.out.println("Viajando en " + this.getNombre() + " hasta " + this.getDestino());
        System.out.println("Pagar pasaje");
        System.out.println("Bajar del taxi");
    }
}
