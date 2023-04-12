package clase_26_strategy.extra.strategy;

import clase_26_strategy.extra.strategy.transportes.TransporteStrategy;

public class Transporte {

    // Atributo obligatorio
    private TransporteStrategy transporteStrategy;

    // Método necesario
    public void transportar() {
        this.transporteStrategy.transportar();
    }

    // Getter (opcional)
    public TransporteStrategy getTransporteStrategy() {
        return transporteStrategy;
    }

    // Setter obligatorio
    public void setTransporteStrategy(TransporteStrategy transporteStrategy) {
        this.transporteStrategy = transporteStrategy;
    }
}
