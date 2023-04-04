package clase_26_strategy.extra.strategy.luces;

public class Taxi implements TransporteStrategy {

    // Atributo privado
    private String ruta;

    // Método obligatorio
    @Override
    public void transportar() {
        System.out.println("\nLlamar a un taxi");
        System.out.println("\nSubir al taxi");
        System.out.println("\nViajando al domicilio de destino");
        System.out.println("\nPagar pasaje");
        System.out.println("\nBajar del taxi");
    }
}
