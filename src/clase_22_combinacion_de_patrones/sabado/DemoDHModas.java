package clase_22_combinacion_de_patrones.sabado;

import clase_22_combinacion_de_patrones.sabado.productos.*;

public class DemoDHModas {
    public static void main(String[] args) {

        ProductoFactoryMethodSingleton fabrica = ProductoFactoryMethodSingleton.obtenerInstancia();

        System.out.println("\nRASO:");
        Tela razoBlanco = (Tela) fabrica.crearProducto("tela");
        razoBlanco.setNombre("Raso");
        razoBlanco.setColor("Blanco");
        razoBlanco.setCosto(1250.0);
        System.out.println("Precio $" + razoBlanco.calcularPrecio());

        System.out.println("\nSEDA:");
        Tela sedaRosa = (Tela) fabrica.crearProducto("TELA");
        sedaRosa.setNombre("Seda");
        sedaRosa.setColor("Rosa");
        sedaRosa.setCosto(950.0);
        System.out.println("Precio $" + sedaRosa.calcularPrecio());

        System.out.println("\nBOTON:");
        Boton botonGrande = (Boton) fabrica.crearProducto("BOTON");
        botonGrande.setNombre("Botón Grande");
        botonGrande.setColor("Dorado");
        botonGrande.setCosto(150.0);
        System.out.println("Precio $" + botonGrande.calcularPrecio());

        System.out.println("\nHILO DE SEDA:");
        Hilo hiloDeSeda = (Hilo) fabrica.crearProducto("HILO");
        hiloDeSeda.setNombre("Hilo");
        hiloDeSeda.setColor("Blanco");
        hiloDeSeda.setCosto(200.0);
        System.out.println("Precio $" + hiloDeSeda.calcularPrecio());

        System.out.println("\nHILO DE RASO:");
        Hilo hiloDeRaso = (Hilo) fabrica.crearProducto("HILO");
        hiloDeRaso.setNombre("Hilo");
        hiloDeRaso.setColor("Negro");
        hiloDeRaso.setCosto(175.0);
        System.out.println("Precio $" + hiloDeRaso.calcularPrecio());

        System.out.println("\nVESTIDO DE NOVIA:");
        ProductoComposite vestidoDeNovia = (ProductoComposite) fabrica.crearProducto("COMPOSITE");
        vestidoDeNovia.setNombre("Vestido de novia");
        vestidoDeNovia.setManoDeObra(7500.0);
        vestidoDeNovia.agregarProducto(razoBlanco);
        vestidoDeNovia.agregarProducto(sedaRosa);
        vestidoDeNovia.agregarProducto(hiloDeSeda);
        System.out.println("Precio $" + vestidoDeNovia.calcularPrecio());

        Boleta boleta = new Boleta();
        boleta.agregarProducto(vestidoDeNovia);
        boleta.agregarProducto(botonGrande);

        }
}
