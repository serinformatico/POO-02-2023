package clase_07.extra.codigo.dependencia;

public class DemoDependenciaDireccional {

    public static void main(String[] args) {

        Libro libroPOO = new Libro("Aprendiendo POO");
        Libro libroBD  = new Libro("Aprendiendo base de datos");
        Libro[] libros = new Libro[] {libroPOO, libroBD};

        Socio socio = new Socio("Pablo", "Medina");
        socio.leerLibro(libros);
    }
}
