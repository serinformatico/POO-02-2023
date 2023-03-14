package clase_11.actividad_en_vivo.impresora.codigo;

public class ImpresoraCannon extends Impresora {

    // Atributos o propiedades privadas
    private double nivelDeTintaNegra;
    private double nivelDeTintaTricolor;


    // Constructor
    public ImpresoraCannon(String modelo, String tipoConexion) {
        super(modelo, tipoConexion);
    }


    @Override
    public void imprimir(String texto, int cantidadDeHojas) {
        int cantidadDeHojasDisponibles = this.getCantidadDeHojasDisponibles();

        for (int i = 1; i <= cantidadDeHojas; i++) {
            if (cantidadDeHojasDisponibles >= 1) {
                if (this.verificarNivelDeTinta() == true) {
                    System.out.println("Imprimiendo página " + i + " (" + texto + "). Quedan " + (cantidadDeHojasDisponibles - 1) + " hojas disponibles");
                    this.setCantidadDeHojasDisponibles(cantidadDeHojasDisponibles--);
                    this.nivelDeTintaNegra -= 3.0;
                    this.nivelDeTintaTricolor -= 3.0;
                } else {
                    System.out.println("Tinta insuficiente. No se puede imprimir");
                    break;
                }
            } else {
                System.out.println("Papel insuficiente. No se puede imprimir (hay " + cantidadDeHojasDisponibles + " hojas disponibles)");
                break;
            }
        }
    }

    public boolean verificarNivelDeTinta() {
        return this.nivelDeTintaNegra >= 3.0 && this.nivelDeTintaTricolor >= 3.0;
    }


    // Getters & Setters
    public double getNivelDeTintaNegra() {
        return nivelDeTintaNegra;
    }

    public void setNivelDeTintaNegra(double nivelDeTintaNegra) {
        this.nivelDeTintaNegra = nivelDeTintaNegra;
    }

    public double getNivelDeTintaTricolor() {
        return nivelDeTintaTricolor;
    }

    public void setNivelDeTintaTricolor(double nivelDeTintaTricolor) {
        this.nivelDeTintaTricolor = nivelDeTintaTricolor;
    }
}
