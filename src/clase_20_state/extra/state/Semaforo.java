package clase_20_state.extra.state;

import clase_20_state.extra.state.luces.*;

public class Semaforo {

    // Atributo privado
    private SemaforoState estado;

    // Constructor
    public Semaforo() {
        this.estado = new LuzRoja(this);
    }

    // Métodos puentes
    public void alcanzarLuzVerde() {
        estado.alcanzarLuzVerde();
    }

    public void alcanzarLuzRoja() {
        estado.alcanzarLuzRoja();
    }

    // Getters & Setters
    public SemaforoState getEstado() {
        return estado;
    }

    public void setEstado(SemaforoState estado) {
        this.estado = estado;
    }
}
