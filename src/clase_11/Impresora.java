package clase_11;

import java.time.LocalDate;

public abstract class Impresora {

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


    // Método abstracto
    public abstract void imprimir(String texto, int cantidadDeHojas);


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
