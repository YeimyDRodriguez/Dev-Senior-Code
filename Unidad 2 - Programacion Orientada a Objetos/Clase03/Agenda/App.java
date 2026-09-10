
public class App {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[5];
        Agend agenda = new Agend(5, clientes);

        Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123", "555-1234");
        Cliente cliente2 = new Cliente("María Gómez", "Avenida Siempre Viva 742", "555-5678");
        Cliente cliente3 = new Cliente("Carlos López", "Boulevard Central 456", "555-8765");
        
        agenda.agregarCliente(cliente1);
        agenda.agregarCliente(cliente2);
        agenda.agregarCliente(cliente3);

        agenda.imprimirClientes();
    }

}
