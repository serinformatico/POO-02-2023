package clase_11.actividad_en_vivo.impresora.codigo;

public class ImpresoraEpson extends Impresora {

    // Atributos o propiedades privadas
    private double nivelDeTonerNegro;


    // Constructor
    public ImpresoraEpson(String modelo, String tipoConexion) {
        super(modelo, tipoConexion);
    }


    @Override
    public void imprimir(String texto, int cantidadDeHojas) {
        int cantidadDeHojasDisponibles = this.getCantidadDeHojasDisponibles();

        for (int i = 1; i <= cantidadDeHojas; i++) {
            if (this.verificarNivelDeToner() == true) {
                if (cantidadDeHojasDisponibles >= 1) {
                    System.out.println("Imprimiendo página " + i + " (" + texto + "). Quedan " + (cantidadDeHojasDisponibles - 1) + " hojas disponibles");
                    this.setCantidadDeHojasDisponibles(cantidadDeHojasDisponibles--);
                    this.nivelDeTonerNegro -= 3.0;
                } else {
                    System.out.println("Papel insuficiente. No se puede imprimir (hay " + cantidadDeHojasDisponibles + " hojas disponibles)");
                    break;
                }
            } else {
                System.out.println("Toner insuficiente. No se puede imprimir");
                break;
            }
        }
    }

    public boolean verificarNivelDeToner() {
        return this.nivelDeTonerNegro >= 3.0;
    }


    // Getters & Setters
    public double getNivelDeTonerNegro() {
        return nivelDeTonerNegro;
    }

    public void setNivelDeTonerNegro(double nivelDeTonerNegro) {
        this.nivelDeTonerNegro = nivelDeTonerNegro;
    }
}
