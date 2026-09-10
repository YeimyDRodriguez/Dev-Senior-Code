
import java.util.Scanner;
/*
Escriba una función en la que ingrese un número entero entre 1 y 12. Este número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). El resultado debe ser el número de días del mes ingresado.
Ejemplo:

Input : 12
Output : 31

A continuación encuentras la cantidad de días que tienen cada mes.

Mes	Días
1, 3, 5, 7, 8, 10 y 12	31
4, 6, 9, 11	30
2	28
*/
public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("==== MES ====");
        System.out.print("Ingrese un número entre 1 y 12: ");
        int mes = scanner.nextInt(); 

        int dias;

        switch (mes) {
            case 1: 
            case 3: 
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;

            case 2:
                dias = 28;
                break;

            default:
                System.out.println("Número inválido. Debe ser entre 1 y 12.");
                return; 
        }

        System.out.println("El mes " + mes + " tiene " + dias + " días.");
    }
}
