package clase_22_combinacion_de_patrones.extra.combinacion_de_patrones;

import clase_22_combinacion_de_patrones.extra.combinacion_de_patrones.componentes.*;

public class GraficoFactoryMethodSingleton {

    // Atributo estático privado
    private static GraficoFactoryMethodSingleton instancia = new GraficoFactoryMethodSingleton();

    // Constructor privado
    private GraficoFactoryMethodSingleton() { }

    // Método público responsable de retornar la instancia
    public static GraficoFactoryMethodSingleton obtenerInstancia(){
        return instancia;
    }

    // Método público responsable de crear objetos
    public Grafico crearGrafico(String nombreDeLGrafico) {
        switch (nombreDeLGrafico.toUpperCase()) {
            case "CIRCULO":
                return new Circulo();
            case "LINEA":
                return new Linea();
            case "TRIANGULO":
                return new Triangulo();
        }

        return null;
    }
}
