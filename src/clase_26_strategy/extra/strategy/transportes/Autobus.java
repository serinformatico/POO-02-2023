package clase_26_strategy.extra.strategy.transportes;

public class Autobus extends TransporteStrategy {

    public Autobus(String nombre, String destino) {
        super(nombre, destino);
    }

    // Definición del método obligatorio
    @Override
    public void transportar() {
        System.out.println("\nIr a la terminal de autobuses");
        System.out.println("Comprar pasaje");
        System.out.println("Subir al autobús");
        System.out.println("Viajando en " + this.getNombre() + " hasta " + this.getDestino());
        System.out.println("Bajar del autobús");
    }
}
