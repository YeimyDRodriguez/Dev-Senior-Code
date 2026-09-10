
public class App {
    
    public static void main(String[] args) {
        MetodPago pagoTarjeta = new PagoTarjeta();
        MetodPago pagoPayPal = new PagoPayPal();
        MetodPago pagoCripto = new PagoCriptomonedas();
        MetodPago pagoContraEntrega = new PagoContraEntrega();

        pagoTarjeta.procesarPago(150.75);
        pagoPayPal.procesarPago(89.99);
        pagoCripto.procesarPago(250.00);
        pagoContraEntrega.procesarPago(45.50);
    }

}
