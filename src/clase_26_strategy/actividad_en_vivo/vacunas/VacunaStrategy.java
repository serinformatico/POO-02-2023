package clase_26_strategy.actividad_en_vivo.vacunas;

import clase_26_strategy.actividad_en_vivo.Persona;

public abstract class VacunaStrategy {

    // Atributo privado
    private String nombre;
    private String efectoSecundario;
    private int esquemaDeVacunacion;

    // Método Abstracto necesario
    public abstract void vacunar(Persona persona);

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfectoSecundario() {
        return efectoSecundario;
    }

    public void setEfectoSecundario(String efectoSecundario) {
        this.efectoSecundario = efectoSecundario;
    }

    public int getEsquemaDeVacunacion() {
        return esquemaDeVacunacion;
    }

    public void setEsquemaDeVacunacion(int esquemaDeVacunacion) {
        this.esquemaDeVacunacion = esquemaDeVacunacion;
    }
}
