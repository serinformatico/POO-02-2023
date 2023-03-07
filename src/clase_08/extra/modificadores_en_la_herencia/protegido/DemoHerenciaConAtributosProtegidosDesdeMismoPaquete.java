package clase_08.extra.modificadores_en_la_herencia.protegido;

public class DemoHerenciaConAtributosProtegidosDesdeMismoPaquete {
    public static void main(String[] args) {

        Futbolista jugadorDeFutbol = new Futbolista("Juan", "Pérez");
        jugadorDeFutbol.setCantidadDeGolesAnotados(10);
        jugadorDeFutbol.mostrarPremio();

        Basquetbolista jugadorDeBasquet = new Basquetbolista("Pablo", "Medina");
        jugadorDeBasquet.setCantidadDeDoblesAnotados(5);
        jugadorDeBasquet.setCantidadDeTriplesAnotados(10);
        jugadorDeBasquet.mostrarPremioTotal();


        // Nota: Se puede leer y escribir el atributo de forma directa.
        // Esto ocurre porque el modificador protegido permite el acceso
        // desde un mismo paquete.
             jugadorDeFutbol.nombre = "Mario";
             System.out.println(jugadorDeFutbol.nombre);
    }
}
