package day11_15.exercises;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        /*
        20. Faça um algoritmo que leia dois valores inteiros (A e B) e apresente o resultado
        do quadrado da soma dos valores lidos.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira um valor inteiro:?");
        int value = entrada.nextInt();

        System.out.println("insira o segundo valor inteiro:?");
        int secondValue = entrada.nextInt();

        int resultQuadradoDaSoma = ( ( value * secondValue ) + ( value * secondValue ) );

        System.out.println("o valor iniciado em value foi: "+value);
        System.out.println("o valor iniciado em second value foi: "+secondValue);
        System.out.println("o valor resultante do quadrado da soma: "+resultQuadradoDaSoma);

        entrada.close();
    }
}