package day21_25.exercises;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*
        38. Faça um algoritmo que leia os valores A, B e C. Mostre uma mensagem que
        informe se a soma de A com B é menor, maior ou igual a C.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("indique o valor para A:?");
        int valueA = input.nextInt();

        System.out.println("indique o valor para B:?");
        int valueB = input.nextInt();

        System.out.println("indique o valor para C:?");
        int valueC = input.nextInt();

        int somaAplusB = ( valueA + valueB );

        if ( somaAplusB > valueC ) {
            System.out.printf(" a soma de A:%s  e B:%s e:%s e maior que C:%s." , valueA , valueB, somaAplusB, valueC);
        } else if ( somaAplusB < valueC ) {
            System.out.printf(" a soma de A:%s  e B:%s e:%s e sao menores que C:%s." , valueA , valueB, somaAplusB, valueC);
        } else if ( somaAplusB == valueC ) {
            System.out.printf(" a soma de A:%s  e B:%s e:%s e sao iguais que C:%s." , valueA , valueB, somaAplusB, valueC);
        }

        input.close();
    }
}