package clase_25_observer.actividad_en_vivo;

public interface Subject {

    public void agregar(Observer observer);
    public void eliminar(Observer observer);
    public void notificar();
}
