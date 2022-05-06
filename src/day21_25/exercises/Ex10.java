package day21_25.exercises;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 51. Faça um algoritmo que leia dois números e mostre qual o maior dos dois.

        Scanner input = new Scanner(System.in);
        int numberOne = (int) ( Math.random() * 100000 );
        int numberTwo = (int) ( Math.random() * 100000 );

        System.out.println("o primeiro numero: " + numberOne);
        System.out.println("o segundo numero: " + numberTwo);


        if ( numberOne > numberTwo ) {
            System.out.printf("o primeiro numero: %d e o maior", numberOne);
        } else
                if ( numberOne < numberTwo ) {
                    System.out.printf("o segundo numero: %d e o maior", numberTwo);
                }
        input.close();
    }
}