package day21_25.exercises;

public class Ex13 {
    public static void main(String[] args) {

        /*
        59. Faça um algoritmo que leia um número inteiro e mostre uma mensagem
        indicando se este número é par ou ímpar e se é positivo ou negativo.
        */

        int min = -1000;
        int max = 1000;

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);

        if ( random_int % 2 == 0 ) {
            System.out.println("O numero e PAR.");
        } else {
            System.out.println("O numero e IMPAR");
        }

        System.out.printf("%n");

        if ( random_int > 0 ) {
            System.out.println("O numero e POSITIVO.");
        } else {
            System.out.println("O numero e NEGATIVO.");
        }
    }
}