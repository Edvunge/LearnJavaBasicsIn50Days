package day11_15.exercises;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
/*
    25. Faça um algoritmo que leia dois números inteiros (Int1 e Int2) e imprima o
    quociente e o resto da divisão inteira de Int1 por Int2.
 */
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um valor inteiro:?");
        int int1 = entrada.nextInt();

        System.out.println("insira o segundo valor inteiro:?");
        int int2 = entrada.nextInt();

        int quociente = ( int1 / int2 );

        System.out.println("o resultado do quociente e :" + quociente);
        entrada.close();
    }
}