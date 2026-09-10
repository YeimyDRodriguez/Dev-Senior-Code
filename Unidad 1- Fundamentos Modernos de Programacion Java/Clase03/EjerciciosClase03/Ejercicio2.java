
import java.util.Scanner;
/*
Escriba un programa que le permita ingresar tres números e 
imprima en la consola el más grande de ellos.
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== IDENTIFICADOR DE NUMERO MAYOR ======");
        System.out.println("Ingrese el primer número: ");
        double numeroUno = scanner.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double numeroDos = scanner.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        double numeroTres = scanner.nextDouble();

        double numeroMayor = numeroUno;

        if (numeroDos > numeroMayor) {
            numeroMayor = numeroDos;
        }
        if (numeroTres > numeroMayor) {
            numeroMayor = numeroTres;
        }
        System.out.println("El número mayor es: " + numeroMayor);
        scanner.close();
    }
}
