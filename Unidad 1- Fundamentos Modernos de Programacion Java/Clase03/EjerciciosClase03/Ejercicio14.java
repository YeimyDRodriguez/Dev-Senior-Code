
import java.util.Scanner;
/*
Realice un programa en el que ingrese un número y muestre el cubo. 
Repita el proceso hasta que se introduzca un valor negativo.
*/

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número (negativo para salir): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                int cubo = numero * numero * numero;
                System.out.println("El cubo de " + numero + " es: " + cubo);
            }

        } while (numero >= 0);

        System.out.println("Programa finalizado. Ingresó un número negativo.");
    }
}
