
import java.util.Scanner;
/*
Escriba un programa en el que ingrese un número y le diga si es positivo o negativo. 
Repita el proceso hasta que se ingrese el número cero.
*/

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El número es POSITIVO.");
            } else if (numero < 0) {
                System.out.println("El número es NEGATIVO.");
            }

        } while (numero != 0);

        System.out.println("Programa finalizado. Ingresó el número cero.");
    }
}
