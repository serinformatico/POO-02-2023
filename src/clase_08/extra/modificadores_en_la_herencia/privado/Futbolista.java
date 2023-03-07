package clase_08.extra.modificadores_en_la_herencia.privado;

public class Futbolista extends Deportista {

    // Atributos privados
    private int cantidadDeGolesAnotados;


    // Constructor
    public Futbolista(String nombre, String apellido) {
        // Nota: Tenemos que declarar mínimamente un constructor que reciba por
        // parámetros el nombre y apellido. Estos datos son estrictamente solicitados
        // por el constructor de la superclase. Se utiliza la palabra reservada "super",
        // para hecerle llegar a la superclase dichos datos.
        super(nombre, apellido);
    }


    // Métodos
    public void mostrarPremio() {
        double premio = cantidadDeGolesAnotados * 25.0;

        // Nota:Para acceder al nombre y apellido que está en la superclase, tenemos
        // que hacerlo por medio de los getters porque el atributo tiene acceso privado.
        System.out.println("El premio del futbolista " + this.getNombre() + " " + this.getApellido() + " es $" + premio);
    }


    // Getters & Setter
    public int getCantidadDeGolesAnotados() {
        return cantidadDeGolesAnotados;
    }

    public void setCantidadDeGolesAnotados(int cantidadDeGolesAnotados) {
        this.cantidadDeGolesAnotados = cantidadDeGolesAnotados;
    }
}
