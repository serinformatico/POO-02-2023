package clase_08.extra.modificadores_en_la_herencia.protegido.otro_paquete;

import clase_08.extra.modificadores_en_la_herencia.protegido.Futbolista;
import clase_08.extra.modificadores_en_la_herencia.protegido.Basquetbolista;

public class DemoHerenciaConAtributosProtegidosDesdeOtroPaquete {
    public static void main(String[] args) {

        Futbolista jugadorDeFutbol = new Futbolista("Juan", "Pérez");
        jugadorDeFutbol.setCantidadDeGolesAnotados(10);
        jugadorDeFutbol.mostrarPremio();

        Basquetbolista jugadorDeBasquet = new Basquetbolista("Pablo", "Medina");
        jugadorDeBasquet.setCantidadDeDoblesAnotados(5);
        jugadorDeBasquet.setCantidadDeTriplesAnotados(10);
        jugadorDeBasquet.mostrarPremioTotal();


        // Nota: No se puede leer ni escribir el atributo de forma directa
        // porque el modificador protegido no permite el acceso desde otro
        // paquete. Esto se debería hacer por medio de los getters y setters.
        // Descomente las siguientes líneas para probar:
             // jugadorDeFutbol.nombre = "Mario";
             // System.out.println(jugadorDeFutbol.nombre);
    }
}
