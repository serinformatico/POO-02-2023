package clase_14_pre_evaluacion.actividad_en_vivo.codigo;

public class ExamenParcial extends Examen {

    private int numeroDeUnidadATomar;
    private int numeroDeReintentos;

    public ExamenParcial(String titulo, String enunciado, Estudiante estudiante) {
        super(titulo, enunciado, estudiante);
        this.numeroDeReintentos = 1;
    }

    public boolean consultarEstadoDeAprobacion() {
        if (this.nota >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public boolean determinarPosibilidadParaRecuperar() {
        if (this.numeroDeUnidadATomar <= 3 && this.numeroDeReintentos < 3) {
            return true;
        } else if (this.numeroDeUnidadATomar > 3 && this.numeroDeReintentos < 2) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumeroDeUnidadATomar() {
        return numeroDeUnidadATomar;
    }

    public int getNumeroDeReintentos() {
        return numeroDeReintentos;
    }

    public void setNumeroDeUnidadATomar(int numeroDeUnidadATomar) {
        this.numeroDeUnidadATomar = numeroDeUnidadATomar;
    }

    public void setNumeroDeReintentos(int numeroDeReintentos) {
        this.numeroDeReintentos = numeroDeReintentos;
    }
}
