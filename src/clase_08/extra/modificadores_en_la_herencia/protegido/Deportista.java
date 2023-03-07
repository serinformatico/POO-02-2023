package clase_08.extra.modificadores_en_la_herencia.protegido;

public class Deportista {

    // Atributos protegidos
    protected String nombre;
    protected String apellido;
    protected int numeroDeCamiseta;


    // Constructor 1
    public Deportista(String nombre, String apellido) {
        this.nombre   = nombre;
        this.apellido = apellido;
    }


    // Constructor 2
    public Deportista(String nombre, String apellido, int numeroDeCamiseta) {
        this.nombre           = nombre;
        this.apellido         = apellido;
        this.numeroDeCamiseta = numeroDeCamiseta;
    }


    // Getters & Setter
    // Nota: Puede o No estar declarados. Las subclases acceden a los atributos de forma directa
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(int numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }
}
