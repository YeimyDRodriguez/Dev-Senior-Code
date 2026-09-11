import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws Exception {

        List<Producto> productos = List.of(
                new Producto("Laptop", "Categoria A", 10),
                new Producto("Telefono2", "Categoria B", 20),
                new Producto("Laptop2", "Categoria A", 30),
                new Producto("Tablet", "Categoria C", 40),
                new Producto("Telefono", "Categoria B", 50));

        // ejemploGroupingBySumingInt(productos);
        // ejemploGroupingByConParametros(productos);
        // ejemploSumingInt(productos);
        // ejemploSummarizingInt(productos);
        // ejemploGroupingBySummarizingInt(productos);
        ejemploPartitioninBy(productos);

        var resultado = productos.stream()
                // A partir de este método empieza el flujo de datos
                .collect(Collectors.groupingBy(Producto::getCategoria)); // Agrupa los elementos del flujo por categoría

        resultado.forEach((categoria, lista) -> {

            // System.out.println("Categoria: " + categoria);

            // lista.forEach(producto -> System.out.println(producto.getNombre()));
        });
    }

    public static void ejemploGroupingBy() {

    }

    public static void ejemploGroupingByConParametros(List<Producto> productos) {

        var resultado = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.counting()));
        resultado.forEach((categoria, valor) -> {
            System.out.println("Categoria: " + categoria);
            System.out.println(valor);
        });
    }

    public static void ejemploSumingInt(List<Producto> productos) {
        var resultado = productos.stream()
                .collect(Collectors.summingInt(Producto::getPrecio));
        System.out.println("Suma de precios: " + resultado);
    }

    public static void ejemploGroupingBySumingInt(List<Producto> productos) {
        var resultado = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.summingInt(Producto::getPrecio)));
        resultado.forEach((categoria, total) -> {
            System.out.printf("Categoria: %s, Total: %d\n", categoria, total);

        });

    }

    public static void ejemploSummarizingInt(List<Producto> productos) {
        var resultado = productos.stream()
                .collect(Collectors.summarizingInt(Producto::getPrecio));

        System.out.println("Cantidad: " + resultado.getCount());
        System.out.println("Suma: " + resultado.getSum());
        System.out.println("Minimo: " + resultado.getMin());
        System.out.println("Maximo: " + resultado.getMax());
        System.out.println("Promedio: " + resultado.getAverage());
    }

    public static void ejemploGroupingBySummarizingInt(List<Producto> productos) {
        var resultado = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.summarizingInt(Producto::getPrecio)));
        resultado.forEach((Key, Value) -> {
            System.out.println("Categoria: " + Key);
            System.out.println("Total: " + Value.getSum());
            System.out.println("Promedio: " + Value.getAverage());
        });
    }

    public static void ejemploPartitioninBy(List<Producto> productos) {

        var resultado = productos.stream()
                .collect(Collectors.partitioningBy(
                        producto -> producto.getPrecio() >= 35));

        resultado.forEach((key, value) -> {

            System.out.println("Es mayor o igual a 35: " + key);

            value.forEach(producto -> System.out.println(producto.getNombre()));
        });
    }

}