
import java.util.Scanner;
/*
Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la cantidad de 
unidades que le compren. La siguiente tabla muestra la información:

Unidades	Precio por unidad
[1 - 50]	$50.000
(50 - 100]	$45.000
(100 - 150]	$40.000
(150 - 200]	$35.000
> 200	$25.000
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("==== PRECIOS CAMISAS ====");
        System.out.print("¿Cuántas unidades compró?");
        int unidades = scanner.nextInt(); 

        if (unidades >= 1 && unidades <= 50){
            System.out.println("Precio por unidad: $50.000");
        }else if(unidades >= 50 && unidades <= 100){
            System.out.println("Precio por unidad: $45.000");
        }else if(unidades >= 100 && unidades <= 150){
            System.out.println("Precio por unidad: $40.000");
        }else if(unidades >= 150 && unidades <= 200){
            System.out.println("Precio por unidad: $35.000");
        }else if(unidades > 200){
            System.out.println("Precio por unidad: $25.000");
        }else{
            System.out.println("Precio invalido");
        }
        scanner.close();
    }
}
