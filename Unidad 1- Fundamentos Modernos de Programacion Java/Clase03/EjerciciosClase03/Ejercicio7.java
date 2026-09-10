
import java.util.Scanner;

/*
Escriba un programa que permita ingresar tres números (representan la longitud de una línea) y
compruebe si con estos números se puede formar un triángulo.
*/
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== COMPROBAR FORMACIÓN DE UN TRIÁNGULO =====");
        System.out.print("Ingrese la primer longitud: ");
        double numeroUno = scanner.nextDouble();
        System.out.print("Ingrese la segunda longitud: ");
        double numeroDos = scanner.nextDouble();
        System.out.print("Ingrese la tercera longitud: ");
        double numeroTres = scanner.nextDouble();

        if (numeroUno + numeroDos > numeroTres && numeroUno + numeroTres > numeroDos
                && numeroDos + numeroTres > numeroUno) {
            System.out.println("Las longitudes ingresadas SÍ pueden formar un triángulo");
        } else {
            System.out.println("Las longitudes ingresadas NO pueden formar un triángulo");
        }
        scanner.close();
    }
}
