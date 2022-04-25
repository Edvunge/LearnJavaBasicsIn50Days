package day11_15.exercises;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        /*
        22. Faça um algoritmo que leia dois números nas variáveis Val1 e Val2, calcule sua
        média na variável Media e imprima seu valor.
        */

        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um valor inteiro:?");
        int val1 = entrada.nextInt();

        System.out.println("insira o segundo valor inteiro:?");
        int val2 = entrada.nextInt();

        int media = ( ( val1 + val2 ) / 2 );
        System.out.println("o valor resultante da media e: " + media);

        entrada.close();
    }
}
