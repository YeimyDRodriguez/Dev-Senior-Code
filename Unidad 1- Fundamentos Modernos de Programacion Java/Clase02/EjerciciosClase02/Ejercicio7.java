
import java.util.Scanner;
/*

Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, 
resta, multiplicación y división con esos números. Muestra los resultados en la consola.

*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====== CALCULADORA BASICA ======");

        System.out.print("Ingrese el primer numero: ");
        double numeroUno = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numeroDos = scanner.nextDouble();    

        //Calculos 
        double suma = numeroUno + numeroDos; 
        double resta = numeroUno - numeroDos;
        double multiplicacion = numeroUno * numeroDos;
        double division = numeroUno / numeroDos;

        //Resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);

        System.out.println("\n===== Gracias por usar la calculadora basica. =====");
        scanner.close();
    }
    
}
