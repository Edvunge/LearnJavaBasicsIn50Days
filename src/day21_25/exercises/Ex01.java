package day21_25.exercises;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // 31. Faça um algoritmo que leia dois números A e B e imprima o maior deles.

        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero?");
        int numberA = input.nextInt();

        System.out.println("indique um numero?");
        int numberB = input.nextInt();

        if ( numberA > numberB ) {
            System.out.println("e o maior numero " + numberA);
        } else {
            System.out.println("e o maior numero " + numberB);
        }

        input.close();
    }
}
