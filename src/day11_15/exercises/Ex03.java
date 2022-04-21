package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        8. Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula
        area igual a base multiplicada pela altura e devidida por dois
        􀬶 . Utilize as variáveis AREA, BASE e ALTURA e os
        operadores aritméticos de multiplicação e divisão.
         */

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        final float PI = 3.14159F;

        System.out.println("indique o valor da base:? ");
        double base = entrada.nextDouble();

        System.out.println("indique o valor da altura:? ");
        double altura = entrada.nextDouble();

        double area = (  ( base * altura ) / 2 );

        System.out.printf(" o valor da area: %.2f " , area);

        entrada.close();

    }
}
