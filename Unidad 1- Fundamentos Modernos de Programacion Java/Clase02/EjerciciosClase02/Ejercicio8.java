
import java.util.Scanner;

/*
Crea un programa que calcule el área y el perímetro de un rectángulo. 
Solicita al usuario la longitud y el ancho del rectángulo.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====== CALCULO DE AREA Y PERIMETRO DE UN RECTANGULO ======");

        System.out.println("Ingrese la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        System.out.println("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        // Cálculos
        double area = longitud * ancho;
        double perimetro = 2 * (longitud + ancho);

        // Resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("\n===== FIN =====");
        scanner.close();

    }

}
