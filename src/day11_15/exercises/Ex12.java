package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        /*
        18. Faça um algoritmo que leia os valores de COMPRIMENTO, LARGURA e
        ALTURA e apresente o valor do volume de uma caixa retangular. Utilize para o
        cálculo a fórmula VOLUME = COMPRIMENTO * LARGURA * ALTURA.
         */
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println(" indica o comprimento?");
        double comprimento = input.nextDouble();

        System.out.println(" indica a largura?");
        double largura = input.nextDouble();

        System.out.println("indique a altura?");
        double altura = input.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.printf("o valor do volume: %.3f" , volume);

        input.close();
    }
}