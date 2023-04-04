package clase_23_pre_evaluacion.actividad_en_vivo;

import clase_23_pre_evaluacion.actividad_en_vivo.ofertas.*;

public class OfertaAcademicaFactoryMethodSingleton {

    private static OfertaAcademicaFactoryMethodSingleton instancia = new OfertaAcademicaFactoryMethodSingleton();

    private OfertaAcademicaFactoryMethodSingleton() {}

    public static OfertaAcademicaFactoryMethodSingleton obtenerInstancia() {
        return OfertaAcademicaFactoryMethodSingleton.instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String tipo) {
        switch (tipo.toUpperCase()) {
            case "CURSO":
                return new Curso();
            case "CARRERA":
                return new CarreraComposite();
        }

        return null;
    }
}
