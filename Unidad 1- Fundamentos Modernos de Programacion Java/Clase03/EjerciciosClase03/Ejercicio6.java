
import java.util.Scanner;

/*
Escriba un programa que permita ingresar un número y determine si es divisible por dos y siete
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== IDENTIFICADOR DE DIVISIBILIDAD POR 2 Y 7 ======");
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 && numero % 7 == 0) {
            System.out.println("El número " + numero + " es divisible por 2 y por 7");
        } else if (numero % 7 == 0) {
            System.out.println("El número " + numero + " es divisible por 7");
        } else if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es divisible por 2");
        } else {
            System.out.println("El número " + numero + " no es divisible por 2 ni por 7");
        }
        scanner.close();
    }

}
