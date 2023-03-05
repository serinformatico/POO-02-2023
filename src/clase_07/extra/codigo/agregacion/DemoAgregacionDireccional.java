package clase_07.extra.codigo.agregacion;

public class DemoAgregacionDireccional {

    public static void main(String[] args) {
        
        Airbag airbagDeVolante = new Airbag("Airbag de volante AIR-0114V");
        Airbag airbagDePuerta  = new Airbag("Airbag de puerta AIR-0118P");
        Airbag[] airbags       = new Airbag[] {airbagDeVolante, airbagDePuerta, airbagDePuerta};

        Automovil automovil = new Automovil("Ford", "Fiesta", airbags);

        // le pregunto al automóvil que airbag tiene en la primera posición
        System.out.println("Tengo instalado: " + automovil.getAirbags()[0].getDenominacion());
    }
}
