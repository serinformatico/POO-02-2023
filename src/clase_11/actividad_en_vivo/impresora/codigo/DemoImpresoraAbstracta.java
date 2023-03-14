package clase_11.actividad_en_vivo.impresora.codigo;

public class DemoImpresoraAbstracta {
    public static void main(String[] args) {

        System.out.println("\n ===== IMPRESORA EPSON ===== ");
        ImpresoraEpson impresora1 = new ImpresoraEpson("Epson x1102", "USB");
        impresora1.agregarPapel(10);
        impresora1.setNivelDeTonerNegro(25);
        impresora1.imprimir("Hola Mundo", 10);

        System.out.println("\n ===== IMPRESORA CANNON ===== ");
        ImpresoraCannon impresora2 = new ImpresoraCannon("Cannon x154", "USB");
        impresora2.agregarPapel(5);
        impresora2.setNivelDeTintaNegra(30);
        impresora2.setNivelDeTintaTricolor(50);
        impresora2.imprimir("Hola Mundo Color", 10);
    }
}
