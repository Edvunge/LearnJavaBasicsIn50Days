package day26_30.exercises;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*
        78. Faça um programa que lê quatro valores: I, A, B e C, onde I é um número inteiro
        e positivo e A, B, e C são quaisquer valores reais. O programa deve escrever os
        valores lidos e:

        • se I = 1, escrever os três valores A, B e C em ordem crescente;
        • se I = 2, escrever os três valores A, B e C em ordem decrescente;
        • se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;
        • se I não for um dos três valores acima, dar uma mensagem indicando isto.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println(" indique um valor. ");
        int valoresAleatorios = entrada.nextInt();

        switch ( valoresAleatorios ){
            case 1:
                System.out.println("Primavera");
                break;
            case 2:
                System.out.println("Verao");
                break;
            case 3:
                System.out.println("Outono");
                break;
            case 4:
                System.out.println("Inverno");
                break;
            default:
                System.out.println();
        }
        entrada.close();
    }
}