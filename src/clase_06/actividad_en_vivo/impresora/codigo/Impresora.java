package clase_06.actividad_en_vivo.impresora.codigo;

import java.time.LocalDate;

public class Impresora {

    // Atributos o propiedades
    private String modelo;
    private String tipoConexion;
    private LocalDate fechaFabricacion;
    private int cantidadDeHojasDisponibles;
    private final int CANTIDAD_MAXIMA_DE_HOJAS = 25;


    // Constructor
    public Impresora(String modelo, String tipoConexion) {
        this.modelo                     = modelo;
        this.tipoConexion               = tipoConexion;
        this.cantidadDeHojasDisponibles = 0;
    }


    // Métodos públicos
    public void agregarPapel(int cantidadDeHojas) {
        int cantidadTotalDeHojas = (cantidadDeHojas + this.cantidadDeHojasDisponibles);

        if (cantidadTotalDeHojas <= this.CANTIDAD_MAXIMA_DE_HOJAS) {
            this.cantidadDeHojasDisponibles = cantidadTotalDeHojas;
        } else {
            System.out.println("No se puede agregar la cantidad de hojas. Se ha superado la cantidad máxima");
        }
    }

    public void imprimir(int cantidadDeHojas) {
        if (cantidadDeHojas <= this.cantidadDeHojasDisponibles) {
            for (int i = 1; i <= cantidadDeHojas; i++) {
                System.out.println("Imprimiendo página " + i + ". Quedan " + (this.cantidadDeHojasDisponibles-1) + " hojas disponibles");
                this.cantidadDeHojasDisponibles--;
            }
        } else {
            System.out.println("Papel insuficiente. No se puede imprimir (hay " + this.cantidadDeHojasDisponibles + " hojas disponibles)");
        }
    }


    // Métodos getters
    public String getModelo() {
        return this.modelo;
    }

    public String getTipoConexion() {
        return this.tipoConexion;
    }

    public LocalDate getFechaFabricacion() {
        return this.fechaFabricacion;
    }

    public Integer getCantidadDeHojasDisponibles() {
        return this.cantidadDeHojasDisponibles;
    }


    // Métodos setters
    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setCantidadDeHojasDisponibles(Integer hojasDisponibles) {
        this.cantidadDeHojasDisponibles = hojasDisponibles;
    }
}
