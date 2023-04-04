package clase_26_strategy.extra.strategy.luces;

public class Avion implements TransporteStrategy {

    // Atributo privado
    private String ruta;

    // Método obligatorio
    @Override
    public void transportar() {
        System.out.println("\nIr al aeropuerto");
        System.out.println("\nComprar pasaje");
        System.out.println("\nHacer checkIn");
        System.out.println("\nSubir al avión");
        System.out.println("\nViajando hasta el aeropuerto de destino");
        System.out.println("\nBajar del avión");
    }
}
