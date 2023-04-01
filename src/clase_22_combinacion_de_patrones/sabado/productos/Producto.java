package clase_22_combinacion_de_patrones.sabado.productos;

public abstract class Producto {

    // Atributos privados
    private String nombre;
    private String color;
    private double costo;

    // Atributo constante
    private final double PORCENTAJE_DE_GANANCIA = 30.0;

    // Método público
    public double calcularPrecio() {
        return this.getCosto() + (this.getCosto() / 100 * this.getPORCENTAJE_DE_GANANCIA());
    }

    @Override
    public String toString() {
        return "Producto: nombre " + this.nombre + ", color " + this.color + ", costo $" + this.costo + ", MARGEN_DE_GANANCIA $" + this.PORCENTAJE_DE_GANANCIA;
    }

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return this.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPORCENTAJE_DE_GANANCIA() {
        return this.PORCENTAJE_DE_GANANCIA;
    }
}
