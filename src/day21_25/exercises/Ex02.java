package day21_25.exercises;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
        32. Faça um algoritmo que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a condição:
        • “F1”, se N <= 10
        • “F2”, se N > 10 e N <= 100
        • “F3”, se n > 100
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("indique o valor de N?");
        int N = entrada.nextInt();

        if ( N <= 10 ) {
            System.out.println("F1");
        } else if (N > 10  ||  N <= 100) {
            System.out.println("F2");
        } else if ( N > 100 ) {
            System.out.println("F3");
        }

        entrada.close();
    }
}