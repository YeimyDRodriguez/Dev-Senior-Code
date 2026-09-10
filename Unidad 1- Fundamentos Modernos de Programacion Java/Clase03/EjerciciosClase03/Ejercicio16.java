
import java.util.Scanner;
/*
Escriba un programa que permita ingresar un número mientras estos sean negativos. 
Detener cuando el número ingresado sea positivo y de cómo resultado la cantidad de números negativos ingresados.
*/

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorNegativos = 0;

        do {
            System.out.print("Ingrese un número (positivo para terminar): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                contadorNegativos++;
            }

        } while (numero < 0);

        System.out.println("Cantidad de números negativos ingresados: " + contadorNegativos);
    }
}
