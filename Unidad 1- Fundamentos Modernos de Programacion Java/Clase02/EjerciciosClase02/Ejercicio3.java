
import java.util.Scanner;

/*
El agua de las granjas de Minnesota, Iowa, Illinois, Wisconsin, Missouri, Tennesse, Arkansas, Misssissipi y Louisiana 
desemboca en el Océano Atlántico produciendo un fenómeno llamado zona muerta. Debido a los altos niveles de nitrógeno y 
fósforo que traen estas aguas los peces mueren en grandes cantidades.

Para evitar que mueran cientos y cientos de peces, la ONG Salvemos los peces de colores ha decidido poner en cuarentena a 284 
peces rojos y 163 peces azules en un gigantesco acuario, para devolverlos al mar cuando estén curados. 
¿Cuántos peces hay en total dentro del acuario?
*/

public class Ejercicio3 {

    public static final int PECES_ROJOS = 284;
    public static final int PECES_AZULES = 163;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== CUARENTENA DE PECES ======");

        int totalPeces = PECES_ROJOS + PECES_AZULES;    
        System.out.println("El total de peces en el acuario es: " + totalPeces);
        System.out.println("Gracias por usar el sistema de conteo de peces en cuarentena.");
        scanner.close();

        
    }
}
