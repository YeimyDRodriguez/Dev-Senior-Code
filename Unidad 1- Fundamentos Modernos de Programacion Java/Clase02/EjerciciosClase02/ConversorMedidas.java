
import java.util.Scanner;

public class ConversorMedidas {
    public static final double CM_POR_METRO = 100.0;
    public static final double LIBRAS_POR_KG = 2.20462;
    public static final double FACTOR_CELSIUS_FATHRENHEIT = 1.8;
    public static final double OFFSET_FATHRENHEIT = 32.0;

    // práctica
    public static final double MILLAS_POR_KM = 0.621371;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= CONVERSOR DE MEDIDAS =======");

        // conversion de metros a centimetros
        System.out.print("Ingrese la cantidad en metros:  ");
        double metro = scanner.nextDouble();

        // calculo
        double centimetros = metro * CM_POR_METRO;
        System.out.printf("%.2f metros son %.2f centimetros.%n", metro, centimetros);

        // conversion de kilogramos a libras
        System.out.print("Ingrese la cantidad en kilogramos:  ");
        double kilogramos = scanner.nextDouble();

        // Calculo
        double libras = kilogramos * LIBRAS_POR_KG;
        System.out.printf("%.2f kilogramos son %.2f libras.%n", kilogramos, libras);

        // Conversion de celsius a fathrenheit
        System.out.print("Ingrese la temperatura en grados Celsius:  ");
        double celsius = scanner.nextDouble();

        // Calculo
        double fathrenheit = (celsius * FACTOR_CELSIUS_FATHRENHEIT) + OFFSET_FATHRENHEIT;
        System.out.print("grados Celsius son " + fathrenheit + " grados Fathrenheit. \n");

        // práctica: conversion de kilometros a millas
        System.out.print("Ingrese la distancia en kilometros:  ");
        double kilometros = scanner.nextDouble();

        // Calculo
        double millas = kilometros * MILLAS_POR_KM;
        System.out.printf("%.2f kilometros son %.2f millas.%n", kilometros, millas);

        System.out.println("============= CONVERSIONES COMPLETAS, GRACIAS!==============");

        // Cierre del scanner
        scanner.close();
    }

}
