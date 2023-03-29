package clase_16;

public class Jugador implements Comparable<Jugador> {
    private int numeroDeCamiseta;
    private String nombre;
    private boolean estaLesionado;
    private boolean esTitular;

    @Override
    public int compareTo(Jugador jugador) {
        if (this.numeroDeCamiseta > jugador.getNumeroDeCamiseta()) {
            return 1;
        } else if (this.numeroDeCamiseta < jugador.getNumeroDeCamiseta()) {
            return -1;
        }
        return 0;
    }


    public int getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(int numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstaLesionado() {
        return estaLesionado;
    }

    public void setEstaLesionado(boolean estaLesionado) {
        this.estaLesionado = estaLesionado;
    }

    public boolean getEsTitular() {
        return esTitular;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numeroDeCamiseta=" + numeroDeCamiseta +
                ", nombre='" + nombre + '\'' +
                ", estaLesionado=" + estaLesionado +
                ", esTitular=" + esTitular +
                '}';
    }
}
