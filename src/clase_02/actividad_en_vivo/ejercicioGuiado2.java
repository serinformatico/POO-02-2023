package clase_02.actividad_en_vivo;

    /*
        Se necesita desarrollar un programa que calcule el margen de ganancia entre
        el valor de compra y la reventa. Se debe mostrar por consola las siguientes líneas:
            Ingresa el valor de compra
            -> 1000
            Ingresa el valor de reventa
            -> 1500
            El margen de ganancia es $500
            El margen de ganancia porcentual es %50

        Nota: Emplear dos funciones.
    */

import java.util.Scanner;

public class ejercicioGuiado2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor de compra");
        double valorDeCompra = scanner.nextDouble();

        System.out.println("Ingresa el valor de reventa");
        double valorDeVenta = scanner.nextDouble();

        double margenDeGanancia = calcularMargenDeGanancia(valorDeVenta, valorDeCompra);
        double margenDeGananciaPorcentual = calcularMargenDeGananciaPorcentual(valorDeCompra, margenDeGanancia);

        System.out.println("El margen de ganancia es $" + margenDeGanancia);
        System.out.println("El margen de ganancia porcentual es %" + margenDeGananciaPorcentual);
    }

    public static double calcularMargenDeGanancia(double valorDeVenta, double valorDeCompra) {
        return valorDeVenta - valorDeCompra;
    }

    public static double calcularMargenDeGananciaPorcentual(double valorDeCompra, double margenDeGanancia) {
        return (100 / valorDeCompra) * margenDeGanancia;
    }
}
