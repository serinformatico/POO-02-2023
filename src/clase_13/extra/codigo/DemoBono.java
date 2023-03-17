package clase_13.extra.codigo;

public class DemoBono {
    public static void main(String[] args) {

        Bono bono1 = new Bono("ABC154", 1252.12);
        Bono bono2 = new Bono("ABC789", 500.17);
        Bono bono3 = new Bono("ABC123", 2977.10);
        Bono bono4 = new Bono("ABC777", 1252.12); // Tiene el mismo valor que el bono1

        System.out.println("El valor de bono1 es mayor que al de bono2 " + bono1.compareTo(bono2)); // 1 es mayor
        System.out.println("El valor de bono1 es menor que al de bono3 " + bono1.compareTo(bono3)); // -1 es menor
        System.out.println("El valor de bono1 es igual que al de bono4 " + bono1.compareTo(bono4)); // 0 es igual

        bono1.registrarBono();
        bono3.autorizarPago();
        bono1.emitirCheque("Medina", "Pablo");
    }
}
