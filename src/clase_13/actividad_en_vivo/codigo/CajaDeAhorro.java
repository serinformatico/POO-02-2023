package clase_13.actividad_en_vivo.codigo;

import java.util.Objects;

public class CajaDeAhorro extends Cuenta implements Comparable<CajaDeAhorro> {

    // Atributo estático privado
    private static double tasaDeInteres = 1.5;


    // Constructor
    public CajaDeAhorro(double saldo) {
        super(saldo);
    }


    // Definición del método depositarEfectivo() (está declarado en la superclase)
    public void depositarEfectivo(double monto) {
        this.saldo += monto;
        System.out.println("\nEn tu caja de ahorro has depositado $" + monto + " --> Saldo actual: $" + this.saldo);
    }


    // Definición del método extraerEfectivo() (está declarado en la superclase)
    public void extraerEfectivo(double monto) {
        if ((this.saldo + this.tasaDeInteres) >= monto) {
            this.saldo -= monto;
            System.out.println("\nDe tu caja de ahorro has extraído $" + monto + " --> Saldo actual: $" + this.saldo);
        }
        else {
            System.out.println("\nSaldo insuficiente");
        }
    }


    // Método definido
    public void cobrarIntereses() {
        this.saldo += this.saldo / 100 * CajaDeAhorro.tasaDeInteres;
        System.out.println("\nEn tu caja de ahorro has cobrado tus intereses. Saldo actual: $" + this.saldo);
    }


    // Método declarado en la interfaz (Comparable)
    @Override
    public int compareTo(CajaDeAhorro cajaDeAhorro) {
        if (this.saldo > cajaDeAhorro.getSaldo()) {
            return 1;
        } else if (this.saldo < cajaDeAhorro.getSaldo()) {
            return -1;
        } else {
            return 0;
        }
    }

    // Métodos heredados de la clase Object
    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        CajaDeAhorro cajaDeAhorro = (CajaDeAhorro) obj;
        return this.getCliente().getNumero() == cajaDeAhorro.getCliente().getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasaDeInteres);
    }


    // Método sobrescrito
    @Override
    public String toString() {
        return "\nCaja de Ahorro: " + super.toString() + ", tasa de interés=" + tasaDeInteres;
    }


    // Getter
    public double getTasaDeInteres() {
        return tasaDeInteres;
    }


    // Setter
    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }
}
