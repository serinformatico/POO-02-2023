package clase_12.actividad_en_vivo.codigo;

import java.lang.reflect.Array;

public class Demo {
    public static void main(String[] args) {

        Motor motor1 = new Motor();
        motor1.setPotenciaEnCv(140);
        motor1.setPotenciaEnCv(2000);

        Accesorio pantalla = new Accesorio();
        pantalla.setTipo("Pantalla 8\"");
        pantalla.setColor("Gris");

        Accesorio camaraDeEstacionamiento = new Accesorio();
        camaraDeEstacionamiento.setTipo("Cámara de estacionamiento");
        camaraDeEstacionamiento.setColor("Negra");

        Accesorio[] accesorios = new Accesorio[10];
        accesorios[0] = pantalla;
        accesorios[1] = camaraDeEstacionamiento;

        Coche coche1 = new Coche("Ford", "Fiesta", motor1);
        coche1.setAccesorios(accesorios);

        coche1.avanzar();
        coche1.avanzar(2);
    }
}
