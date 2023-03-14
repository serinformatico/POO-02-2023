package clase_11.actividad_en_vivo.impresora.codigo;

import java.time.LocalDate;

public abstract class Impresora {

    // Atributos o propiedades privadas
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


    // Método abstracto
    public abstract void imprimir(String texto, int cantidadDeHojas);


    // Getters & Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getCantidadDeHojasDisponibles() {
        return cantidadDeHojasDisponibles;
    }

    public void setCantidadDeHojasDisponibles(int cantidadDeHojasDisponibles) {
        this.cantidadDeHojasDisponibles = cantidadDeHojasDisponibles;
    }

    public int getCANTIDAD_MAXIMA_DE_HOJAS() {
        return CANTIDAD_MAXIMA_DE_HOJAS;
    }
}
