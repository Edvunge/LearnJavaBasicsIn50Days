package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        /*
        14. Faça um algoritmo que calcule e apresente o valor do volume de uma lata de
        óleo, utilizando a fórmula VOLUME = 3,14159 * RAIO2 * ALTURA.
         */

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("indique o valor do raio? ");
        double raio = entrada.nextDouble();

        System.out.println("indique o valor da altura:? ");
        double altura = entrada.nextDouble();

        double volume = ( 3.14159 * ( raio * raio ) * altura );

        System.out.printf("o valor do volume e de: %.2f " , volume);
        entrada.close();
    }
}
