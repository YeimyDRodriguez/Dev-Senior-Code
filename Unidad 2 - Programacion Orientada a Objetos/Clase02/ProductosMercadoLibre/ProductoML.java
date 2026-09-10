
public class ProductoML {

    private String nombre;
    private double precio;

    public ProductoML(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: $" + precio);
    }
}
