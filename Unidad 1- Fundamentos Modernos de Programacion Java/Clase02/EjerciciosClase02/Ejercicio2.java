
import java.util.Scanner;

/*
En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. 
Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. 
¿Crees que es correcto el precio?
En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.
*/


public class Ejercicio2 {

    public static final double GRAMOS_POR_KG = 1000.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====== PRECIO POR KILOGRAMO DEL PRODUCTO ======");

        System.out.print("Ingrese el precio por kilogramo del producto: ");
        double precioPorKg = scanner.nextDouble();
        System.out.print("Ingrese el peso del producto en gramos: ");
        double pesoEnGramos = scanner.nextDouble();
        // Calculo
        double pesoEnKg = precioPorKg * (GRAMOS_POR_KG / pesoEnGramos);
        System.out.printf("El precio del producto es: %.2f\n", pesoEnKg);

        System.out.println("Gracias por usar el sistema de calculo de precios por kilogramo.");
        scanner.close();
    }
}
