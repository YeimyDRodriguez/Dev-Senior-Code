
public class App {
    public static void main(String[] args) {

        ProductoML producto01 = new ProductoML("Tarjeta", 50.55);
        producto01.mostrarProducto();

        System.out.println("==============================");

        ProductoTecnologia producto02 = new ProductoTecnologia("Tarhet", 21.55, 8);
        producto02.mostrarProducto();
    }

}
