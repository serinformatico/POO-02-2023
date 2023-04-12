package clase_26_strategy.extra.strategy.transportes;

public class Avion extends TransporteStrategy {

    public Avion(String nombre, String destino) {
        super(nombre, destino);
    }

    // Definición del método obligatorio
    @Override
    public void transportar() {
        System.out.println("\nIr al aeropuerto");
        System.out.println("Comprar pasaje");
        System.out.println("Hacer checkIn");
        System.out.println("Subir al avión");
        System.out.println("Viajando en " + this.getNombre() + " hasta " + this.getDestino());
        System.out.println("Bajar del avión");
    }
}
