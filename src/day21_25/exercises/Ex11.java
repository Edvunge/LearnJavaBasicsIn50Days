package day21_25.exercises;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        /*
        52. Faça um algoritmo que leia dois números e indique se são iguais ou se são
        diferentes. Mostre o maior e o menor (nesta sequência).
        */

        Scanner input = new Scanner(System.in);
        int numberOne = (int) ( Math.random() * 100000 );
        int numberTwo = (int) ( Math.random() * 100000 );

        System.out.println("o primeiro numero: " + numberOne);
        System.out.println("o segundo numero: " + numberTwo);

        // sao iguais?
        if ( numberOne == numberTwo ) {
            System.out.printf("o numero: %d e o numero: %d sao iguais.",numberOne ,numberTwo );
        }

        System.out.printf("%n");

        // sao diferentes
        if ( numberOne != numberTwo ) {
            System.out.printf("o numero: %d e o numero: %d sao diferentes.", numberOne ,numberTwo );
        }

        System.out.printf("%n");

        // qual o maior
        if ( numberOne > numberTwo ) {
            System.out.printf("o primeiro numero: %d e o maior", numberOne);
        } else
        if ( numberOne < numberTwo ) {
            System.out.printf("o segundo numero: %d e o maior", numberTwo);
        }

        System.out.printf("%n");

        // qual o menor
        if ( numberOne < numberTwo ) {
            System.out.printf("o primeiro numero: %d e o menor", numberOne);
        } else
        if ( numberOne > numberTwo ) {
            System.out.printf("o segundo numero: %d e o menor", numberTwo);
        }
        System.out.printf("%n");
        input.close();
    }
}