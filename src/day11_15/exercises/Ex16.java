package day11_15.exercises;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        /*
        23. Faça um algoritmo que leia dois números nas variáveis NumA e NumB, nessa
        ordem, e imprima em ordem inversa, isto é, se os dados lidos forem 5 e 9, por
        exemplo, devem ser impressos na ordem 9 e 5.
        */

        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um valor inteiro:?");
        int numA = entrada.nextInt();

        System.out.println("insira o segundo valor inteiro:?");
        int numB = entrada.nextInt();

        System.out.println("em ordem inversa:");
        System.out.println(numB);
        System.out.println(numA);

        entrada.close();
    }
}
