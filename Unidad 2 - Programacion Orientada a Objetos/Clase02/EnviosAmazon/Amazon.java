
public class Amazon {
    private String nombreProducto;
    private String direccionEnvio;
    private double pesoProducto; 

    public Amazon(String nombreProducto, String direccionEnvio, double pesoProducto) {
        this.nombreProducto = nombreProducto;
        this.direccionEnvio = direccionEnvio;
        this.pesoProducto = pesoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public double getPesoProducto() {
        return pesoProducto;
    }

    public void setPesoProducto(double pesoProducto) {
        this.pesoProducto = pesoProducto;
    }
    
    public void CalcularCosto(){
        System.out.println("Calculando el costo del envio... \n");
    }
}
