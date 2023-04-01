package clase_19_intro_patrones.extra.abstract_factory.figuras_3d;

public class Cubo extends Figura3D {

    // Constructor
    public Cubo() {
        this.nombre = "Cubo";
    }

    @Override
    public double calcularVolumen(double lado) {
        // V = a³
        return Math.pow(lado, 3);
    }
}
