package clase_26_strategy.actividad_en_vivo;

import clase_26_strategy.actividad_en_vivo.vacunas.AstraZeneca;
import clase_26_strategy.actividad_en_vivo.vacunas.Moderna;
import clase_26_strategy.actividad_en_vivo.vacunas.Soberana;

public class DemoVacunaStrategy {
    public static void main(String[] args) {

        // Estrategias de vacunación
        AstraZeneca astraZeneca = new AstraZeneca();
        Moderna moderna         = new Moderna();
        Soberana soberana       = new Soberana();

        Persona roberto = new Persona("Roberto");
        roberto.setVacunaContraLaCovid19(new Vacuna());
        roberto.getVacunaContraLaCovid19().setVacunaStrategy(astraZeneca);
        roberto.getVacunaContraLaCovid19().vacunar(roberto);
        roberto.getVacunaContraLaCovid19().vacunar(roberto);

        Persona lorena = new Persona("Lorena");
        lorena.setVacunaContraLaCovid19(new Vacuna());
        lorena.getVacunaContraLaCovid19().setVacunaStrategy(moderna);
        lorena.getVacunaContraLaCovid19().vacunar(lorena);

        Persona mariana = new Persona("Mariana");
        mariana.setVacunaContraLaCovid19(new Vacuna());
        mariana.getVacunaContraLaCovid19().setVacunaStrategy(soberana);
        mariana.getVacunaContraLaCovid19().vacunar(mariana);
        mariana.getVacunaContraLaCovid19().vacunar(mariana);
    }
}
