
import java.util.Scanner;

public class CalculadoraModular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        mostrarBienvenida();

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Contar números pares en un rango");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Haz seleccionado la opción de SUMA");
                    System.out.print("Ingrese el primer número: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b1 = scanner.nextDouble();

                    double resultadoSuma = sumar(a1, b1);
                    imprimirResultado("Suma", resultadoSuma);
                    break;

                case 2:
                    System.out.println("Haz seleccionado la opción de RESTA");
                    System.out.print("Ingrese el primer número: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b2 = scanner.nextDouble();

                    double resultadoResta = resta(a2, b2);
                    imprimirResultado("Resta", resultadoResta);
                    break;

                case 3:
                    System.out.println("Haz seleccionado la opción MULTIPLICACIÓN");
                    System.out.print("Ingrese el primer número: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b3 = scanner.nextDouble();

                    double resultadoMultiplicacion = multiplicacion(a3, b3);
                    imprimirResultado("Multiplicación", resultadoMultiplicacion);
                    break;

                case 4:
                    System.out.println("Haz seleccionado la opción de DIVISIÓN");
                    System.out.print("Ingrese el primer número: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b4 = scanner.nextDouble();

                    double resultadoDivision = division(a4, b4);
                    imprimirResultado("División", resultadoDivision);
                    break;

                case 5:
                    System.out.println("Haz seleccionado la opción de CONTAR PARES EN UN RANGO");
                    System.out.print("Ingrese el número inicial del rango: ");
                    int inicio = scanner.nextInt();
                    System.out.print("Ingrese el número final del rango: ");
                    int fin = scanner.nextInt();
                    System.out.println("Números pares en el rango:");
                    contarPares(inicio, fin);
                    break;

                default:
                    System.out.println("Opción no válida. ");
                    break;
            }
        } while (opcion != 0);

    }

    static void mostrarBienvenida() {
        System.out.println("=== BIENVENIDO A LA CALCULADORA MODULAR === \n");
    }

    static void imprimirResultado(String operacion, double resultado) {
        System.out.printf("Resultado de %s: %.2f%n", operacion, resultado);
    }

    static double sumar(double a, double b) {
        double resultadoSuma = a + b;
        return resultadoSuma;
    }

    static double resta(double a, double b) {
        double resultadoResta = a - b;
        return resultadoResta;
    }

    static double multiplicacion(double a, double b) {
        double resultadoMultiplicacion = a * b;
        return resultadoMultiplicacion;
    }

    static double division(double a, double b) {
        if (b != 0) {
            double resultadoDivision = a / b;
            return resultadoDivision;
        } else {
            System.out.println("Error: División por cero no permitida.");
            return 0;
        }
    }

    static void contarPares(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
