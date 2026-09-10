
import java.util.Scanner;

/*
Tres hermanos acuerdan reunirse. Los hermanos son identificados por los siguientes números: 
1 para el mayor, 2 para el del medio y 3 para el menor.
Cuando llega la hora de la reunión, uno de los hermanos va tarde. Dados los números de 
los hermanos que llegan a tiempo, determine el número del hermano que llegará tarde.
Por ejemplo:

Input : 1 2
Output : 3
El tercer hermano es el el que llegara a la reunión tarde.
*/
public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los dos hermanos que llegaron a tiempo (1, 2 o 3): ");
        int hermanoUno = scanner.nextInt();
        int hermanoDos = scanner.nextInt();

        int tarde = hermanoTarde(hermanoUno, hermanoDos);

        System.out.println("El hermano que llega tarde es: " + tarde);
    }

    public static int hermanoTarde(int a, int b) {
        return 6 - (a + b);
    }
}
