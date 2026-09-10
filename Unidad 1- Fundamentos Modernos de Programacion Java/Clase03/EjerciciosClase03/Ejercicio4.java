
import java.util.Scanner;

/*
Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula.
*/
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== IDENTIFICADOR DE LETRA MAYUSCULA O MINUSCULA ======");

        System.out.println("Ingrese una letra: ");
        char letra = scanner.next().charAt(0); // Lee el primer carácter de la entrada

        // Proceso de identificación
        if (Character.isUpperCase(letra)) { //isUpperCase verifica si el carácter es mayúscula
            System.out.println("La letra " + letra + " es mayúscula.");
        } else if (Character.isLowerCase(letra)) { //isLowerCase verifica si el carácter es minúscula
            System.out.println("La letra " + letra + " es minúscula.");
        } else {
            System.out.println("El carácter " + letra + " no es una letra válida.");
        }
        scanner.close();
    }

}
