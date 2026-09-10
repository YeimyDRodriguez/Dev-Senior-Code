import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo {

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();

    }

    public static void ejercicio1() {

        /*
         * Dada una lista de objetos de tipo Empleado,
         * cada uno con los atributos nombre y salario,
         * filtra los empleados que tienen un salario mayor a 50000
         * y cuenta cuántos empleados cumplen con esta condición.
         */

        var empleados = List.of(
                new Empleado("Juan", 60000),
                new Empleado("María", 45000),
                new Empleado("Pedro", 70000),
                new Empleado("Ana", 55000),
                new Empleado("Luis", 40000)
        );

        long cantidad = empleados.stream()
                .filter(empleado -> empleado.getSalario() > 50000)
                .count();

        System.out.println(
                "Número de empleados que ganan más de 50000: " + cantidad
        );
    }

    public static void ejercicio2(){

        var palabras = List.of("Hola", "Mundo", "Java", "Streams", "Lambda");
        var agrupadas = palabras.stream()
                .collect(Collectors.groupingBy(palabra -> palabra.length()));
        for (var entry : agrupadas.entrySet()) { 
            System.out.println("Longitud: " + entry.getKey() + ", Palabras: " + entry.getValue());
        }
    }
}