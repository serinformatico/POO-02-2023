package clase_07.extra.codigo.composicion;

public class DemoComposicionDireccional {

    public static void main(String[] args) {

        Motor motor = new Motor();
        motor.setDenominacion("Diésel 1800cc 120HP");

        Automovil automovil1 = new Automovil("Ford", "Fiesta", motor);

        // le pregunto al automóvil que motor tiene instalado
        System.out.println("Tengo instalado: " + automovil1.getMotor().getDenominacion());

        // Provoco una excepción al intentar crear un automóvil sin motor
        //Automovil automovil2 = new Automovil("Ford", "Fiesta", null);
    }
}
