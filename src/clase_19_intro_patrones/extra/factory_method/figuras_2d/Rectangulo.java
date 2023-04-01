package clase_19_intro_patrones.extra.factory_method.figuras_2d;

import java.util.ArrayList;

public class Rectangulo extends Figura2D {

    // Constructor
    public Rectangulo() {
        this.nombre = "Rectángulo";
    }

    @Override
    public Double calcularArea(ArrayList<Double> params) {
        if (params.size() != 2) return 0.0;

        double lado1 = params.get(0);
        double lado2 = params.get(1);

        return (lado1 * lado2);
    }
}
