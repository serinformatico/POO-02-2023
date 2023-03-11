package clase_10.actividad_en_vivo.gimnasio.codigo;

import java.time.LocalDate;

public class DemoGimnasio {

    public static void main(String[] args) {

        Socio.valorDeLaCuotaMensual  = 1500.0;
        SocioPileta.costoExtraMensual = 500.0;


        RevisionMedica revisionMedicaDeSocio2 = new RevisionMedica(LocalDate.now(), "Está Ok", true);
        RevisionMedica revisionMedicaDeSocio4 = new RevisionMedica(LocalDate.now(), "Está chau", false);


        Socio socio1       = new Socio(12345, "Pablo", "Medina");
        SocioPileta socio2 = new SocioPileta(88844, "Lorena", "Medina", revisionMedicaDeSocio2);
        Socio socio3       = new Socio(52417, "Angela", "Gómez");
        SocioPileta socio4 = new SocioPileta(18777, "Angela", "Gómez", revisionMedicaDeSocio4);
        Socio socio5       = new Socio(52417, "Patricia", "Páez"); // Código repetido (socio3)


        System.out.println("\nSOCIO 1");
        System.out.println(socio1.toString());
        System.out.println("Es igual al socio 2: " + socio1.equals(socio2));
        System.out.println("HashCode: " + socio1.hashCode());

        System.out.println("\nSOCIO 2");
        socio4.pagarCuotaMensual(2100);
        System.out.println(socio2.toString());
        System.out.println("Es igual al socio 3: " + socio2.equals(socio3));
        System.out.println("HashCode: " + socio2.hashCode());

        System.out.println("\nSOCIO 3");
        socio3.pagarCuotaMensual(1575);
        System.out.println(socio3.toString());
        System.out.println("Es igual al socio 4: " + socio3.equals(socio4));
        System.out.println("HashCode: " + socio3.hashCode());

        System.out.println("\nSOCIO 4");
        socio4.pagarCuotaMensual(2100);
        System.out.println(socio4.toString());
        System.out.println("Es igual al socio 5: " + socio4.equals(socio5));
        System.out.println("HashCode: " + socio4.hashCode());

        System.out.println("\nSOCIO 5");
        socio4.pagarCuotaMensual(1475, 100);
        System.out.println(socio5.toString());
        System.out.println("Es igual al socio 3: " + socio5.equals(socio3));
        System.out.println("HashCode: " + socio5.hashCode());
    }
}
