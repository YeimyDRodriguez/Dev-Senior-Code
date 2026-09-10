
/* 
En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.
¿Cuál es el resultado correcto de la operación? ¿1 ó 9? */

//import java.util.Scanner;
//6 / 2 ( 1 + 2 )
/*public class Ejercicio1 {
    public static final int VALOR_UNO = 6;
    public static final int VALOR_DOS = 2;
    public static final int VALOR_TRES = 1;
    public static final int VALOR_CUATRO = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var operacion = VALOR_UNO / VALOR_DOS * (VALOR_TRES + VALOR_CUATRO);

        System.out.println("El resultado de la operacion es: " + operacion);
        var resultadoEsperado = scanner.nextInt();

        System.out.println("El resultado esperado es: " + resultadoEsperado);
    }
    
}
*/

/*public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= OPERACIÓN MATEMÁTICA =======");
        System.out.println("Operación: 6 / 2 (1 + 2)");

        System.out.print("Ingrese el primer valor (6): ");
        int valorUno = scanner.nextInt();

        System.out.print("Ingrese el segundo valor (2): ");
        int valorDos = scanner.nextInt();

        System.out.print("Ingrese el tercer valor (1): ");
        int valorTres = scanner.nextInt();

        System.out.print("Ingrese el cuarto valor (2): ");
        int valorCuatro = scanner.nextInt();

        int operacion = valorUno / valorDos * (valorTres + valorCuatro);

        System.out.println("\nEl resultado de la operación es: " + operacion);

        scanner.close();
    }
}
*/

public class Ejercicio1 {
    public static void main(String[] args) {

        int a = 6;
        int b = 2;
        int c = 1;
        int d = 2;
        int resultado = a / b * (c + d);
        System.out.println("El resultado de la operacion es: " + resultado);

    }
}
