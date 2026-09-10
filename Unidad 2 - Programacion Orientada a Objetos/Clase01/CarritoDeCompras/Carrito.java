
public class Carrito {

    private double Total;
    private int cantidadProductos;

    public Carrito() {
        this.Total = 0.0;
        this.cantidadProductos = 0;
    }

    public Carrito(Producto producto) {
        this.Total = producto.getPrecio();
    }

    public double getTotal() {
        return this.Total;
    }

    public void setTotal(double total) {
        this.Total = total;
    }
    public int getCantidadProductos() {
        return cantidadProductos;
    }
    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    // Metodo para agregar productos al carrito
    public void agregarProducto(Producto producto) {
        this.cantidadProductos++;
        this.Total += producto.getPrecio();
    }
}