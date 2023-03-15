package clase_12.actividad_en_vivo.codigo;

public class Coche extends Automovil {
    private boolean esDecopotable;

    public Coche(String marca, String modelo, Motor motor) {
        super(marca, modelo, motor);
    }

    @Override
    public void cargarBulto(Bulto[] bultos) {
        this.abrirBaul();
        for (Bulto bulto : bultos) {
            System.out.println("Cargaste el bulto " + bulto.getTipo() + " en el baúl");
        }
        this.cerrarBaul();
    }

    @Override
    public void descargarBulto(Bulto[] bultos) {
        this.abrirBaul();
        for (Bulto bulto : bultos) {
            System.out.println("Descargaste el bulto " + bulto.getTipo() + " del baúl");
        }
        this.cerrarBaul();
    }

    public void abrirBaul() {
        System.out.println("\nAbriste el baúl");
    }

    public void cerrarBaul() {
        System.out.println("\nCerraste el baúl");
    }

    public boolean getEsDecopotable() {
        return esDecopotable;
    }

    public void setEsDecopotable(boolean esDecopotable) {
        this.esDecopotable = esDecopotable;
    }
}
