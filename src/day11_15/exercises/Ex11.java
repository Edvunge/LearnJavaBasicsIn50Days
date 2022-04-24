package day11_15.exercises;

public class Ex11 {
    public static void main(String[] args) {
        /*
        16. Faça um algoritmo que leia dois valores para as variáveis A e B e efetue a troca
        dos valores de forma que a variável A passe a possuir o valor da variável B e a
        variável B passe a possuir o valor da variável A. Apresente os valores trocados.
         */

        double valorA = 23;
        double valorB = 1.8;

        double variavelTroca = valorA;

        valorA = valorB;

        System.out.println("valor A: "+variavelTroca);
        System.out.println("valor B: "+valorB);


    }
}
