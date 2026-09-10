
import java.util.Scanner;

/*
Escriba un programa que permita ingresar un número (va a representar la cantidad de años) y
de como respuesta la etapa en la que se encuentra la persona de acuerdo con la siguiente tabla.

Años	Etapas
0 - 5	Primera infancia
6 - 11	Infancia
12 - 18	Adolescencia
19 - 26	Juventud
27 - 59	Adultez
> 59	Persona mayor
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Representar edad ====");
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 5) {
            System.out.println("Etapa: Primera infancia");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("Etapa: infancia");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Etapa: Adolescencia");
        } else if (edad >= 19 && edad <= 26) {
            System.out.println("Etapa: Juventud");
        } else if (edad >= 27 && edad <= 59) {
            System.out.println("Etapa: Adultez");
        } else if (edad > 59) {
            System.out.println("Etapa: Persona Mayor");
        } else {
            System.out.println("Edad fuera de los rangos definidos");
        }
        scanner.close();

    }

}
