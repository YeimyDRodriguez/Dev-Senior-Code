
import java.util.Scanner;

/*
Escriba un programa que permita ingresar un número real e 
identifique si el número es negativo, positivo o cero.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== IDENTIFICADOR DE NUMERO ======");
        System.out.print("Ingrese un número real: ");
        double numero = scanner.nextDouble();
        // Identificación
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El númer" + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        scanner.close();
    }
}
