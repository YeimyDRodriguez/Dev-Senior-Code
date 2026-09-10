
public class PagoContraEntrega implements MetodPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago contra entrega por un monto de: $" + monto);
    }
}
