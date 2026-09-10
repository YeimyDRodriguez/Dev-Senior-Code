import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        ejemplo1();
        ejemplo2();
        ejemplo3();
    }

    public static void ejemplo1() {

        List<Integer> resultado = new ArrayList<>();

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // 1. Recorrer la lista de números
        // 2. Quedarnos con los números pares comparando una condición
        // 3. Multiplicar cada número de la lista de pares por 2
        // 4. Imprimir el resultado final

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                resultado.add(numero * 2);
            }
        }
        System.out.println(resultado);
    }

    public static void ejemplo2() {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtrar los números pares
                .map(numero -> numero * 2) // Multiplicar cada número por 2
                .forEach(System.out::println); // Imprimir el resultado final

        /*
         * [1, 2, 3, 4, 5, 6]
         * ↓
         * filter()
         * ↓
         * [2, 4, 6]
         * ↓
         * map()
         * ↓
         * [4, 8, 12]
         * ↓
         * forEach()
         * ↓
         * IMPRESORA → consola
         */

    }

    public static void ejemplo3() {
        Function<String, Integer> longitud = s -> s.length();
        System.out.println("\nAplicando expresión lambda mediante una Function: ");
        System.out.println(longitud.apply("Hola"));

    }

    public static void ejemplo4() {

        List<String> nombres = Arrays.asList("Ana", "Pedro", "Juan", "Maria", "Lucia", "Carlos");

        List<String> nombresConA = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .collect(Collectors.toList());

        List<Integer> longitudes = nombres.stream()
                .map(String::length)
                .collect(Collectors.toList());

        List<String> ordenar = nombres.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nEjemplo 4:");

        System.out.println("Nombres con A: " + nombresConA);
        System.out.println("Longitudes: " + longitudes);
        System.out.println("Nombres ordenados: " + ordenar);
    }

}