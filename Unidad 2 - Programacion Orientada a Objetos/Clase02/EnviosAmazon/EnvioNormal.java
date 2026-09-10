
public class EnvioNormal extends Amazon {

    public EnvioNormal(String nombreProducto, String direccionEnvio, double pesoProducto) {
        super(nombreProducto, direccionEnvio, pesoProducto);
    }
    @Override
    public void CalcularCosto() {
        double costoEnvio; 
        if(getPesoProducto() <= 5.0){
            costoEnvio = 10.0;
        } else {
            costoEnvio = 20.0;
        }
        System.out.println("El costo de envío normal para el producto " + getNombreProducto() + " es de: $" + costoEnvio);
    }
    
}
