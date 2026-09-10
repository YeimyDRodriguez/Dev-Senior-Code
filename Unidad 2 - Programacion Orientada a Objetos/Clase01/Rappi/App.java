
public class App {
 
    public static void main(String[] args) {
        Plato plato1 = new Plato("Hamburguesa", 15000);
        Plato plato2 = new Plato("Papas fritas", 8000);
        Plato plato3 = new Plato("Gaseosa", 5000);

        Pedido pedido = new Pedido("Restaurante La Buena Comida");

        pedido.agregarPlato(plato1);
        pedido.agregarPlato(plato2);
        pedido.agregarPlato(plato3);

        System.out.println("Pedido en: " + pedido.getRestaurante());
        System.out.println("Total a pagar: $" + pedido.getTotal());
        System.out.println("Platos en el pedido: " + pedido.getCantidadPlatos());
    }
}
