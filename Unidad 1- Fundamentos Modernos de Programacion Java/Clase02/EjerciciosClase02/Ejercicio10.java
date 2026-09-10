
import java.util.Scanner;

/*
Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.
*/
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== CALCULO DE LA MEDIA ARITMETICA ======");

        System.out.println("Ingrese el primer número: ");
        double numeroUno = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double numeroDos = scanner.nextDouble();

        System.out.println("Ingrese el tercer número: ");
        double numeroTres = scanner.nextDouble();

        // Cálculo
        double mediaAritmetica = (numeroUno + numeroDos + numeroTres) / 3;
        // Resultado
        System.out.println("\n===== RESULTADO =====");
        System.out.println("La media aritmética es: " + mediaAritmetica);
        System.out.println("\n===== FIN =====");
        scanner.close();
    }

}
