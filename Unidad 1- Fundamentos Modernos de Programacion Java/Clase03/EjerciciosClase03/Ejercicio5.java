
import java.util.Scanner;

/*
Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.
*/
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== IDENTIFICADOR DE VOCAL O CONSONANTE ======");
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().toLowerCase().charAt(0); // Convierte a minúscula y toma el primer carácter

        // Proceso de identificación
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra " + letra + " es una vocal.");
        } else if (!Character.isLetter(letra)) {
            System.out.println("El carácter " + letra + " no es una letra válida.");
        } else {
            System.out.println("La letra" + letra + " es una consonante.");

        }
        scanner.close();
    }
}
