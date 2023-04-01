package clase_22_combinacion_de_patrones.sabado;

import clase_22_combinacion_de_patrones.sabado.productos.*;

public class ProductoFactoryMethodSingleton {
    private static ProductoFactoryMethodSingleton instancia = new ProductoFactoryMethodSingleton();

    private ProductoFactoryMethodSingleton () {   }

    public static ProductoFactoryMethodSingleton obtenerInstancia() {
        return ProductoFactoryMethodSingleton.instancia;
    }

    public Producto crearProducto(String tipo) {
        switch (tipo.toUpperCase()) {
            case "BOTON":
                return new Boton();
            case "HILO":
                return new Hilo();
            case "TELA":
                return new Tela();
            case "COMPOSITE":
                return new ProductoComposite();
            default:
                return null;
        }
    }
}
