package clase_26_strategy.extra.strategy;

import clase_26_strategy.extra.strategy.transportes.*;

public class DemoTransporte {
    public static void main(String[] args) {

        Transporte transporte = new Transporte();

        // Estrategias de transporte
        Taxi taxiDH       = new Taxi("DH-Taxi", "Terminal de autobuses");
        Autobus autobusDH = new Autobus("DH-Autobús", "DH Aeropuerto");
        Avion avionDH     = new Avion("DH-Avión", "Aeropuerto de destino");

        transporte.setTransporteStrategy(taxiDH);
        transporte.transportar();

        transporte.setTransporteStrategy(autobusDH);
        transporte.transportar();

        transporte.setTransporteStrategy(avionDH);
        transporte.transportar();
    }
}
