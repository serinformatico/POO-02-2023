package clase_22_combinacion_de_patrones.extra.combinacion_de_patrones;

public class BaseDeDatosSingleton {

    // Atributo estático privado
    private static BaseDeDatosSingleton instancia = new BaseDeDatosSingleton();

    // Constructor privado
    private BaseDeDatosSingleton() { }

    // Métodos públicos
    public static BaseDeDatosSingleton obtenerInstancia(){
        return instancia;
    }

    public String abrirConexion(){
        return "Conexion abierta.";
    }

    public String cerrarConexion(){
        return "Conexion cerrada.";
    }
}
