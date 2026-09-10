
public class Condicionales {
    public static void main(String[] args) {
        EjemploIf();
    }

    public static void EjemploIf() {
        int numero = 10;

        if (numero > 0) {
            // Este código se ejecuta SOLO si 'numero' es mayor que 0
            System.out.println("El número es positivo.");
        }

    }

    public static void EjemploIfElse() {
        int numero = 7;

        if (numero % 2 == 0) { // Si el residuo de la división por 2 es 0, es par
            System.out.println("El número es par.");
        } else { // Si la condición del if es false...
            System.out.println("El número es impar.");
        }
    }

    public static void EjemploIfElseIf() {
        int calificacion = 85;

        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 80) { // Se evalúa SOLO si la primera condición (calificacion >= 90) fue false
            System.out.println("Muy Bien");
        } else if (calificacion >= 70) { // Se evalúa SOLO si las condiciones anteriores fueron false
            System.out.println("Bien");
        } else { // Se ejecuta si ninguna de las condiciones anteriores fue true
            System.out.println("Necesita mejorar");
        }
    }

    public static void stwichCase() {
        int diaSemana = 3; // 1=Lunes, 2=Martes, etc.
        String nombreDia;

        switch (diaSemana) { // La variable a evaluar
            case 1: // Si diaSemana es 1...
                nombreDia = "Lunes";
                break; // Importante: sale del switch después de ejecutar el código del case
            case 2: // Si diaSemana es 2...
                nombreDia = "Martes";
                break;
            case 3: // Si diaSemana es 3...
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6: // Múltiples casos pueden compartir el mismo bloque de código
            case 7:
                nombreDia = "Fin de semana";
                break;
            default: // Opcional: se ejecuta si el valor de diaSemana no coincide con ningún 'case'
                nombreDia = "Día inválido";
                break; // Es buena práctica poner break incluso en el default
        }
        System.out.println("El día es: " + nombreDia); // Salida: El día es: Miércoles
    }

    public static void EjemploDosSwitchCase() {

        int diaSemana = 3; // 1=Lunes, 2=Martes, etc.

        // Usando switch expression para asignar un valor a una variable
        String nombreDiaModerno = switch (diaSemana) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6, 7 -> "Fin de semana"; // Múltiples casos separados por coma
            default -> "Día inválido";
        }; // Nota el punto y coma al final de la expresión switch

        System.out.println("El día (moderno) es: " + nombreDiaModerno); // Salida: El día (moderno) es: Miércoles
    }

    public static void OtroEjemploSwitchCase() {

        // También puedes usar bloques con 'yield' si necesitas más de una línea de
        // código en un case
        int mes = 4;
        int diasEnMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                // Lógica más compleja si es necesario
                System.out.println("Considerando Febrero...");
                yield 28; // 'yield' devuelve el valor para este case
            }
            default -> {
                System.out.println("Mes inválido.");
                yield -1; // Devuelve -1 para un mes inválido
            }
        };
        System.out.println("Días en el mes " + mes + ": " + diasEnMes);
    }
}