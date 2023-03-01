package clase_06.actividad_en_vivo.impresora.codigo;

import java.util.Date;

public class SolucionEjercicioGuiadoC06 {
    public static void main(String[] args) {

        /* Ejercicio: Ejercicio de codificación
            Modelar en UML y luego codificar en Java la clase Impresora.

            Las impresoras tienen un modelo, un tipo de conexión, ya que muchas son USB y otras
            inalámbricas. Poseen una fecha de fabricación y todas ellas saben la cantidad de hojas
            disponibles que tienen.
        */


        System.out.println(" ===== IMPRESORA 1 ===== ");
        Impresora impresora1 = new Impresora("HP1102", "USB");
        impresora1.setCantidadDeHojasDisponibles(10);
        impresora1.imprimir(8);
        impresora1.imprimir(3);

        System.out.println(" ===== IMPRESORA 2 ===== ");
        Impresora impresora2 = new Impresora("HP1102w", "WIFI");
        impresora1.setCantidadDeHojasDisponibles(10);
        impresora2.imprimir(2);
    }
}









