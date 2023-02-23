package clase_02.playground;

public class SolucionEjercicioAsincrono1 {
    public static void main(String[] args) {

        /* Ejercicio 1: Calculadora
            Vamos a crear nuestras primeras funciones.
            Tenemos la clase Calculadora que por ahora solo va trabajar con nuestro tipo primitivo int.
            Tenemos que crearle cuatro funciones a nuestra calculadora sumar, restar, dividir y multiplicar.
            La función sumar ya te la declaramos solo te falta completarla.
        */

        System.out.println(sumar(10, 5));
        System.out.println(restar(10, 5));
        System.out.println(dividir(10, 5));
        System.out.println(multiplicar(10, 5));
    }

    public static int sumar(int a, int b) {
        return a+b;
    }

    public static int restar(int a, int b) {
        return a-b;
    }

    public static int dividir(int a, int b) {
        return a/b;
    }

    public static int multiplicar(int a, int b) {
        return a*b;
    }

}
