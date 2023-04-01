package clase_19_intro_patrones.extra.abstract_factory.figuras_3d;

public abstract class Figura3D {

    // Atributo privado
    protected String nombre;

    // Método abstracto
    public abstract double calcularVolumen(double valor);

    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
