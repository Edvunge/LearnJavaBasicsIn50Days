package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
        13. Faça um algoritmo que leia uma temperatura em Fahrenheit e a apresente
        convertida em graus Celsius. A fórmula de conversão é C = (F – 32) * ( 5 / 9), na
        qual F é a temperatura em Fahrenheit e C é a temperatura em Celcius.
         */

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("indique a temperatura em fahrenheit:?");
        double fahrenheit = entrada.nextDouble();

        double celsius = ( ( fahrenheit - 32 ) * ( 5 / 9 ) );

        System.out.printf(" a temperatura em celsius e: %.2f " , celsius );

        entrada.close();
    }
}
