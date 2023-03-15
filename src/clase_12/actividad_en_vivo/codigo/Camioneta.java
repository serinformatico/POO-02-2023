package clase_12.actividad_en_vivo.codigo;

public class Camioneta extends Automovil {
    private boolean tieneCupula;

    public Camioneta(String marca, String modelo, Motor motor) {
        super(marca, modelo, motor);
    }

    @Override
    public void cargarBulto(Bulto[] bultos) {
        this.abrirCompuerta();
        for (Bulto bulto : bultos) {
            System.out.println("Cargaste el bulto " + bulto.getTipo() + " en la caja de cargas");
        }
        this.cerrarCompuerta();
    }

    @Override
    public void descargarBulto(Bulto[] bultos) {
        this.abrirCompuerta();
        for (Bulto bulto : bultos) {
            System.out.println("Descargaste el bulto " + bulto.getTipo() + " de la caja de cargas");
        }
        this.cerrarCompuerta();
    }

    public void abrirCompuerta() {
        System.out.println("\nAbriste la compuerta");
    }

    public void cerrarCompuerta() {
        System.out.println("\nCerraste la compuerta");
    }

    public boolean getTieneCupula() {
        return tieneCupula;
    }

    public void setTieneCupula(boolean tieneCupula) {
        this.tieneCupula = tieneCupula;
    }
}
