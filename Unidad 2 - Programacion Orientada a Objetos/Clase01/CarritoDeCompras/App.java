
public class App {

    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Laptop", 1200.50);
        Producto producto2 = new Producto("Smartphone", 800.75);
        Producto producto3 = new Producto("Tablet", 450.30);

        // Crear carrito de compras
        Carrito carrito = new Carrito();

        // Agregar productos al carrito
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        // Mostrar el total del carrito
        System.out.println("Total del carrito: $" + carrito.getTotal());
        System.out.println("Cantidad de productos en el carrito: " + carrito.getCantidadProductos());
    }
    
}
