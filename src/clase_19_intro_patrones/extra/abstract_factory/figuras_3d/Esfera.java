package clase_19_intro_patrones.extra.abstract_factory.figuras_3d;

public class Esfera extends Figura3D {

    // Constructor
    public Esfera() {
        this.nombre = "Esfera";
    }

    @Override
    public double calcularVolumen(double radio) {
        // V = 4/3 πr³
        return ((4/3) * Math.PI * Math.pow(radio, 3));
    }
}