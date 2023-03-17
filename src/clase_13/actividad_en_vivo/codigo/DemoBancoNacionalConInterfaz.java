package clase_13.actividad_en_vivo.codigo;

public class DemoBancoNacionalConInterfaz {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(123456, "Medina", 35888455);
        Cliente cliente2 = new Cliente(654321, "Pereyra", 40557123);

        CuentaCorriente cuentaCorriente = new CuentaCorriente(100.0, 500.0);

        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(200.0);
        CajaDeAhorro cajaDeAhorro2 = new CajaDeAhorro(100.0);
        CajaDeAhorro cajaDeAhorro3 = new CajaDeAhorro(200.0);

        // Comparo los saldos de las cajas de ahorro
        System.out.println("El saldo de cajaDeAhorro1 es mayor que el de saldo de cajaDeAhorro2 " + cajaDeAhorro1.compareTo(cajaDeAhorro2)); // 1 es mayor
        System.out.println("El saldo de cajaDeAhorro2 es menor que el de saldo de cajaDeAhorro3 " + cajaDeAhorro2.compareTo(cajaDeAhorro3)); // -1 es menor
        System.out.println("El saldo de cajaDeAhorro1 es igual que el de saldo de cajaDeAhorro3 " + cajaDeAhorro1.compareTo(cajaDeAhorro3)); // 0 es igual

        // Utilizo el compareTo para establecer condiciones
        if (cajaDeAhorro1.compareTo(cajaDeAhorro2) == 1) {
            System.out.println(cajaDeAhorro1.getSaldo() + " es mayor que " + cajaDeAhorro2.getSaldo());
        } else if (cajaDeAhorro1.compareTo(cajaDeAhorro2) == -1) {
            System.out.println(cajaDeAhorro1.getSaldo() + " es menor que " + cajaDeAhorro2.getSaldo());
        } else if (cajaDeAhorro1.compareTo(cajaDeAhorro2) == 0) {
            System.out.println(cajaDeAhorro1.getSaldo() + " es igual que " + cajaDeAhorro2.getSaldo());
        }


        // Asigno los clientes a las cuentas
        cuentaCorriente.setCliente(cliente1);
        cajaDeAhorro1.setCliente(cliente1);
        cajaDeAhorro2.setCliente(cliente2);
        cajaDeAhorro3.setCliente(cliente2);

        // Asigno las cuentas al cliente
        cliente1.setCuentasBancarias(new Cuenta[]{ cajaDeAhorro1, cuentaCorriente });
        cliente2.setCuentasBancarias(new Cuenta[]{ cajaDeAhorro2, cajaDeAhorro2 });

        cajaDeAhorro1.depositarEfectivo(400.0);
        cajaDeAhorro1.cobrarIntereses();
        cajaDeAhorro1.extraerEfectivo(500.0);

        cuentaCorriente.depositarEfectivo(900.0);
        cuentaCorriente.gravar(3.0);
        cuentaCorriente.extraerEfectivo(1150.0);
    }
}
