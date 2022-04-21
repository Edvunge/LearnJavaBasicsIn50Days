package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
        12. Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a
        convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5,
        na qual F é a temperatura em Fahrenheit e C é a temperatura em Celsius;
         */

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("indique a temperatura em Celsius:?");
        double celsius = entrada.nextDouble();

        double fahrenheit = ( ( 9 * celsius + 160 )  /  5 );

        System.out.printf(" a temperatura em fahrenheit: %.2f " , fahrenheit );

        entrada.close();
    }
}
