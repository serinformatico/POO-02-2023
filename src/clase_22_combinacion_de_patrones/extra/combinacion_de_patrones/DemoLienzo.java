package clase_22_combinacion_de_patrones.extra.combinacion_de_patrones;

import clase_22_combinacion_de_patrones.extra.combinacion_de_patrones.componentes.*;

public class DemoLienzo {
    public static void main(String[] args) {

        GraficoFactoryMethodSingleton fabrica = GraficoFactoryMethodSingleton.obtenerInstancia();

        System.out.println("\nCirculo:");
        Circulo circulo = (Circulo) fabrica.crearGrafico("Circulo");
        circulo.setRadio(15);
        circulo.graficar();
        circulo.colorear("BLANCO");

        System.out.println("\nLínea:");
        Linea linea = (Linea) fabrica.crearGrafico("Linea");
        linea.setLargo(10);
        linea.setGrosor(1);
        linea.graficar();
        linea.colorear("MARRON");

        System.out.println("\nBocha de Helado:");
        Circulo bochaDeHelado = (Circulo) fabrica.crearGrafico("Circulo");
        bochaDeHelado.setRadio(3);
        bochaDeHelado.graficar();
        bochaDeHelado.colorear("BLANCO");

        System.out.println("\nCucurucho:");
        Triangulo cucurucho = (Triangulo) fabrica.crearGrafico("Triangulo");
        cucurucho.setAltura(10);
        cucurucho.setBase(3);
        cucurucho.graficar();
        cucurucho.colorear("MARRON");

        System.out.println("\nHelado de una bocha de sabor americana:");
        GraficoComposite heladoDeUnaBochaAmericana = new GraficoComposite();
        heladoDeUnaBochaAmericana.agregarGrafico(cucurucho);
        heladoDeUnaBochaAmericana.agregarGrafico(bochaDeHelado);
        heladoDeUnaBochaAmericana.graficar();

        Lienzo lienzo = new Lienzo();

        lienzo.agregarGrafico(heladoDeUnaBochaAmericana);
        lienzo.agregarGrafico(linea);
        lienzo.agregarGrafico(circulo);
    }
}
