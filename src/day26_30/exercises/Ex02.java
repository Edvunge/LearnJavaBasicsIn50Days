package day26_30.exercises;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
        73. Faça um programa, utilizando estrutura de condição, que receba um número
        real, digitado pelo usuário e mostre o menu para selecionar o tipo de cálculo que
        deve ser realizado:

        101-Raiz quadrada
        102-A metade
        103-10% do número
        104-O dobro
        Escolha a opção:
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println(" indique a operacao deseja.");
        int operacaoDesejada = entrada.nextInt();

        switch ( operacaoDesejada ) {
            case 101:
                System.out.println("Raiz quadrada");
                break;
            case 102:
                System.out.println("A metade");
                break;
            case 103:
                System.out.println("10% do numero");
                break;
            case 104:
                System.out.println(" O dobro ");
                break;
            default:
                System.out.println("indique um outro.");
        }
        entrada.close();
    }
}