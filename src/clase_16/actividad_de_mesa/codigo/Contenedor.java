package clase_16.actividad_de_mesa.codigo;

public class Contenedor implements Comparable<Contenedor> {

    // Atributos privados
    private int id;
    private String pais;
    private boolean esMaterialPeligroso;

    // Constructor
    public Contenedor(int id, String pais, boolean esMaterialPeligroso) {
        this.id                  = id;
        this.pais                = pais;
        this.esMaterialPeligroso = esMaterialPeligroso;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getPais() {
        return this.pais;
    }

    public boolean getEsMaterialPeligroso() {
        return this.esMaterialPeligroso;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEsMaterialPeligroso(boolean esMaterialPeligroso) {
        this.esMaterialPeligroso = esMaterialPeligroso;
    }

    // Métodos de comparación necesarios para ordenar una collection
    @Override
    public int compareTo(Contenedor contenedor) {
        if (this.getId() < contenedor.getId()) {
            return -1;
        } else if (this.getId() > contenedor.getId()) {
            return 1;
        }

        return 0;
    }



    @Override
    public String toString() {
        return "Contenedor = id: " + id + ", país: '" + pais + ", es material peligroso: " + esMaterialPeligroso;
    }
}
