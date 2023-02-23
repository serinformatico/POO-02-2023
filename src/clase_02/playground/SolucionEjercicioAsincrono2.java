package clase_02.playground;

public class SolucionEjercicioAsincrono2 {
    public static void main(String[] args) {

        /* Ejercicio 2: Es Divisible
            Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La función debe
            comprobar si el primer número es divisible por el segundo.
            NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin decimales.
        */

        System.out.println(esDivisible(5, 2));
    }

    public static boolean esDivisible(int numero1, int numero2) {
        int modulo = (numero1 % numero2);
        return (modulo == 0);
    }
}
