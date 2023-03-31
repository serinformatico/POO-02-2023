package clase_25_observer.extra.observer;

public interface Subject {

    public void suscribir(Observer observer);
    public void desuscribir(Observer observer);
    public void notificar();
}
