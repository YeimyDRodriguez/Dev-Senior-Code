
public class Pedido {

    private String restaurante; 
    //private Plato plato; 
    private double total; 
    private int cantidadPlatos; 
    private boolean entregado;  

    public Pedido(String restaurante){
        this.restaurante = restaurante;
        this.entregado = false;
    }

    public String getRestaurante() {
        return restaurante;
    }
    public double getTotal() {
        return total;
    }
    public boolean isEntregado() {
        return this.entregado;
    }
    public int getCantidadPlatos() {
        return cantidadPlatos;
    }

    public void agregarPlato(Plato plato) {
        this.total += plato.getPrecio();
        this.cantidadPlatos += 1;
    }
}
