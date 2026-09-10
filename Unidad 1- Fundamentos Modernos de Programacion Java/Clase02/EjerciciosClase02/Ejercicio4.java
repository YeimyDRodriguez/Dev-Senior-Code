
import java.util.Scanner;

/*
La posibilidad de ir al cine entre semana pagando un precio reducido es una tradición en las salas de cine españolas,
lo que se conoce como El día del espectador. En algunos cines, el día del espectador suele ser los miércoles y las entradas
se reducen hasta en un 70%. La única pega es que suele ir mucha más gente...

Para aprovechar el día del espectador, Carmen decide ir al cine con sus amigos y sale de su casa con 23€. 
Al regresar se da cuenta que le quedan 12.75€ ¿Sabrías programar cuánto se ha gastado?
*/

public class Ejercicio4 {
    /*
     * public static void main(String[] args) {
     * 
     * System.out.println("====== DIA DEL ESPECTADOR EN EL CINE ======");
     * 
     * double dineroInicial = 23.0;
     * double dineroFinal = 12.75;
     * 
     * double dineroGastado = dineroInicial - dineroFinal;
     * 
     * System.out.printf("Carmen se ha gastado: %.2f euros\n", dineroGastado);
     * 
     * System.out.
     * println("Gracias por usar el sistema de calculo de gastos en el cine.");
     * 
     * }
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====== DIA DEL ESPECTADOR EN EL CINE ======");

        System.out.print("Ingrese el dinero con el que has salido de casa: ");
        double dineroInicial = scanner.nextDouble();

        System.out.print("Ingrese el dinero que te queda al regresar a casa: ");
        double dineroFinal = scanner.nextDouble();

        //Calculo
        double dineroGastado = dineroInicial - dineroFinal;

        //Resultado
        System.out.printf("Carmen se ha gastado: %.2f euros\n", dineroGastado);
        System.out.println("Gracias por usar el sistema de calculo de gastos en el cine.");
        scanner.close();
    }
}
