package clase_26_strategy.actividad_en_vivo;

public class Persona {

    // Atributos privados
    private String nombre;
    private Vacuna vacunaContraLaCovid19;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vacuna getVacunaContraLaCovid19() {
        return vacunaContraLaCovid19;
    }

    public void setVacunaContraLaCovid19(Vacuna vacunaContraLaCovid19) {
        this.vacunaContraLaCovid19 = vacunaContraLaCovid19;
    }
}
