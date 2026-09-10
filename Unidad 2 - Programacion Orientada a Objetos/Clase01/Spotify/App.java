
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos las canciones usando el método
        Cancion c1 = CrearCancion();
        Cancion c2 = CrearCancion();
        Cancion c3 = CrearCancion();

        // Simulamos reproducciones
        c1.reproducir();
        c1.reproducir();
        c1.reproducir();
        c1.reproducir();
        c1.reproducir();

        c2.reproducir();
        c2.reproducir();
        c2.reproducir();
        c2.reproducir();
        c2.reproducir();
        c2.reproducir();
        c2.reproducir();

        c3.reproducir();

        // Determinar la canción más reproducida
        if (c2.getRepro() > c1.getRepro() && c2.getRepro() > c3.getRepro()) {
            System.out.println("La canción más reproducida es: " + c2);
        } else if (c3.getRepro() > c1.getRepro() && c3.getRepro() > c2.getRepro()) {
            System.out.println("La canción más reproducida es: " + c3);
        } else {
            System.out.println("La canción más reproducida es: " + c1);
        }

        sc.close();
    }

    public static Cancion CrearCancion() {
        Scanner sc = new Scanner(System.in);
        String nombre, artista;
        int duracion;

        System.out.print("Ingrese el nombre de la canción: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el nombre del artista: ");
        artista = sc.nextLine();
        System.out.print("Ingrese duración: ");
        duracion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        return new Cancion(nombre, artista, duracion);
    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ingresar canción nueva");
            System.out.println("2. Mirar ranking de canciones");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción ingresar canción");
                    break;
                case 2:
                    System.out.println("Opción ranking");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }
}
