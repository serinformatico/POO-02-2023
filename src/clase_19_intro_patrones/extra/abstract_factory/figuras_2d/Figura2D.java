package clase_19_intro_patrones.extra.abstract_factory.figuras_2d;

import java.util.ArrayList;

public abstract class Figura2D {

    // Atributo privado
    protected String nombre;

    // Método abstracto
    public abstract Double calcularArea(ArrayList<Double> params);

    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
