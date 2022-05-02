package day21_25.exercises;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        34. Construa um algoritmo que receba como entrada três valores e os imprima em
        ordem crescente.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero?");
        int numberA = input.nextInt();

        System.out.println("indique um numero?");
        int numberB = input.nextInt();

        System.out.println("indique um novo numero?");
        int numberC = input.nextInt();

        if ( (numberA > numberB  || numberA > numberC) || (numberB > numberC) ) {
            System.out.println(numberA);
            System.out.println(numberB);
            System.out.println(numberC);
        } else if ( (numberA > numberB  || numberA > numberC) || (numberB < numberC) ) {
            System.out.println(numberA);
            System.out.println(numberC);
            System.out.println(numberB);
        } else if ( (numberA < numberB  || numberB > numberC) || (numberA > numberC) ) {
            System.out.println(numberB);
            System.out.println(numberA);
            System.out.println(numberC);
        } else if ( (numberA < numberB  || numberB > numberC) || (numberA < numberC) ) {
            System.out.println(numberB);
            System.out.println(numberC);
            System.out.println(numberA);
        } else if ( ( numberC > numberA  || numberC > numberB ) || ( numberA > numberB ) ) {
            System.out.println(numberC);
            System.out.println(numberA);
            System.out.println(numberB);
        } else if ( ( numberC > numberA  || numberC > numberB ) || ( numberA < numberB ) ) {
            System.out.println(numberC);
            System.out.println(numberB);
            System.out.println(numberA);
        }

        input.close();
    }
}