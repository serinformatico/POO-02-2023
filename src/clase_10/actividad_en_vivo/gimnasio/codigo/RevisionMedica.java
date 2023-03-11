package clase_10.actividad_en_vivo.gimnasio.codigo;

import java.time.LocalDate;

public class RevisionMedica {
    private LocalDate fechaDeEmesion;
    private String informe;
    private boolean estaAprobado;

    public RevisionMedica(LocalDate fechaDeEmesion, String informe, boolean estaAprobado) {
        this.fechaDeEmesion = fechaDeEmesion;
        this.informe        = informe;
        this.estaAprobado   = estaAprobado;
    }

    // Getters
    public LocalDate getFechaDeEmesion() {
        return this.fechaDeEmesion;
    }

    public String getInforme() {
        return this.informe;
    }

    public boolean getEstaAprobado() {
        return this.estaAprobado;
    }
}
