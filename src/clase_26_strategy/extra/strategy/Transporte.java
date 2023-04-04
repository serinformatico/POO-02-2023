package clase_26_strategy.extra.strategy.transportes;

public class Autobus implements TransporteStrategy {

    // Atributo privado
    private String ruta;

    // Método obligatorio
    @Override
    public void transportar() {
        System.out.println("\nIr a la terminal de autobuses");
        System.out.println("\nComprar pasaje");
        System.out.println("\nSubir al autobús");
        System.out.println("\nViajando hasta la terminal de destino");
        System.out.println("\nBajar del autobús");
    }
}
