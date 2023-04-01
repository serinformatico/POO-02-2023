package clase_20_state.extra.state;

public class DemoSemaforo {
    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo();

        semaforo.alcanzarLuzVerde();
        semaforo.alcanzarLuzVerde();
        semaforo.alcanzarLuzRoja();
        semaforo.alcanzarLuzRoja();
        semaforo.alcanzarLuzRoja();
    }
}
