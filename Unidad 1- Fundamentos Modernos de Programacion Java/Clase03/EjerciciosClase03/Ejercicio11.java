
import java.util.Arrays;
import java.util.Scanner;

/*
Escriba una función en la que pueda ingresar tres números enteros y diferentes. Imprima estos valores en orden ascendente.
Por ejemplo:

Input : 3 , 100 , 1
Output : 13100
Tenga en cuenta que la respuesta es un texto. Los números los puede concatenar.
*/
public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres números enteros y diferentes:");

        int numeroUno = scanner.nextInt();
        int numeroDos = scanner.nextInt();
        int numeroTres = scanner.nextInt();

        int[] numeros = { numeroUno, numeroDos, numeroTres };

        Arrays.sort(numeros);

        String resultado = "" + numeros[0] + numeros[1] + numeros[2];

        System.out.println("Resultado: " + resultado);
    }
}
