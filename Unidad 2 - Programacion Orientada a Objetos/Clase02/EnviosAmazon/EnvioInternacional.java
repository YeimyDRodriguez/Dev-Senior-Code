
public class EnvioInternacional extends Amazon {

    public EnvioInternacional(String nombreProducto, String direccionEnvio, double pesoProducto) {
        super(nombreProducto, direccionEnvio, pesoProducto);
    }

    @Override
    public void CalcularCosto() {
        double costoEnvio;
        if (getPesoProducto() <= 15.0) {
            costoEnvio = 80.0;
        } else {
            costoEnvio = 150.0;
        }
        System.out
                .println("El costo de envío internacional para el producto " + getNombreProducto() + " es de: $"
                        + costoEnvio);
    }

}
