
public class Plato {
    private String nombre; 
    private double precio;


    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setNombre(String NuevoNombre) {
        this.nombre = NuevoNombre;
    }
    public void setPrecio(double PrecioNuevo) {
        this.precio = PrecioNuevo;
    }

}
