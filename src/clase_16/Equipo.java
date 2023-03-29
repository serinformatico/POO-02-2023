package clase_16;

import java.util.ArrayList;
import java.util.LinkedList;

public class Equipo {
    private String nombre;
    private LinkedList<Jugador> jugadores = new LinkedList();

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares() {
        for (Jugador item : this.jugadores) {
            if (item.getEsTitular()) {
                System.out.println(item.toString());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(LinkedList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
