package day11_15.exercises;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /*
        19. Faça um algoritmo que leia um valor inteiro e apresente os resultados do
        quadrado e do cubo do valor lido.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira um valor inteiro:?");
        int value = entrada.nextInt();

        int resultValueQuadrado = ( value * value );
        int resultValueCubo = ( value * value * value );


        System.out.println("o valor iniciado foi: "+value);
        System.out.println("o valor iniciado do resultado pelo quadrado: "+resultValueQuadrado);
        System.out.println("o valor iniciado do resultado pelo cubo:  "+resultValueCubo);

        entrada.close();
    }
}
