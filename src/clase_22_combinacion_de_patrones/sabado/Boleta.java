package clase_22_combinacion_de_patrones.sabado;

import clase_22_combinacion_de_patrones.sabado.productos.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Boleta {

    // Atributos privados
    private ArrayList<Producto> productos = new ArrayList();
    private boolean estaPagada            = false;
    private LocalDate fecha;

    // Métodos públicos
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public String mostrarProductos() {
        String productosAMostrar = "";

        for (Producto p : this.productos) {
            productosAMostrar += p.toString();
        }

        return productosAMostrar;
    }

    public double calcularTotal() {
        double total = 0;

        for (Producto p : this.productos) {
            total += p.calcularPrecio();
        }

        return total;
    }

    public double calcularTotal(double descuento) {
        double total = 0;

        for (Producto p : this.productos) {
            if (p instanceof ProductoComposite) {
                ProductoComposite composite = (ProductoComposite) p;
                total += composite.calcularPrecio(descuento);
            } else {
                total += p.calcularPrecio();
            }
        }

        return total;
    }

    public void finalizar() {
        if (this.productos.size() > 0) {
            this.fecha      = LocalDate.now();
            this.estaPagada = true;
        }
    }

    // Getters
    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public boolean getEstaPagada() {
        return this.estaPagada;
    }
}
