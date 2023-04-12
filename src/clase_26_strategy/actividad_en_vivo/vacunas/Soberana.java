package clase_26_strategy.actividad_en_vivo.vacunas;

import clase_26_strategy.actividad_en_vivo.Persona;

public class Soberana extends VacunaStrategy {

    // Constructor (define el nombre y esquema de vacunación)
    public Soberana() {
        this.setNombre("Soberana");
        this.setEfectoSecundario("No tiene efectos secundarios");
        this.setEsquemaDeVacunacion(3);
    }

    @Override
    public void vacunar(Persona persona) {
        if (persona.getVacunaContraLaCovid19().getNumeroDeDosis() < this.getEsquemaDeVacunacion()) {
            int numeroDeDosisActualizado = persona.getVacunaContraLaCovid19().getNumeroDeDosis() + 1;
            persona.getVacunaContraLaCovid19().setNumeroDeDosis(numeroDeDosisActualizado);

            System.out.println("\n" + persona.getNombre() + " se colocó la dosis número " + numeroDeDosisActualizado + " de la vacuna " + this.getNombre());
            System.out.println("Efectos secundarios: " + this.getEfectoSecundario());
        } else {
            System.out.println("\n" + persona.getNombre() + " tiene el esquema completo de la vacuna " + this.getNombre());
        }
    }
}
