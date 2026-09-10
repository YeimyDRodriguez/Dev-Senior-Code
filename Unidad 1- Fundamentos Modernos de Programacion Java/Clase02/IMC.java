
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Lector de datos

        double peso;
        double altura;

        System.out.println("Ingrese su peso en kilogramos: ");
        peso = scanner.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        altura = scanner.nextDouble();

        // Limpiar el buffer del scanner
        scanner.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.next();

        // Calculo del IMC
        double imc = peso / ((altura * altura));
        System.out.printf("%s, su índice de masa corporal (IMC) es: %.2f%n", nombre, imc);

        System.out.println("¿IMC menor que 18.5? " + (imc < 18.5));
        System.out.println("¿IMC esta entre 18.5 y 24.9? " + (imc > 18.5 && imc <= 24.9));
        System.out.println("¿IMC esta entre 25 y 29.9? " + (imc >= 25));

    }
}
