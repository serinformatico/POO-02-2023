package clase_10.actividad_en_vivo.gimnasio.codigo;

import java.util.Objects;

public class SocioPileta extends Socio{

    // Atributos privados
    public static double costoExtraMensual;
    private RevisionMedica revisionMedica;


    // Constructor
    public SocioPileta(int codigo, String nombre, String apellido, RevisionMedica revisionMedica) {
        super(codigo, nombre, apellido);
        this.revisionMedica = revisionMedica;

    }


    // Método privado
    private boolean comprobarSiEstaHabilitado() {
        return revisionMedica.getEstaAprobado();
    }


    // Método sobrescrito
    @Override
    public double calcularCuotaMensual() {
        if (this.comprobarSiEstaHabilitado() == true) {
            double cuotaMensualMasExtra = Socio.valorDeLaCuotaMensual + SocioPileta.costoExtraMensual;
            double cuotaMensualMasBono = cuotaMensualMasExtra + (cuotaMensualMasExtra / 100 * this.getBONO_CONTRIBUCION_PORCENTUAL());

            return cuotaMensualMasBono;
        }

        // Invoca al método calcularCuotaMensual() del padre y retorna la cuota mensual
        return super.calcularCuotaMensual();
    }


    // Métodos sobrescritos que son heredados de la clase Object en la superclase
    @Override
    public String toString() {
        return  super.toString() +
                ", revisión médica: " + this.revisionMedica.getEstaAprobado() +
                ", costoExtraMensual: " + this.comprobarSiEstaHabilitado() +
                ", costo extra: $"      + SocioPileta.costoExtraMensual;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica que obj no es nulo y que es una clase del tipo socio
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            // realiza un casting de obj
            SocioPileta s = (SocioPileta) obj;

            // Determina la igualdad de los objetos por medio del código de socio
            return s.getCodigo() == this.getCodigo();
        }
    }

    @Override
    public int hashCode() {
        // Retorna un código hash único (crea un código hash a partir del código hash de la superclase más los atributos de la clase)
        return Objects.hash(super.hashCode(), SocioPileta.costoExtraMensual, revisionMedica);
    }


    // Getters & Setters
    public RevisionMedica getRevisionMedica() {
        return revisionMedica;
    }

    public void setRevisionMedica(RevisionMedica revisionMedica) {
        this.revisionMedica = revisionMedica;
    }
}
