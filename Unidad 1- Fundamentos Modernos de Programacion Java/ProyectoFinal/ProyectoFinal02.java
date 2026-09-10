
import java.util.Scanner;

public class ProyectoFinal02 {

    static Scanner scanner = new Scanner(System.in);

    static String nombreProducto = "N/A";
    static double precioUnitario = 0.0;
    static int cantidadInventario = 0;

    public static void main(String[] args) {

        int opcion = -1;

        while (opcion != 0) {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    mostrarProducto();
                    break;
                case 3:
                    double valorTotal = calcularValorInventario();
                    if (valorTotal != -1) {
                        System.out.printf("Valor total del inventario: $%,.2f%n", valorTotal);
                    }
                    break;
                case 4:
                    mostrarResumen();
                    break;
                case 5:
                    limpiarDatos();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }

    static void mostrarMenu() {
        String opciones = """
                --- Sistema de Gestión de Productos ---

                1. Registrar nuevo producto
                2. Mostrar información del producto actual
                3. Calcular valor total del inventario
                4. Mostrar resumen completo del producto
                5. Limpiar datos del producto actual
                0. Salir

                """;
        System.out.println(opciones);
        System.out.print("Ingrese su opción: ");
    }

    static void registrarProducto() {

        if (!hayProductoRegistrado()) {
            leerProducto();
        } else {
            System.out.print("Ya hay un producto registrado. ¿Desea sobrescribirlo? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                leerProducto();
            } else {
                System.out.println("Operación cancelada. No se modificaron los datos del producto.");
            }
        }
    }

    static void leerProducto() {

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        while (!validarNombreProducto(nombre)) {
            System.out.println("Nombre inválido. No puede estar vacío.");
            System.out.print("Ingrese el nombre del producto: ");
            nombre = scanner.nextLine();
        }
        nombreProducto = nombre;

        precioUnitario = solicitarPrecio();

        cantidadInventario = solicitarCantidad();

        System.out.println("Producto registrado exitosamente.");
    }

    static double solicitarPrecio() {
        double precio;
        do {
            System.out.print("Ingrese el precio unitario: ");
            precio = scanner.nextDouble();
            if (!validarPrecio(precio)) {
                System.out.println("Precio inválido. Debe ser mayor que 0.");
            }
        } while (!validarPrecio(precio));
        return precio;
    }

    static int solicitarCantidad() {
        int cantidad;
        do {
            System.out.print("Ingrese la cantidad en inventario: ");
            cantidad = scanner.nextInt();
            if (!validarCantidad(cantidad)) {
                System.out.println("Cantidad inválida. Debe ser un entero mayor o igual a 0.");
            }
        } while (!validarCantidad(cantidad));
        return cantidad;
    }

    static void mostrarProducto() {
        if (!hayProductoRegistrado()) {
            System.out.println("No hay datos de producto registrados actualmente.");
        } else {
            System.out.println("--- Información del Producto ---");
            System.out.println("Nombre: " + nombreProducto);
            System.out.printf("Precio Unitario: $%,.2f%n", precioUnitario);
            System.out.println("Cantidad en Inventario: " + cantidadInventario);
        }
    }

    static double calcularValorInventario() {
        if (!hayProductoRegistrado()) {
            System.out.println(
                    "No hay datos de producto registrados actualmente. No es posible calcular el valor del inventario.");
            return -1;
        }
        return precioUnitario * cantidadInventario;
    }

    static void mostrarResumen() {
        if (!hayProductoRegistrado()) {
            System.out.println("No hay datos de producto registrados actualmente.");
        } else {
            double valorTotal = calcularValorInventario();

            System.out.println("--- Resumen del Producto ---");
            System.out.println("Nombre: " + nombreProducto);
            System.out.printf("Precio Unitario: $%,.2f%n", precioUnitario);
            System.out.println("Cantidad en Inventario: " + cantidadInventario);
            System.out.printf("Valor Total en Inventario: $%,.2f%n", valorTotal);
            System.out.println("Estado del Stock: " + obtenerEstadoStock());
        }
    }

    static String obtenerEstadoStock() {
        if (cantidadInventario < 5) {
            return "Stock bajo";
        } else if (cantidadInventario <= 20) {
            return "Stock suficiente";
        } else {
            return "Stock alto";
        }
    }

    static void limpiarDatos() {
        nombreProducto = "N/A";
        precioUnitario = 0.0;
        cantidadInventario = 0;
        System.out.println("Los datos del producto actual han sido borrados exitosamente.");
    }

    static boolean validarPrecio(double precio) {
        return precio > 0;
    }

    static boolean validarCantidad(int cantidad) {
        return cantidad >= 0;
    }

    static boolean validarNombreProducto(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    static boolean hayProductoRegistrado() {
        return !nombreProducto.equals("N/A");
    }
}
