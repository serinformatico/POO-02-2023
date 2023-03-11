package clase_10.actividad_en_vivo.gimnasio.codigo;

import java.util.Objects;

public class Socio {

    // Atributos privados
    private int codigo;
    private String nombre;
    private String apellido;
    public static double valorDeLaCuotaMensual;
    private final double BONO_CONTRIBUCION_PORCENTUAL = 5.0;


    // Constructores (sobrecarga)
    public Socio(int codigo) {
        this.codigo = codigo;
    }

    public Socio(int codigo, String nombre, String apellido) {
        this.codigo   = codigo;
        this.nombre   = nombre;
        this.apellido = apellido;
    }


    // Métodos públicos definidos
    public double calcularCuotaMensual() {
        double cuotaMensualMasBono = Socio.valorDeLaCuotaMensual + (Socio.valorDeLaCuotaMensual / 100 * this.BONO_CONTRIBUCION_PORCENTUAL);

        return cuotaMensualMasBono;
    }

    public void pagarCuotaMensual(double monto) {
        if (this.calcularCuotaMensual() == monto) {
            System.out.println("La cuota se ha pagado satisfactoriamente.");
        } else {
            System.out.println("Monto incorrecto... La cuota no se ha pagado.");
        }
    }

    public void pagarCuotaMensual(double monto, double descuentoPromocional) {
        double valorDeLaCuotaMensualConDescuento = this.calcularCuotaMensual() - descuentoPromocional;

        if (valorDeLaCuotaMensualConDescuento == monto) {
            System.out.println("La cuota se ha pagado satisfactoriamente.");
        } else {
            System.out.println("Monto incorrecto... La cuota no se ha pagado.");
        }
    }


    // Métodos sobrescritos que son heredados de la clase Object (redefinición)
    @Override
    public String toString() {
        return  "código: "         + this.codigo + ", " +
                "nombre: "         + this.nombre + ", " +
                "apellido: "       + this.apellido + ", " +
                "cuota mensual: $" + this.valorDeLaCuotaMensual;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica que obj no es nulo y que es una clase del tipo socio
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            // realiza un casting de obj
            Socio s = (Socio) obj;

            // Determina la igualdad de los objetos por medio del código de socio
            return s.getCodigo() == this.getCodigo();
        }
    }

    @Override
    public int hashCode() {
        // Retorna un código hash único
        return Objects.hash(codigo, nombre, apellido, valorDeLaCuotaMensual, BONO_CONTRIBUCION_PORCENTUAL);
    }


    // Getters & Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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

    public double getBONO_CONTRIBUCION_PORCENTUAL() {
        return BONO_CONTRIBUCION_PORCENTUAL;
    }
}
