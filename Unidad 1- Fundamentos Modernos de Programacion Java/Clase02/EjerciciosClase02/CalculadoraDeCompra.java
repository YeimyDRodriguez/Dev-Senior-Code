
import java.util.Scanner;

public class CalculadoraDeCompra {
    public static final double TASA_IMPUESTO = 0.15; // 15% de impuesto

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= CALCULADORA DE COMPRA =======");

        System.out.println("Ingrese el precio unitario del articulo:");
        var precioUnitario = scanner.nextDouble();

        System.out.println("Ingrese la cantidad de articulos comprados: ");
        var cantidadArticulos = scanner.nextInt();

        System.out.println("Ingrese el valor pagado por el cliente: ");
        var valorPagado = scanner.nextDouble();

        scanner.nextLine(); // Limpiar el buffer

        // Calculos
        var subtotal = precioUnitario * cantidadArticulos;
        var montoImpuesto = subtotal * TASA_IMPUESTO;
        var totalCompra = subtotal + montoImpuesto;
        var cambio = valorPagado - totalCompra;

        // Resultados
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Impuesto (%.0f%%): $%.2f%n", TASA_IMPUESTO * 100, montoImpuesto);
        System.out.printf("Total a pagar: %.2f\n", totalCompra);
        System.out.printf("Valor pagado: %.2f\n", valorPagado);
        System.out.printf("Cambio a entregar: %.2f\n", cambio);
        System.out.println("=====================================");
        System.out.println("Gracias por su compra. ¡Vuelva pronto!");
        scanner.close(); // Cerrar el scanner
    }

}
