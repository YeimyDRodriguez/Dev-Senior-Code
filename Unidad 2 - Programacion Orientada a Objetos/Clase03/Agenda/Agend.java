
public class Agend {
    
    private int numClientes; 
    private Cliente[] clientes;

    public Agend(int capacidad, Cliente[] clientes) {
        this.numClientes = 0;
        this.clientes = clientes;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente(Cliente cliente) {
        if (numClientes < clientes.length) {
            clientes[numClientes] = cliente;
            numClientes++;
        } else {
            System.out.println("No se pueden agregar más clientes. Capacidad máxima alcanzada.");
        }
    }

    public void imprimirClientes() {
        for (int i = 0; i < numClientes; i++) {
            Cliente cliente = clientes[i];
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Dirección: " + cliente.getDireccion());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println();
        }
    }
}
