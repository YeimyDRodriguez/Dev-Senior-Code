
import java.util.Scanner;

/*
Escribe un programa que convierta una temperatura dada en grados Celsius 
a grados Fahrenheit y Kelvin. Usa las siguientes fórmulas:
Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15
*/
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== CONVERTIDOR DE TEMPERATURAS ======");
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        // Cálculos
        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;
        // Resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("La temperatura en grados Fahrenheit es: %.2f\n", fahrenheit);
        System.out.printf("La temperatura en grados Kelvin es: %.2f\n", kelvin);
        System.out.println("\n===== FIN =====");
        scanner.close();

    }

}
