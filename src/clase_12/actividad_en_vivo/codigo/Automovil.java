package clase_12.actividad_en_vivo.codigo;

public abstract class Automovil {
    private String marca;
    private String modelo;
    private Motor motor;
    private Accesorio[] accesorios;

    public Automovil(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Automovil(String marca, String modelo, Motor motor, Accesorio[] accesorios) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.accesorios = accesorios;
    }

    public void avanzar() {
        System.out.println("\nApretaste el pedal del embrague");
        System.out.println("Colocaste la palanca de cambio en 1");
        System.out.println("Apretaste el pedal del acelerador");
    }

    public void avanzar(int cambioActual) {
        System.out.println("\nYa tienes la palanca del cambio en " + cambioActual);
        System.out.println("Solo apretaste el pedal del acelerador");
    }

    public void girar(String sentido) {
        this.colocarLuzDeGiro(sentido);
        System.out.println("Giraste el volante en sentido " + sentido);
    }

    public void colocarLuzDeGiro(String sentido) {
        System.out.println("\nColocaste la luz de giro en sentido " + sentido);
    }

    public abstract void cargarBulto(Bulto[] bultos);
    public abstract void descargarBulto(Bulto[] bultos);

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Accesorio[] getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorio[] accesorios) {
        this.accesorios = accesorios;
    }
}
