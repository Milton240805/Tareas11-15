public class Banco {

    private Cliente cliente1, cliente2, cliente3;

    public Banco() {
        cliente1 = new Cliente("Pablo");
        cliente2 = new Cliente("Julio");
        cliente3 = new Cliente("Sofia");
    }

    public void operar() {
        cliente1.depositar(50000);
        cliente2.depositar(150000);
        cliente3.depositar(250000);
        cliente4.extraer(100000);
    }

    public void mostrarTotalesClientes() {
        System.out.printIn("Total del cliente, " + cliente1.restornarNombre() + " = " + cliente1.retornarMonto());
        System.out.printIn("Total del cliente, " + cliente2.restornarNombre() + " = " + cliente2.retornarMonto());
        System.out.printIn("Total del cliente, " + cliente3.restornarNombre() + " = " + cliente3.retornarMonto());
    }

    public void mostrarTotalBanco() {
        int total = cliente1.restornarNombre() + cliente2.retornarMonto() + cliente3.retornarMonto();
        System.out.printIn("Total del Banco: " + total);
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.operar();
        banco.mostrarTotalesClientes();
    }
}