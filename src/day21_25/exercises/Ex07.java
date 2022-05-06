package day21_25.exercises;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        // 48. Faça um algoritmo que leia 3 números inteiros distintos e escreva o menor deles.

        Scanner entrada = new Scanner(System.in);

        System.out.println("indique o primeiro numero inteiro?");
        int valuePrimeiroNumero = entrada.nextInt();

        System.out.println("indique o segundo numero inteiro?");
        int valueSegundoNumero = entrada.nextInt();

        System.out.println("indique o terceiro numero inteiro?");
        int valueTerceiroNumero = entrada.nextInt();

        if (valuePrimeiroNumero < valueSegundoNumero && valuePrimeiroNumero < valueTerceiroNumero ) {
            System.out.println(" o  menor numero e o primeiro que e: " + valuePrimeiroNumero );
        } else
            if (valuePrimeiroNumero > valueSegundoNumero && valueSegundoNumero < valueTerceiroNumero ) {
            System.out.println(" o  menor numero e o segundo que e: " + valueSegundoNumero );
        } else
            if (valuePrimeiroNumero > valueTerceiroNumero && valueSegundoNumero > valueTerceiroNumero ) {
                System.out.println(" o  menor numero e o terceiro que e: " + valueTerceiroNumero );
            }
        entrada.close();
    }
}