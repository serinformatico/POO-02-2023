package clase_26_strategy.actividad_en_vivo.vacunas;

import clase_26_strategy.actividad_en_vivo.Persona;

public class AstraZeneca extends VacunaStrategy {

    // Constructor (define el nombre y esquema de vacunación)
    public AstraZeneca() {
        this.setNombre("Astra Zeneca");
        this.setEfectoSecundario("Tiende a subir la fiebre luego de ser aplicada");
        this.setEsquemaDeVacunacion(1);
    }

    @Override
    public void vacunar(Persona persona) {
        if (persona.getVacunaContraLaCovid19().getNumeroDeDosis() < this.getEsquemaDeVacunacion()) {
            int numeroDeDosisActualizado = persona.getVacunaContraLaCovid19().getNumeroDeDosis() + 1;
            persona.getVacunaContraLaCovid19().setNumeroDeDosis(numeroDeDosisActualizado);

            System.out.println("\n" + persona.getNombre() + " se colocó la única dosis de la vacuna " + this.getNombre());
            System.out.println("Efectos secundarios: " + this.getEfectoSecundario());
        } else {
            System.out.println("\n" + persona.getNombre() + " tiene el esquema completo de la vacuna " + this.getNombre());
        }
    }
}
