
import java.util.Scanner;

/*
Menú que calcular el Área de una Figura (sub-opción: Círculo o Rectángulo).
Calcula Edad Futura.
Sale del programa.
*/
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("--- Menú de Opciones ---\n");
            System.out.println("1. Calcular Área de una Figura (Circulo o Rectángulo).");
            System.out.println("2. Calcular Edad Futura.");
            System.out.println("3. Salir.\n");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Sub-menú para seleccionar figura
                    System.out.println("Seleccione la figura para calcular el área:");
                    System.out.print("1. Círculo");
                    System.out.print("2. Rectángulo");
                    int figura = scanner.nextInt();

                    // Calcular el área de una figura (circulo)
                    if (figura == 1) {
                        System.out.print("Ingrese el radio del circulo: ");
                        double radio = scanner.nextDouble();

                        double areaCirculo = Math.PI * Math.pow(radio, 2);

                        System.out.println("El área del círculo es: " + areaCirculo);

                        // Calcular el área de una figura (rectángulo)
                    } else if (figura == 2) {
                        System.out.print("Ingrese la base del rectángulo: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese la altura del rectángulo: ");
                        double altura = scanner.nextDouble();

                        double areaRectangulo = base * altura;

                        System.out.println("El área del rectángulo es: " + areaRectangulo);

                    } else {
                        System.out.println("Opción no válida para la figura.");

                    }
                    break;

                case 2:
                    // Calcular edad futura
                    System.out.print("Ingrese su edad actual: ");
                    int edadActual = scanner.nextInt();
                    System.out.print("Ingrese el número de años a agregar: ");
                    int añosAgregar = scanner.nextInt();
                    
                    int edadFutura = edadActual + añosAgregar;
                    System.out.println("Su edad futura será: " + edadFutura);

                    break;

                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
            }

        } while (opcion != 3);

    }
}