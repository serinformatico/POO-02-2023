package clase_12.actividad_en_vivo.codigo;

public class Motocicleta extends Automovil {
    private boolean tieneEmbrague;

    public Motocicleta(String marca, String modelo, Motor motor) {
        super(marca, modelo, motor);
    }

    @Override
    public void cargarBulto(Bulto[] bultos) {
        this.abrirAlforjas();
        for (Bulto bulto : bultos) {
            System.out.println("Cargaste el bulto " + bulto.getTipo() + " en las alforjas");
        }
        this.cerrarAlforjas();
    }

    @Override
    public void descargarBulto(Bulto[] bultos) {
        this.abrirAlforjas();
        for (Bulto bulto : bultos) {
            System.out.println("Descargaste el bulto " + bulto.getTipo() + " de las alforjas");
        }
        this.cerrarAlforjas();
    }

    @Override
    public void avanzar() {
        System.out.println("\n");
        if (tieneEmbrague == true) {
            System.out.println("Apretaste la manija del embrague");
        }
        System.out.println("Colocaste el pedal de cambio en 1");
        System.out.println("Rotaste el puño del acelerador");
    }

    @Override
    public void avanzar(int cambioActual) {
        System.out.println("\nYa tienes el pedal de cambio en " + cambioActual);
        System.out.println("Rotaste el puño del acelerador");
    }

    @Override
    public void girar(String sentido) {
        this.colocarLuzDeGiro(sentido);
        System.out.println("\nGiraste el manubrio en sentido " + sentido);
    }

    public void abrirAlforjas() {
        System.out.println("\nAbriste las alforjas");
    }

    public void cerrarAlforjas() {
        System.out.println("\nCerraste las alforjas");
    }

    public boolean getTieneEmbrague() {
        return tieneEmbrague;
    }

    public void setTieneEmbrague(boolean tieneEmbrague) {
        this.tieneEmbrague = tieneEmbrague;
    }
}
