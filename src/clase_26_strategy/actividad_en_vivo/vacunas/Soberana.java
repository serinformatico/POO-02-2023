package clase_26_strategy.actividad_en_vivo.vacunas;

import clase_26_strategy.actividad_en_vivo.Persona;

public class Moderna extends VacunaStrategy {

    // Constructor (define el nombre y esquema de vacunación)
    public Moderna() {
        this.setNombre("Moderna");
        this.setEsquemaDeVacunacion(2);
    }

    @Override
    public void vacunar(Persona persona) {
        if (persona.getVacunaContraLaCovid19().getNumeroDeDosis() >= this.getEsquemaDeVacunacion()) {
            System.out.println(persona.getNombre() + " tiene el esquema completo de la vacuna " + this.getNombre());
        } else {
            int numeroDeDosisActualizado = persona.getVacunaContraLaCovid19().getNumeroDeDosis() + 1;
            persona.getVacunaContraLaCovid19().setNumeroDeDosis(numeroDeDosisActualizado);
            System.out.println(persona.getNombre() + " se colocó la dosis número " + numeroDeDosisActualizado + " de la vacuna " + this.getNombre());
        }
    }
}
