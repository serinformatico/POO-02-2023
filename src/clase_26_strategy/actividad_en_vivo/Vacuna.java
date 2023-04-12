package clase_26_strategy.actividad_en_vivo;

import clase_26_strategy.actividad_en_vivo.vacunas.VacunaStrategy;

public class Vacuna {

    // Atributos privados
    private int numeroDeDosis;
    private VacunaStrategy vacunaStrategy;

    // Método necesario
    public void vacunar(Persona persona) {
        this.vacunaStrategy.vacunar(persona);
    }

    // Getters & Setters
    public int getNumeroDeDosis() {
        return numeroDeDosis;
    }

    public void setNumeroDeDosis(int numeroDeDosis) {
        this.numeroDeDosis = numeroDeDosis;
    }

    public VacunaStrategy getVacunaStrategy() {
        return vacunaStrategy;
    }

    public void setVacunaStrategy(VacunaStrategy vacunaStrategy) {
        this.vacunaStrategy = vacunaStrategy;
    }
}
