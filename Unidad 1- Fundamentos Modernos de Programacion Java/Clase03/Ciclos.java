
import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        // Ciclo_While();
        // Ciclo_for();
        // for_Break();
        // for_continue();
        // Ciclo_While2();
        // ciclo_do_while();
        operador_Ternario2();

    }

    public static void Ciclo_While() {

        int contador = 0; // Inicialización de una variable de control del bucle

        while (contador <= 5) { // Condición: el bucle se repite mientras 'contador' sea menor que 5
            System.out.println("Iteración: " + contador);
            contador++; // Actualización: incrementa 'contador' en 1. ¡Esto es CRUCIAL!
        }
        System.out.println("linea fuera del bucle.");
        // Salida:
        // Iteración: 0
        // Iteración: 1
        // Iteración: 2
        // Iteración: 3
        // Iteración: 4
        // Cuando contador llega a 5, la condición (5 < 5) es false, y el bucle termina.
    }

    public static void Ciclo_for() {
        // Sintaxis: for (inicialización; condición; actualización) { // código }
        // boolean esDiaLaboral = true;
        for (int i = 1; i <= 3; i++) { // i empieza en 1; el bucle continúa mientras i <= 10; i se incrementa en 1
                                       // después de cada iteración
            System.out.println("Contando: " + i);
        }
        // Salida:
        // Contando: 1
        // Contando: 3
        // ...
        // Contando: 10
    }

    public static void for_Break() {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Encontrado el número 5. Saliendo del bucle.");
                break; // Sale del bucle for
            }
            System.out.println("Procesando: " + i);
        }
        System.out.println("Después del bucle.");
        // Salida:
        // Procesando: 1
        // Procesando: 2
        // Procesando: 3
        // Procesando: 4
        // Encontrado el número 5. Saliendo del bucle.
        // Después del bucle.
    }

    public static void for_continue() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // Si i es impar...
                System.out.println("Saltando número impar: " + i);
                continue; // Salta el resto del código en esta iteración (el println de abajo)
            }
            // Este código solo se ejecuta si i es par
            System.out.println("Procesando número par: " + i);
        }
        // Salida:
        // Saltando número impar: 1
        // Procesando número par: 2
        // Saltando número impar: 3
        // Procesando número par: 4
        // ... y así sucesivamente.
    }

    public static void Ciclo_While2() {
        // validar si un numero ingrsado es positivo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número positivo:");
        int numero = sc.nextInt();

        while (numero < 0) {
            System.out.println("El número es negativo. Ingrese un número positivo:");
            numero = sc.nextInt();
        }

        System.out.println("Gracias! Has ingresado el número positivo: " + numero);

    }

    public static void ciclo_do_while() {
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0); // La condición se evalúa después de la primera ejecución y en cada iteración
                               // subsiguiente

        System.out.println("Número ingresado: " + numero);
        scanner.close();
        // Este bucle siempre pedirá un número al menos una vez. Si el primer número es
        // positivo, la condición es false y el bucle termina. Si no, seguirá pidiendo
        // hasta que se ingrese uno positivo.
    }

    public static void operador_Ternario() {
        int edad = 20;
        String mensaje;

        // Usando if-else:
        if (edad >= 18) {
            mensaje = "Mayor de edad";
        } else {
            mensaje = "Menor de edad";
        }
        System.out.println(mensaje); // Salida: Mayor de edad

        // Usando el operador ternario (equivalente al if-else anterior):
        String mensajeTernario = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensajeTernario); // Salida: Mayor de edad

        // Otro ejemplo:
        int num = 10;
        String tipoNumero = (num % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es: " + tipoNumero); // Salida: El número es: Par
    }

    public static void operador_Ternario2() {
        int a = 5;
        int b = 10;

        // Usando if-else para encontrar el mayor
        int mayor;
        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }
        System.out.println("El mayor usando if-else es: " + mayor);

        // Usando operador ternario para encontrar el mayor
        int mayorTernario = (a > b) ? a : b;
        System.out.println("El mayor usando operador ternario es: " + mayorTernario);
    }

}