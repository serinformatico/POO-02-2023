package clase_22_combinacion_de_patrones.sabado;

import clase_22_combinacion_de_patrones.sabado.productos.Producto;

import java.util.ArrayList;

public class ProductoComposite extends Producto{
    private ArrayList<Producto> productos = new ArrayList<>();
    private double manoDeObra;

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public double calcularPrecio() {
        double precio = 0;

        for (Producto p : this.productos) {
            precio += p.calcularPrecio();
        }

        return precio + this.manoDeObra;
    }

    public double calcularPrecio(double porcentajeDeDescuento) {
        double precioConDescuento = this.calcularPrecio() - (this.calcularPrecio()/100*porcentajeDeDescuento);
        return precioConDescuento;
    }



    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getManoDeObra() {
        return manoDeObra;
    }

    public void setManoDeObra(double manoDeObra) {
        this.manoDeObra = manoDeObra;
    }
}
