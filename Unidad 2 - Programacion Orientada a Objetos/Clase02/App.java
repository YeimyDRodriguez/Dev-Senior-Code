
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;
        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            ejecutarOpcion(opcion);
        } while (opcion != 3);
        sc.close();
    }

    public static void menu() {
        System.out.println("------ Menú de Empleados -----");
        System.out.println("1. Crear Gerente");
        System.out.println("2. Crear Desarrollador");
        System.out.println("3. Salir");
        System.out.print("Opción: ");

    }

    public static void ejecutarOpcion(int opcion) {

        String nombre, id;
        double salarioBase, bono;
        String lenguaje;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese nombre: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese ID: ");
                id = sc.nextLine();
                System.out.println("Ingrese salario base: ");
                salarioBase = sc.nextDouble();
                System.out.println("Ingrese bono actual: ");
                bono = sc.nextDouble();

                Gerente gerente = new Gerente(nombre, id, salarioBase, bono);
                System.out.println("Se ha creado exitosamente el gerente: ");
                gerente.mostrarDetalles();

                break;
            case 2:
                System.out.println("Ingrese nombre: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese ID: ");
                id = sc.nextLine();
                System.out.println("Ingrese salario base: ");
                salarioBase = sc.nextDouble();
                System.out.println("Ingrese bono actual: ");
                bono = sc.nextDouble();
                System.out.println("Ingrese lenguaje principal: (Java | otros) ");
                lenguaje = sc.nextLine();

                Desarrollador desarrolador = new Desarrollador(nombre, id, salarioBase, lenguaje);
                System.out.println("Se ha creado exitosamente el desarrollador: ");
                desarrolador.mostrarDetalles();

                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;

            default:
                break;
        }
    }
}
