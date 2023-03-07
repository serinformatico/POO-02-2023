package clase_08.extra.modificadores_en_la_herencia.privado;

public class Basquetbolista extends Deportista {

    // Atributos privados
    private int cantidadDeDoblesAnotados;
    private int cantidadDeTriplesAnotados;


    // Constructor
    public Basquetbolista(String nombre, String apellido) {
        // Nota: Tenemos que declarar mínimamente un constructor que reciba por
        // parámetros el nombre y apellido. Estos datos son estrictamente solicitados
        // por el constructor de la superclase. Se utiliza la palabra reservada "super",
        // para hecerle llegar a la superclase dichos datos.
        super(nombre, apellido);
    }


    // Métodos
    public void mostrarPremioTotal() {
        double premioPorDobles  = (cantidadDeDoblesAnotados * 3.0);
        double premioPorTriples = (cantidadDeDoblesAnotados * 7.0);
        double premioTotal      = (premioPorDobles + premioPorTriples);

        // Nota:Para acceder al nombre y apellido que está en la superclase, tenemos
        // que hacerlo por medio de los getters porque el atributo tiene acceso privado.
        System.out.println("El premio del basquetbolista " + this.getNombre() + " " + this.getApellido() + " es $" + premioTotal);
    }


    // Getters & Setter
    public int getCantidadDeDoblesAnotados() {
        return cantidadDeDoblesAnotados;
    }

    public void setCantidadDeDoblesAnotados(int cantidadDeDoblesAnotados) {
        this.cantidadDeDoblesAnotados = cantidadDeDoblesAnotados;
    }

    public int getCantidadDeTriplesAnotados() {
        return cantidadDeTriplesAnotados;
    }

    public void setCantidadDeTriplesAnotados(int cantidadDeTriplesAnotados) {
        this.cantidadDeTriplesAnotados = cantidadDeTriplesAnotados;
    }
}
